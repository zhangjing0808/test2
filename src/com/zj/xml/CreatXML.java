package com.zj.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.StringWriter;

/**
 * 使用DOM创建XML文件
 */
public class CreatXML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();
            Element root = document.createElement("Languages");
            root.setAttribute("cat","it");

            //创建标签1
            Element lan1 = document.createElement("lan");
            lan1.setAttribute("id","1");
            Element name1 = document.createElement("name");
            name1.setTextContent("java");
            Element ide1 = document.createElement("ide");
            ide1.setTextContent("eclipse");
            lan1.appendChild(name1);
            lan1.appendChild(ide1);

            //创建标签2
            Element lan2 = document.createElement("lan");
            lan2.setAttribute("id","2");
            Element name2 = document.createElement("name");
            name2.setTextContent("swift");
            Element ide2 = document.createElement("ide");
            ide2.setTextContent("xcode");
            lan2.appendChild(name2);
            lan2.appendChild(ide2);

            //创建标签3
            Element lan3 = document.createElement("lan");
            lan3.setAttribute("id","3");
            Element name3 = document.createElement("name");
            name3.setTextContent("c#");
            Element ide3 = document.createElement("ide");
            ide3.setTextContent("visual studio");
            lan3.appendChild(name3);
            lan3.appendChild(ide3);

            root.appendChild(lan1);
            root.appendChild(lan2);
            root.appendChild(lan3);
            document.appendChild(root);

            //---------------------

            //输出到控制台
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(document),new StreamResult(writer));
            System.out.println(writer.toString());

            //输出到文件
            transformer.transform(new DOMSource(document),new StreamResult(new File("newXML.xml")));
        }catch (ParserConfigurationException e) {
            e.printStackTrace();
        }catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
