package com.lofxve.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @ClassName XpathDome
 * @Author lofxve
 * @Date 2021/1/2 15:50
 * @Version 1.0
 */
public class XpathDome {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("D:\\itheima\\lofxve\\javaee148\\day15\\resources\\beans.xml");

        // 获取所有元素
        List<Element> list = document.selectNodes("//*");
        for (Element element : list) {
            System.out.println(element.getName());
        }

        // 获取文档中bean的所有子元素
        List<Element> list1 = document.selectNodes("//bean");
        for (Element element : list1) {
            System.out.println(element.getName() + "====>" + element.attributeValue("id"));
        }

        List<Element> list2 = document.selectNodes("//bean[1]");
        for (Element element : list1) {
            System.out.println(element.getName() + "====>" + element.attributeValue("id"));
        }

        System.out.println("-------------------------------------------------------------");
        List<Element> list3 = document.selectNodes("//bean[@className]");
        for (Element element : list3) {
            System.out.println(element.getName() + "====>" + element.attributeValue("id"));
        }

        System.out.println("-------------------------------------------------------------");
        List<Element> list4 = document.selectNodes("//bean[@className='com.lofxve.Dome']");
        for (Element element : list4) {
            System.out.println(element.getName() + "====>" + element.attributeValue("id"));
        }


    }
}