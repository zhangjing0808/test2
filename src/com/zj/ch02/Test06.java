package com.zj.ch02;

public class Test06 {
    public static void main(String[] args) {
        System.out.println(Byte.MIN_VALUE + "-" + Byte.MAX_VALUE);//最大值最小值范围
        System.out.println(Byte.parseByte("108") + 10);//将字符串转换为字节类型

        System.out.println(Integer.MIN_VALUE + "-" + Integer.MAX_VALUE);//最大值最小值范围
        System.out.println(Integer.parseInt("50000") + 5);//将字符转转换为整数
        System.out.println(Integer.toBinaryString(16));//将十进制转换为十六进制
        System.out.println(Integer.toHexString(16));//将十进制数转换为十六进制数
    }
}
