package com.zj.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用字节流写数据
 */
public class WriteByteStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("textw.txt");
            String outString = "生如逆旅 一苇以航";
            byte output[] = outString.getBytes("UTF-8");
            fos.write(output);
            fos.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
