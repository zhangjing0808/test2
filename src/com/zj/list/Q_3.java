package com.zj.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q_3 {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<Integer>();
        for (int j = 0; j < 50; j++) {
            int i = (int) (Math.random()*100);
            ints.add(j, i);
        }
        HashMap<Integer, ArrayList<Double>> map = new HashMap<Integer, ArrayList<Double>>();
        ArrayList<Double> d9 = new ArrayList<Double>();
        ArrayList<Double> d1 = new ArrayList<Double>();
        ArrayList<Double> d2 = new ArrayList<Double>();
        ArrayList<Double> d3 = new ArrayList<Double>();
        ArrayList<Double> d4 = new ArrayList<Double>();
        ArrayList<Double> d5 = new ArrayList<Double>();
        ArrayList<Double> d6 = new ArrayList<Double>();
        ArrayList<Double> d7 = new ArrayList<Double>();
        ArrayList<Double> d8 = new ArrayList<Double>();
        ArrayList<Double> d0 = new ArrayList<Double>();
        for (int i = 0; i < 50; i++) {
            int j = ints.get(i);
            double ii = ints.get(i);
            if (j/10 == 1){
                d1.add(ii/10);
            }
            if (j/10 == 2){

                d2.add(ii/10);
            }
            if (j/10 == 3){
                d3.add(ii/10);
            }
            if (j/10 == 4){
                d4.add(ii/10);
            }
            if (j/10 == 5){
                d5.add(ii/10);
            } if (j/10 == 6){
                d6.add(ii/10);
            }
            if (j/10 == 7){
                d7.add(ii/10);
            }
            if (j/10 == 8){
                d8.add(ii/10);
            }
            if (j/10 == 0){
                d0.add(ii/10);
            } if (j/10 == 9){

                d9.add(ii/10);
            }

        }
        map.put(1, d1);
        map.put(2, d2);
        map.put(3, d3);
        map.put(4, d4);
        map.put(5, d5);
        map.put(6, d6);
        map.put(7, d7);
        map.put(8, d8);
        map.put(9, d9);
        map.put(0, d0);
        System.out.println(map);
        Q_3 q_3 = new Q_3();
        map.put(1, q_3.BubbleSort(d1));
        map.put(2, q_3.BubbleSort(d2));
        map.put(3, q_3.BubbleSort(d3));
        map.put(4, q_3.BubbleSort(d4));
        map.put(5, q_3.BubbleSort(d5));
        map.put(6, q_3.BubbleSort(d6));
        map.put(7, q_3.BubbleSort(d7));
        map.put(8, q_3.BubbleSort(d8));
        map.put(9, q_3.BubbleSort(d9));
        map.put(0, q_3.BubbleSort(d0));
        System.out.println(map);
   }
    public ArrayList<Double> BubbleSort(List list){

        Double[] doubles = new Double[list.size()];
        list.toArray(doubles);
        double temp ;
        for(int i = 0 ; i < doubles.length-1; i ++)
        {
            for(int j = 0 ;j < doubles.length-1-i ; j++)
            {
                if(doubles[j] > doubles[j+1])  //交换两数位置
                {
                    temp = doubles[j];
                    doubles[j] = doubles[j+1];
                    doubles[j+1] = temp;
                }
            }
        }
        ArrayList<Double> d = new ArrayList<Double>();
        for (int i = 0; i < doubles.length; i++) {
            d.add(doubles[i]);
        }
       return d;
    }

}

