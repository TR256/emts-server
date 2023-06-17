package com.emts.generator;

import java.util.HashMap;
import java.util.Map;

public class JdbcToJavaTypeMapper {

    private static Map<String, String> typeMapperMap = new HashMap<>();

    static {
        typeMapperMap.put(JdbcType.JDBC_TEXT, JavaType.JAVA_STRING);
        typeMapperMap.put(JdbcType.JDBC_TINYTEXT, JavaType.JAVA_STRING);
        typeMapperMap.put(JdbcType.JDBC_CHAR, JavaType.JAVA_STRING);
        typeMapperMap.put(JdbcType.JDBC_VARCHAR, JavaType.JAVA_STRING);
        typeMapperMap.put(JdbcType.JDBC_NVARCHAR, JavaType.JAVA_STRING);
        typeMapperMap.put(JdbcType.JDBC_VARCHAR2, JavaType.JAVA_STRING);

        typeMapperMap.put(JdbcType.JDBC_DATETIME, JavaType.JAVA_DATE);
        typeMapperMap.put(JdbcType.JDBC_DATE, JavaType.JAVA_DATE);
        typeMapperMap.put(JdbcType.JDBC_TIMESTAMP, JavaType.JAVA_DATE);
        typeMapperMap.put(JdbcType.JDBC_TIME, JavaType.JAVA_DATE);


        typeMapperMap.put(JdbcType.JDBC_BIGINT, JavaType.JAVA_LONG);
        typeMapperMap.put(JdbcType.JDBC_DECIMAL, JavaType.JAVA_BIG_DECIMAL);
        typeMapperMap.put(JdbcType.JDBC_FLOAT, JavaType.JAVA_FLOAT);
        typeMapperMap.put(JdbcType.JDBC_DOUBLE, JavaType.JAVA_DOUBLE);

        typeMapperMap.put(JdbcType.JDBC_TINYINT, JavaType.JAVA_INTEGER);
        typeMapperMap.put(JdbcType.JDBC_SMALLINT, JavaType.JAVA_INTEGER);
        typeMapperMap.put(JdbcType.JDBC_MEDIUMINT, JavaType.JAVA_INTEGER);
        typeMapperMap.put(JdbcType.JDBC_INT, JavaType.JAVA_INTEGER);
        typeMapperMap.put(JdbcType.JDBC_NUMBER, JavaType.JAVA_INTEGER);
        typeMapperMap.put(JdbcType.JDBC_INTEGER, JavaType.JAVA_INTEGER);
        typeMapperMap.put(JdbcType.JDBC_BIT, JavaType.JAVA_INTEGER);

    }

    public static String toJavaType(String jdbcType) {
        return typeMapperMap.get(jdbcType);
    }
}
