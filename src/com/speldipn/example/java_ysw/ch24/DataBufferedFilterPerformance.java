package com.speldipn.example.java_ysw.ch24;

import java.io.*;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-15
 */
public class DataBufferedFilterPerformance {

    public static void performanceTest(DataOutputStream dataOut) throws IOException {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; ++i) {
            for (int j = 0; j < 10000; ++j) {
                dataOut.writeDouble(12.345);
            }
        }
        dataOut.flush();
        long endTime = System.currentTimeMillis();
        System.out.println("elapsed time: " + (endTime-startTime));
    }

    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("data1.bin");
        DataOutputStream dataOut = new DataOutputStream(out);
        performanceTest(dataOut);
        dataOut.close();

        out = new FileOutputStream("data1.bin");
        BufferedOutputStream bufFilterOut = new BufferedOutputStream(out);
        dataOut = new DataOutputStream(bufFilterOut);
        performanceTest(dataOut);
        dataOut.close();
    }
}
