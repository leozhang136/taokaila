package com.taokaila.cms.utils.xml;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-05-28
 * Time: 20:36
 * To change this template use File | Settings | Editor | File and Code Templates.
 * 存储xml对应的数据
 */
public class Node {

    //Node的名字
    private String name;
    //包含的数据 此数据应该与son互斥
    private String data;
    //属性
    private HashMap<String, String> attr;
    //子数据
    private HashMap<String,ArrayList<Node>> son;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public HashMap<String, String> getAttr() {
        return attr;
    }

    public void setAttr(HashMap<String, String> attr) {
        this.attr = attr;
    }

    public HashMap<String, ArrayList<Node>> getSon() {
        return son;
    }

    public void setSon(HashMap<String, ArrayList<Node>> son) {
        this.son = son;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +
                ", attr=" + attr +
                ", son=" + son +
                '}';
    }
}
