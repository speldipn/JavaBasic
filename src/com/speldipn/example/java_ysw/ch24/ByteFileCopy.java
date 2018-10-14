package com.speldipn.example.java_ysw.ch24;

import java.io.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class ByteFileCopy {
    public static void main(String[] args) throws IOException {
//        System.out.println(System.getProperty("user.dir"));
        InputStream in = new FileInputStream("org.txt");
        OutputStream out = new FileOutputStream("cpy.txt");

        int copyByte = 0;
        int bData;

        while (true) {
            bData = in.read();
            if (bData == (-1))
                break;

            out.write(bData);
            ++copyByte;
        }

        in.close();
        out.close();
        System.out.println("복사된 바이크 크기 : " + copyByte);
    }
}
