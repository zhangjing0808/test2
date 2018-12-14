package com.zj.classDemo;

class Person1 {
    private String name;
    private int age;

    public void tell() {
        System.out.println("姓名：" + getName() + "，年龄：" + getAge());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 150) {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
    public class ClassDemo02 {
    public static void main(String[] args) {
        Person1 per = new Person1();

        per.setName("张三");
        per.setAge(18);
        per.tell();
    }
}
