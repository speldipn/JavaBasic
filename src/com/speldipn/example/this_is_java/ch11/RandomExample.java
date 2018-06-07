package com.speldipn.example.this_is_java.ch11;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class RandomExample {
  public static void main(String[] args) {
    int[] selectNumber = new int[6];
    Random random = new Random(System.currentTimeMillis());
    System.out.print("선택 번호: ");
    for(int i = 0; i < 6; ++i) {
      selectNumber[i] = random.nextInt(45) + 1;
      System.out.print(selectNumber[i] + " ");
    }
    System.out.println();

    int[] winningNumber = new int[6];
    random = new Random(System.currentTimeMillis());
    System.out.print("당첨 번호: ");
    for(int i = 0; i < 6; ++i) {
      winningNumber[i] = random.nextInt(45) + 1;
      System.out.print(winningNumber[i] + " ");
    }
    System.out.println();

    Arrays.sort(selectNumber);
    Arrays.sort(winningNumber);
    boolean result = Arrays.equals(selectNumber, winningNumber);
    System.out.print("당첨 여부: ");
    if(result) {
      System.out.println("1등에 당첨되셨습니다.");
    } else {
      System.out.println("당첨되지 않았습니다.");
    }

    // 같은 종자값을 주는경우는 당첨될 확률히 급상승됨.
  }
}
