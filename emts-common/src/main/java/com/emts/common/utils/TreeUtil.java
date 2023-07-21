package com.emts.common.utils;

import com.emts.common.anno.TreeUtilChildren;
import com.emts.common.anno.TreeUtilId;
import com.emts.common.anno.TreeUtilParentId;

import java.lang.reflect.Field;
import java.util.*;

public class TreeUtil<T> {

    private Field idField = null;
    private Field parentIdField = null;
    private Field childrenField = null;

    private Class<T> clazz;
    private List<T> list;
    Map<Object, List<T>> map;

    public TreeUtil(Class<T> clazz, List<T> list) {
        this.clazz = clazz;
        this.list = list;
        groupByParentId();
    }

    private void groupByParentId() {
        try {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (field.getAnnotation(TreeUtilId.class) != null) {
                    idField = field;
                }
                if (field.getAnnotation(TreeUtilParentId.class) != null) {
                    parentIdField = field;
                }
                if (field.getAnnotation(TreeUtilChildren.class) != null) {
                    childrenField = field;
                }
            }
            if (idField == null || parentIdField == null) {
                throw new RuntimeException("can't find id or parentId");
            }
            // 一次遍历，以parentId为键进行分组
            map = new HashMap<>();
            for (T t : list) {
                parentIdField.setAccessible(true);
                Object parentId = parentIdField.get(t);
                List<T> branch = map.get(parentId);
                if (branch == null) {
                    branch = new ArrayList<>();
                }
                branch.add(t);
                map.put(parentId, branch);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public List<T> convertToTree(Object parentId) {
        try {
            List<T> branch = map.get(parentId);
            if (branch == null){
                return null;
            }
            for (T t : branch) {
                idField.setAccessible(true);
                Object id = idField.get(t);
                List<T> children = convertToTree(id);
                childrenField.setAccessible(true);
                childrenField.set(t, children);
            }
            return branch;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
