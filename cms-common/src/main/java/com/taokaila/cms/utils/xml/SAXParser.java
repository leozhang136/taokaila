package com.taokaila.cms.utils.xml;

import com.sun.org.apache.xml.internal.resolver.readers.SAXParserHandler;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-05-28
 * Time: 20:39
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public class SAXParser {

    /**
     * 使用SAXParser解析器解析xml
     * @param is
     * @param rootNode
     * @return
     */
    public static Node parseXml(InputStream is,String rootNode){
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            javax.xml.parsers.SAXParser parser = factory.newSAXParser();
            new SAXParserHandler();
            SaxHandler saxHandler=new SaxHandler(rootNode);
            parser.parse(is,saxHandler);
            return saxHandler.getNode();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            System.out.println("ParserConfigurationException:" + e);
        } catch (SAXException e) {
            e.printStackTrace();
            System.out.println("SAXException:" + e);
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException:" + e);
        }finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        InputStream is= null;
        try {
            is=new FileInputStream(new File("E:\\test.xml"));
            Node data =parseXml(is,"hits");
            System.out.println(data);
            if(data != null){
                HashMap<String, ArrayList<Node>> son = data.getSon();
                ArrayList<Node> name = son.get("hit");
                System.out.println(name.get(0).getSon().get("name1").get(0).getData());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
