package com.speldipn.example.ch11;

import java.util.Arrays;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class EqualsExample {
  public static void main(String[] args) {
    int[][] original = {{1, 2}, {3, 4}};

    System.out.println("[ 얕은 복제후 비교 ]");
    int[][] cloned1 = Arrays.copyOf(original, original.length);
    System.out.println("배열 번지 비교: " + original.equals(cloned1));
    System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1));
    System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));

    System.out.println(original[0].toString());
    System.out.println(cloned1[0].toString());
    System.out.println(original[1].toString());
    System.out.println(cloned1[1].toString());

    System.out.println();

    System.out.println("[ 깊은 복제후 비교");
    int[][] cloned2 = Arrays.copyOf(original, original.length);
    cloned2[0] = Arrays.copyOf(original[0], original[0].length);
    cloned2[1] = Arrays.copyOf(original[1], original[1].length);
    System.out.println("배열 번지 비교: " + original.equals(cloned2));
    System.out.println("1차 배열 항목값 비교; " + Arrays.equals(original, cloned2));
    System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2));

    System.out.println(original[0].toString());
    System.out.println(cloned2[0].toString());
    System.out.println(original[1].toString());
    System.out.println(cloned2[1].toString());
  }
}
