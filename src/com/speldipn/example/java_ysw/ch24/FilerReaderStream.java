package com.speldipn.example.java_ysw.ch24;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class FilerReaderStream {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("hyper.txt");
//        char ch1 = (char)reader.read();
//        char ch2 = (char)reader.read();
//        System.out.println(ch1);
//        System.out.println(ch2);
//        reader.close();

        char cBuf[] = new char[10];
        int readCnt;

        readCnt = reader.read(cBuf, 0, cBuf.length);
        System.out.println("readCnt : " + readCnt);
        for (int i = 0; i < readCnt; ++i) {
            System.out.println(cBuf[i]);
        }
        reader.close();
    }
}
