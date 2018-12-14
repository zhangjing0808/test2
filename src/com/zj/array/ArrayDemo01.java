package com.zj.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] score;//数组的声明
        score = new int[3];//为数组开辟内存，实例化
        //数组的下标是从0开始的
        for(int i = 0; i < score.length; i++) {
            score[i] = i*2+1;
        }

        for(int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
}
