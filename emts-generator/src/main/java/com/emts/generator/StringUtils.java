package com.emts.generator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    public static boolean isNotEmpty(String str) {
        return str != null && !"".equals(str.trim());
    }

    public static String toCamelCase(String str) {
        String regex = "_(.)";
        Matcher matcher = Pattern.compile(regex).matcher(str);
        while (matcher.find()) {
            String target = matcher.group(1);
            str = str.replaceAll("_"+target, target.toUpperCase());
        }
        return str;
    }

    public static String upperFirst(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
