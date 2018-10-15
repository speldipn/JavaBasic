package com.speldipn.example.java_ysw.ch24;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class PrintWriterStream {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("printf.txt"));
        PrintWriter out = new PrintWriter(writer);

        out.printf("제 나이는 %d살 입니다", 31);
        out.println();

        out.println("저는 자바가 좋습니다.");
        out.print("특히 I/O 부분에서 많은 매력을 느낍니다.");
        out.close();
    }
}
