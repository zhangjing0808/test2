package com.zj.ch04;

public class Test04 {
    public static void main(String[] args) {
        char c = 'a';
        do {
            System.out.println(c + ":" + (int)c);
            c++;
        }while (c <= 'z');
    }
}
