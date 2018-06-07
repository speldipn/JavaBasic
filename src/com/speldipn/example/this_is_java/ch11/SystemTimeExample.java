package com.speldipn.example.this_is_java.ch11;

public class SystemTimeExample {
  public static void main(String[] args) {
    long time1 = System.nanoTime();

    int sum = 0;
    for(int i = 0; i <= 1000000; ++i) {
      sum += i;
    }

    long time2 = System.nanoTime();

    System.out.println("1~1000000까지의 합: " + sum);
    System.out.println("계산에 " + (time2-time1) + " [ns]가 소요되었습니다.");
    System.out.println("계산에 " + (time2-time1)/1000 + " [us]가 소요되었습니다.");
    System.out.println("계산에 " + (time2-time1)/1000000 + " [ms]가 소요되었습니다.");
  }
}
