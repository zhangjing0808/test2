package com.zj.thisDemo;

class People {
    private String name;
    private int age;
    public People(String name,int age) {
        //this必须在方法的首行
        this();
        this.name = name;
        this.age = age;
    }
    public People() {
        System.out.println("无参数的构造方法");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void tell() {
        System.out.println("姓名：" + this.getName() + ",年龄：" + this.getAge());
    }
}
public class ThisDemo01 {
    public static void main(String[] args) {
        People p = new People("zhangsan",16);
        p.tell();
    }
}
