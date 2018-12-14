package com.zj.string;

public class StringDemo05 {
    public static void main(String[] args) {
//        String str = "     Hello@outlook.com";
        StringBuffer str = new StringBuffer();
        str.append("Hello@outlook.com");
        for (int i = 0; i < 100; i++) {
//            str = str + i;
            str.append(i);
        }
//        System.out.println(str);
        System.out.println(str.toString());

    }
}
