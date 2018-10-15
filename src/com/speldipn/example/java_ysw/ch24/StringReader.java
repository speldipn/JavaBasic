package com.speldipn.example.java_ysw.ch24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class StringReader {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("String.txt"));

        String str;
        while (true) {
            str = in.readLine();
            if(str == null)
                break;
            System.out.println(str);
        }
        in.close();
    }
}
