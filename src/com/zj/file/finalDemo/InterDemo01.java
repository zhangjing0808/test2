package com.zj.file.finalDemo;

interface Inter {
    //全局常量
    public static final int AGE = 100;
    public abstract void tell();
}
interface Inter2 {
    public abstract void say();
}
abstract class Abs1 {
    public abstract void print();
}
class A extends Abs1 implements Inter,Inter2 {
    @Override
    public void tell() {

    }

    @Override
    public void say() {

    }

    @Override
    public void print() {

    }
}

interface Inter3 extends Inter2,Inter {

}
public class InterDemo01 {
    public static void main(String[] args) {
        A a = new A();
        a.tell();
        a.say();
        a.print();
        System.out.println(Inter.AGE);

    }
}
