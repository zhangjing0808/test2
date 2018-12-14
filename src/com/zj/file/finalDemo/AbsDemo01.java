package com.zj.file.finalDemo;
abstract class Abs {
    private int age;
    public void  tell() {

    }
    //抽象方法
    public abstract void say();

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
class AbsDemo extends Abs{
    public void say() {
        System.out.println(getAge());

    }
}
public class AbsDemo01 {
    public static void main(String[] args) {
        AbsDemo a = new AbsDemo();
        a.setAge(20);
        a.say();

    }
}
