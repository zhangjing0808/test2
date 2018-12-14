package com.zj.extendsDemo;

class Person {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void tell() {
        System.out.println(getName() + " " + getAge());
    }
}


class Student extends Person{
    private int score;

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public void say() {
        System.out.println(getScore() + " " + getName() + " " + getAge());
    }
}

public class ExtendsDemo01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        s.setName("张三");
        s.setScore(100);
        s.tell();
        s.say();

    }
}
