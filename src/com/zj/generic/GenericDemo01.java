package com.zj.generic;

class Point<T> {
    private T x;
    private T y;

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }
}
/**
 *经纬度
 * int
 * float
 * String
 *
 */
public class GenericDemo01 {
    public static void main(String[] args) {
       Point<String> p = new Point<String>();
       p.setX("经度为：10");
       p.setY("纬度为：100");
        System.out.println(p.getX() + " " + p.getY());
    }
}
