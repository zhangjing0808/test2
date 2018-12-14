package com.zj.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用字节流读取数据
 */
public class ReadByteStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("text.txt");
            byte input[] = new byte[20];
            fis.read(input);

            String inputString = new String(input);
            System.out.println(inputString);
            fis.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
