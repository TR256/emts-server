package com.emts.generator;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.*;
import java.util.*;

public class CodeGenerator {

    private static final String URL = "jdbc:mysql://localhost:3306/emts?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static final String projectPath = System.getProperty("user.dir");


    public static void generateServerCode(List<String> tables, Map<String, Object> map) {
//        DataSourceConfig dataSourceConfig = new DataSourceConfig.Builder(URL, USERNAME, PASSWORD).build();
        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
                .globalConfig(builder -> {
                    builder.fileOverride()
                            .outputDir(projectPath)
                            .author("MengXH")
                            .enableSwagger()
                            .commentDate("yyyy-MM-dd")
                            .dateType(DateType.ONLY_DATE)//Date类型
                            .build();
                })
                .templateConfig(builder -> {
                    builder.disable(TemplateType.ENTITY) // 禁用模板
                            .entity("/templates/entity.java")// 设置模板路径
                            .service("/templates/service.java")
                            .serviceImpl("/templates/serviceImpl.java")
                            .mapper("/templates/mapper.java")
                            .mapperXml("/templates/mapper.xml")
                            .controller("/templates/controller.java")
                            .build();
                })
                .packageConfig(builder -> {
                    Map<OutputFile, String> pathInfoMap = new HashMap<>();
                    pathInfoMap.put(OutputFile.controller, String.format("%s/emts-web/src/main/java/com/emts/web/%s", projectPath, map.get("module")));
                    pathInfoMap.put(OutputFile.serviceImpl, String.format("%s/emts-service-impl/src/main/java/com/emts/service/impl/%s", projectPath, map.get("module")));
                    pathInfoMap.put(OutputFile.service, String.format("%s/emts-service/src/main/java/com/emts/service/%s", projectPath, map.get("module")));
                    pathInfoMap.put(OutputFile.mapper, String.format("%s/emts-dao/src/main/java/com/emts/dao/%s", projectPath, map.get("module")));
                    pathInfoMap.put(OutputFile.mapperXml, String.format("%s/emts-dao/src/main/resources/mapper/%s", projectPath, map.get("module")));
                    pathInfoMap.put(OutputFile.entity, String.format("%s/emts-entity/src/main/java/com/emts/entity/%s", projectPath, map.get("module")));
                    builder.pathInfo(pathInfoMap)
                            .build();
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables)
                            .serviceBuilder()
                            .formatServiceFileName("I%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .entityBuilder()
                            .formatFileName("%sEntity")
                            .addSuperEntityColumns("version", "create_by", "create_time", "update_by", "update_time", "enabled")
                            .enableLombok()
                            .enableTableFieldAnnotation()
                            .controllerBuilder()
                            // 映射路径使用连字符格式，而不是驼峰
                            .enableHyphenStyle()
                            .formatFileName("%sController")
                            .enableRestStyle()
                            .mapperBuilder()
                            //生成通用的resultMap
                            .enableBaseResultMap()
                            .superClass(BaseMapper.class)
                            .formatMapperFileName("%sMapper")
                            .enableMapperAnnotation()
                            .formatXmlFileName("%sMapper");
                })
                .injectionConfig(builder -> {
                    builder.customMap(map)
                            .build();
                })
                .execute();

    }

