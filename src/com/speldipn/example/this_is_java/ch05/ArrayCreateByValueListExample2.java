package com.speldipn.example.this_is_java.ch05;

/**
 * @Author : Oh, Joon young (speldipn)
 * @Since : 2018-04-18
 */
public class ArrayCreateByValueListExample2 {
  public static void main(String[] args) {
    int[] scores;
    scores = new int[]{83, 90, 87};
    int sum1 = 0;
    for (int i = 0; i < 3; ++i) {
      sum1 += scores[i];
    }
    System.out.println("총합: " + sum1);

//    배열 객체를 새로 생성하여 매개변수로 넘겨준다.
    int sum2 = add(new int[]{83, 90, 87});
    System.out.println("총합: " + sum2);
    System.out.println();

    boolean[] arr = new boolean[5];
    for(boolean v: arr) {
      System.out.println(v);
    }
  }

  public static int add(int[] arr) {
    int sum = 0;
    for (int value : arr) {
      sum += value;
    }
    return sum;
  }
}
