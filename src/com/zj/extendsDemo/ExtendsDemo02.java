package com.zj.extendsDemo;

class People {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Worler extends People {
    public void tell() {
        System.out.println(getAge());
    }

}
//class PetWorker extends Worler {
//    public void tell() {
//        System.out.println(age);
//    }
//}

public class ExtendsDemo02 {
    public static void main(String[] args) {
        Worler w = new Worler();
        w.setAge(20);
        w.tell();

    }
}
