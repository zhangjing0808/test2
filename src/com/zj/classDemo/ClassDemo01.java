package com.zj.classDemo;

class Person {
    String name;
    int age;
    public void tell() {
        System.out.println("姓名：" + name + "，年龄：" + age);
    }
}
public class ClassDemo01 {
    public static void main(String[] args) {

        /**
         * 创建对象
         * 赋值
         *   对象.属性
         *   对象.方法
         * */
        Person per = null;//声明
        per = new Person();//实例化操作

        per.name = "张三";
        per.age = 18;

        per.tell();

    }
}
