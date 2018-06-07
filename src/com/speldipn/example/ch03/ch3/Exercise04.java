package com.speldipn.example.ch03.ch3;

/**
 * Author : Joonyoung Oh
 * Since  : 2018-04-17
 */
public class Exercise04 {
  public static void main(String[] args) {
    final int pencils = 534;
    final int students = 30;

    // 학생 한 명이 가지는 연필 수
    int pencilPerStudent = pencils / students;
    System.out.println(pencilPerStudent);

    int pencilLeft = pencils % students;
    System.out.println(pencilLeft);

    // 정답: 두당 17자루씩 남은건 24자루
  }
}
