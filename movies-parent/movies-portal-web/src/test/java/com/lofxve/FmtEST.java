package com.lofxve;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * @ClassName FmtEST
 * @Author lofxve
 * @Date 2021/1/16 10:03
 * @Version 1.0
 */
public class FmtEST {
    public static void main(String[] args) throws IOException, TemplateException {
        //1. 创建freemark配置对象
        Configuration configuration = new Configuration(Configuration.getVersion());

        //2. 设置模板目录
        configuration.setDirectoryForTemplateLoading(
                new File("D:\\itheima\\lofxve\\movies-parent\\movies-portal-web\\src\\main\\webapp\\ftl"));
        //3. 设置模板字符集
        configuration.setDefaultEncoding("utf-8");

        //4. 加载模板对象
        Template template = configuration.getTemplate("dome.ftl");

        //5. 准备数据模型
        HashMap<Object, Object> map = new HashMap<>();
        map.put("username", "lofxve");

        //6. 设置文件输出位置
        FileWriter fileWriter = new FileWriter("D:\\local\\nginx-1.18.0\\html\\ys\\ftl\\dome.html");

        //7. 文件输出
        template.process(map, fileWriter);

        //8. 释放资源
        fileWriter.close();
    }
}