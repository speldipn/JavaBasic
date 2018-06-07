package com.speldipn.example.ch11.solve;

import java.util.HashMap;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-16
 */
public class StudentExample {
  public static void main(String[] args) {
    HashMap<Student, String> hashMap = new HashMap<>();

    hashMap.put(new Student("1"), "95");

    String score = hashMap.get(new Student("1"));

    System.out.println("1번 학생의 총점: " + score);
  }
}
