package com.speldipn.example.java_ysw.ch24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class FilerWriterStream {
    public static void main(String[] args) throws IOException {
        char ch1 = 'A';
        char ch2 = 'B';

        Writer out = new FileWriter("hyper.txt");
        out.write(ch1);
        out.write(ch2);
        out.close();
    }
}
