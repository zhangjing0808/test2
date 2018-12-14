package com.zj.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        /**
         * 冒泡排序
         */
        int score[] = {22,53,65,36,74};//数组的声明
        for(int i = 0; i < score.length-1; i++) {
            for(int j = i+1; j < score.length; j++) {
                if(score[i] > score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                }
            }
            System.out.print("第" + (i + 1) + "排序");
            for(int j = 0; j < score.length; j++) {
                System.out.print(score[j] + "  ");
            }
            System.out.println(" ");
        }
        for(int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
}
