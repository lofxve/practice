package com.lofxve.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @ClassName XmlDome
 * @Author lofxve
 * @Date 2021/1/2 9:53
 * @Version 1.0
 */
public class XmlDome {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("D:\\itheima\\lofxve\\javaee148\\day15\\resources\\beans.xml");

        // 获取根元素beans
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());

        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            System.out.println("\t"+element.getName());

            String id = element.attributeValue("id");
            String className = element.attributeValue("className");
            System.out.println("\t\tbean元素上属性id的值为:"+id);
            System.out.println("\t\tbean元素上属性className的值为:"+className);

            List<Element>  elements1 = element.elements();
            for (Element element1 : elements1) {
                System.out.println("\t\t\t"+element1.getName());
                //10.使用property元素Element对象中的方法attributeValue,根据属性名获取属性值(name,value)
                String name = element1.attributeValue("name");
                String value = element1.attributeValue("value");
                System.out.println("\t\t\t\tproperty元素上属性name的值为:"+name);
                System.out.println("\t\t\t\tproperty元素上属性value的值为:"+value);
                //11.使用property元素Element对象中的方法getText,获取property元素上的文本
                String text = element1.getText();
                System.out.println("\t\t\t\tproperty元素上文本的值为:"+text);
            }
        }
    }
}