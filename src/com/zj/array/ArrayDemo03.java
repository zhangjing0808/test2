package com.zj.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int score[] = {22,53,65,44,36,74};//数组的声明
        int max,min;
        max = min = score[0];

        for(int i = 0; i < score.length; i++) {
            if(score[i] > max) {
                max = score[i];
            }
            if(score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
    }
}
