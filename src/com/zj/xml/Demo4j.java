package com.zj.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
/**
 * 使用Dom4j操作XML数据
 */
public class Demo4j {
    public static void main(String[] args) {
        String xmlString = "<root><people>ACELY</people></root>";
        try {
            Document document = DocumentHelper.parseText(xmlString);
            System.out.println(document.asXML());

        }catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
