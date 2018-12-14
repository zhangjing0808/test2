package com.zj.array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int score[][] = new int[5][5];
        score[0][0] = 9;
        score[0][3] = 8;
        score[3][2] = 7;

        for (int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
