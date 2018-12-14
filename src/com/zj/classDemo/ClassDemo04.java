package com.zj.classDemo;

class Student {
    public void tell() {
        System.out.println("hello");
    }
}
public class ClassDemo04 {
    public static void main(String[] args) {
        //匿名对象
        new Student().tell();
    }
}
