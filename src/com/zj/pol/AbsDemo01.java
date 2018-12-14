package com.zj.pol;

abstract class Person {
    private int age;
    private String name;
    public Person(int age,String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public abstract void want();
}
class Student extends Person {
    private int score;

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public Student(int age, String name, int score) {
        super(age,name);
        this.score = score;
    }

    @Override
    public void want() {
        System.out.println(getAge() + " " + getName() + " " + getScore());
    }
}
class Worker extends Person {
    private int money;

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    public Worker(int age,String name,int money) {
        super(age,name);
        this.money = money;
    }

    @Override
    public void want() {
        System.out.println(getAge() + " " + getName() + " " + getMoney());
    }
}
public class AbsDemo01 {
    public static void main(String[] args) {
        Student s = new Student(10,"xiaoming",100);
        Worker w = new Worker(35,"daming",1000);
        s.want();
        w.want();
    }
}
