package com.zj.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用字节流拷贝数据
 */
public class CopyByByteStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("text.txt");
            FileOutputStream fos = new FileOutputStream("new_text.txt");

            byte input[] = new byte[50];
            while (fis.read(input) != -1) {
                fos.write(input);
            }

            fis.close();
            fos.close();
            System.out.println("done");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
