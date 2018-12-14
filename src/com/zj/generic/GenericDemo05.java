package com.zj.generic;

interface GenInter<T> {
    public void say();
}
class Gin<T> implements GenInter<T> {
    private String info;

    public Gin(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public void say() {

    }
}
public class GenericDemo05 {
    public static void main(String[] args) {
        Gin<String> g = new Gin<String>("hello");
        System.out.println(g.getInfo());


    }
}
