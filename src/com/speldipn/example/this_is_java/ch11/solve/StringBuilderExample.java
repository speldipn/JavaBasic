package com.speldipn.example.ch11.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-16
 */
public class StringBuilderExample {
  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    String str = "";
    //////////////////////////////////////////
    long prevTime = System.nanoTime();
    for(int i = 1; i<=100; ++i) {
      str += i;
    }
    System.out.println(str);
    long curTime = System.nanoTime();
    System.out.println((curTime-prevTime)/1000 + "[us]가 소요되었습니다.");
    System.out.println();

    /////////////////////////////////////////////
    prevTime = System.nanoTime();
    for(int i = 1; i<=100; ++i) {
      stringBuilder.append(i);
    }
    System.out.println(stringBuilder);
    curTime = System.nanoTime();
    System.out.println((curTime-prevTime)/1000 + "[us]가 소요되었습니다.");
  }
}
