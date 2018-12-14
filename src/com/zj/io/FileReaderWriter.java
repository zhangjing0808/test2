package com.zj.io;

import java.io.*;

/**
 * 使用FileReader与FileWriter读写数据
 */
public class FileReaderWriter {
    public static void main(String[] args) {
        try {
           FileReader fr = new FileReader("text.txt");
           BufferedReader br = new BufferedReader(fr);

           FileWriter fw = new FileWriter("new5_text.txt");
           BufferedWriter bw = new BufferedWriter(fw);

           String line;
           while ((line = br.readLine()) != null) {
               bw.write(line + "\n");
           }
           bw.flush();
           bw.close();
           fw.close();
           br.close();
           fr.close();
            System.out.println("done");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
