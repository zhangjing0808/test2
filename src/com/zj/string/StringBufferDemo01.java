package com.zj.string;

public class StringBufferDemo01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("helloworld");
        System.out.println(sb.toString());
        tell(sb);
        System.out.println(sb.toString());
    }

    public static void tell(StringBuffer s) {
        s.append(" i love you");
    }
}
