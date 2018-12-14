package com.zj.array;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int score[][] = {{100,90},{67,70},{50,78,80}};

        for (int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
