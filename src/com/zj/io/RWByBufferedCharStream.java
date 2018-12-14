package com.zj.io;

import java.io.*;

/**
 * 使用带有缓冲的字符流读写数据
 */
public class RWByBufferedCharStream {
    public static void main(String[] args) {
        try {
            File file = new File("text.txt");
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream("new4_buff_text.txt");
            InputStreamReader isr = new InputStreamReader(fis,"utf-8");
            OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

            BufferedReader br = new BufferedReader(isr);
//            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(osw,true);
            String input;
            while ((input = br.readLine()) != null ) {
//                bw.write(input);
                pw.println(input);
            }

//            pw.flush();
            br.close();
//            bw.flush();
//            bw.close();
            pw.close();
            isr.close();
            fis.close();
            osw.close();
            fos.close();
            System.out.println("done");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
