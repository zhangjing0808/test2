package com.zj.staticDemo;

class Person {
    String name;
    private static String country = "北京";
    public Person(String name) {
        this.name = name;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Person.country = country;
    }

    public void tell() {
        System.out.println("姓名;" + name + ",出生地：" + country);
    }

}
public class StaticDemo01 {
    public static void main(String[] args) {
        /**
         * 静态属性或方法在对象实例化之前执行
         * */
        Person p1 = new Person("张三");
//        p1.country = "上海";
//        Person.country = "上海";
        Person.setCountry("上海");
        p1.tell();
        Person p2 = new Person("李四");
//        p2.country = "上海";
        p2.tell();
        Person p3 = new Person("王五");
//        p3.country = "上海";
        p1.tell();
    }
}
