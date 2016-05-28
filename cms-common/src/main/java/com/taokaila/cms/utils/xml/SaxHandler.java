package com.taokaila.cms.utils.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-05-28
 * Time: 20:37
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public class SaxHandler extends DefaultHandler {

    private LinkedList<Node> linkedList =null;
    private Node parent = null;
    private Node self =null;
    private Node root =null;
    private String rootName;
    private StringBuffer value;
    public SaxHandler(String rootName) {
        this.rootName=rootName;
    }

    @Override
    public void startDocument() throws SAXException {
        root = new Node();
        linkedList= new LinkedList<Node>();
        linkedList.addFirst(root);
    }

    @Override
    public void endDocument() throws SAXException {
        linkedList=null;
        parent=null;
        self=null;
    }
    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        self.setData(value.toString());
        linkedList.removeFirst();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        value= new StringBuffer();
        if(qName.equals(rootName)){
            self=root;
        }else{
            self = new Node();
            parent = linkedList.peekFirst();
        }
        self.setName(qName);
        linkedList.addFirst(self);
        //把自己添加到parent里面去
        addSelfInParent(self,parent,qName);
        //填充属性
        int attr =attributes.getLength();
        if(attr>0){
            self.setAttr(new HashMap<String, String>());
        }
        for(int i=0;i<attr;i++){
            self.getAttr().put(attributes.getLocalName(i), attributes.getValue(i));
        }
    }

    /**
     *
     * @param arg0
     * @param arg1
     * @param arg2
     * @throws SAXException
     */
    @Override
    public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
        String tmp =new String(arg0,arg1,arg2);
        tmp= tmp.replaceAll("\\n|\\t+", "").trim();
        value.append(tmp);
    }

    /**
     *
     * @param self
     * @param parent
     * @param key
     */
    private void addSelfInParent(Node self,Node parent,String key) {
        if(parent==null){
            return;
        }else {
            if (parent.getSon() == null) {
                parent.setSon(new HashMap<String, ArrayList<Node>>());
                ArrayList<Node> d = new ArrayList<Node>();
                parent.getSon().put(key, d);
                d.add(self);
            } else {
                if (parent.getSon().containsKey(key)) {
                    parent.getSon().get(key).add(self);
                } else {
                    ArrayList<Node> d = new ArrayList<Node>();
                    parent.getSon().put(key, d);
                    d.add(self);
                }
            }
        }
    }

    public Node getNode() {
        return root;
    }
}
