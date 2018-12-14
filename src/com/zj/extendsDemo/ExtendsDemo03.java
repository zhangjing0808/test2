package com.zj.extendsDemo;

class Father {
    private int age;
    private String name;
    public Father() {
        System.out.println("父类的构造方法");

    }
}
class Son extends Father{
    public Son() {
        System.out.println("子类的构造方法");
    }

}
public class ExtendsDemo03 {
    public static void main(String[] args) {
        Son s = new Son();

    }
}