    public static void generateVueCode(String table, String moduleName) throws IOException {
//        DataSourceConfig dataSourceConfig = new DataSourceConfig.Builder(URL, USERNAME, PASSWORD).build();
        Properties properties = new Properties();
        // 设置模板加载路径 为D盘 work文件夹
        System.out.println(projectPath);
        String templatesPath = "src/main/resources/templates";
        properties.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, String.format("%s/emts-generator/%s", projectPath, templatesPath));
        Velocity.init(properties);
        Map<String, Object> params = new HashMap<>();
        params.put("user", "李白");
        // 封装填充参数
        VelocityContext context = new VelocityContext(params);
        // 获取模板
        Template template = Velocity.getTemplate("test.txt.vm", "UTF-8");
        // 创建输出流
        Writer writer = null;
        writer = new PrintWriter(new FileOutputStream(new File("D:\\template.txt")));
        // 模板与数据填充
        template.merge(context, writer);
        writer.flush();
    }


    public static void generateSQL(String table, String moduleName) {
//        DataSourceConfig dataSourceConfig = new DataSourceConfig.Builder(URL, USERNAME, PASSWORD).build();
        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
                .globalConfig(builder -> {
                    builder.fileOverride()
                            .outputDir(projectPath)
                            .author("MengXH")
                            .enableSwagger()
                            .commentDate("yyyy-MM-dd")
                            .dateType(DateType.ONLY_DATE)//Date类型
                            .build();
                })
                .templateConfig(builder -> {
                    builder.disable(TemplateType.ENTITY) // 禁用模板
                            .entity("/templates/entity.java")// 设置模板路径
                            .service("/templates/service.java")
                            .serviceImpl("/templates/serviceImpl.java")
                            .mapper("/templates/mapper.java")
                            .mapperXml("/templates/mapper.xml")
                            .controller("/templates/controller.java")
                            .build();
                })
                .packageConfig(builder -> {
                    Map<OutputFile, String> pathInfoMap = new HashMap<>();
                    pathInfoMap.put(OutputFile.controller, String.format("%s/emts-web/src/main/java/com/emts/web/%s", projectPath, moduleName));
                    pathInfoMap.put(OutputFile.serviceImpl, String.format("%s/emts-service-impl/src/main/java/com/emts/service/impl/%s", projectPath, moduleName));
                    pathInfoMap.put(OutputFile.service, String.format("%s/emts-service/src/main/java/com/emts/service/%s", projectPath, moduleName));
                    pathInfoMap.put(OutputFile.mapper, String.format("%s/emts-dao/src/main/java/com/emts/dao/%s", projectPath, moduleName));
                    pathInfoMap.put(OutputFile.mapperXml, String.format("%s/emts-dao/src/main/resources/mapper/%s", projectPath, moduleName));
                    pathInfoMap.put(OutputFile.entity, String.format("%s/emts-entity/src/main/java/com/emts/entity/%s", projectPath, moduleName));
                    builder.pathInfo(pathInfoMap)
                            .build();
                })
                .strategyConfig(builder -> {
                    builder.addInclude(table)
                            .serviceBuilder()
                            .formatServiceFileName("I%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .entityBuilder()
                            .formatFileName("%sEntity")
                            .addSuperEntityColumns("version", "create_by", "create_time", "update_by", "update_time", "enabled")
                            .enableLombok()
                            .enableTableFieldAnnotation()
                            .controllerBuilder()
                            // 映射路径使用连字符格式，而不是驼峰
                            .enableHyphenStyle()
                            .formatFileName("%sController")
                            .enableRestStyle()
                            .mapperBuilder()
                            //生成通用的resultMap
                            .enableBaseResultMap()
                            .superClass(BaseMapper.class)
                            .formatMapperFileName("%sMapper")
                            .enableMapperAnnotation()
                            .formatXmlFileName("%sMapper");
                })
                .injectionConfig(builder -> {
                    Map<String, Object> map = new HashMap<>();
                    builder.customMap(map)
                            .build();
                })
                .execute();

    }

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));

        List<String> questionTableList = new ArrayList<>();
        questionTableList.add("tq_question");
        questionTableList.add("tq_choice_option");
        questionTableList.add("tq_explanation");
        questionTableList.add("tq_fill");
        questionTableList.add("tq_judge");
        questionTableList.add("tq_material");
        questionTableList.add("tq_problem");
        questionTableList.add("tq_user_answer_history");
        questionTableList.add("tq_user_question_sign");
        Map<String, Object> map = new HashMap<>();
        map.put("module", "question");
//        generateServerCode(questionTableList, map);


        generateVueCode("tq_question", "question");
        //
    }

}
