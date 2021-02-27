package com.lofxve.base.xml.dom;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

public class Dome {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        InputStream input = Dome.class.getResourceAsStream("D:\\桌面\\javase\\src\\date\\pom.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(input);
        System.out.println(doc);
    }
}
