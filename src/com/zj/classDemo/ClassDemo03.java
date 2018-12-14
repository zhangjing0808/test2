package com.zj.classDemo;

class People {
    //构造方法
    int age;
    String name;
    public People(int a,String n) {
        System.out.println("hello");
        age = a;
        name = n;
        System.out.println("姓名：" + name + ",年龄：" + age);
    }
}

public class ClassDemo03 {
    public static void main(String[] args) {
        People per = new People(18,"李四 ");
    }
}
