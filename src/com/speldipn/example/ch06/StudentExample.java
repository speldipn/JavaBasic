package com.speldipn.example.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class StudentExample {
  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println("s1 변수가 Student 객체를 참조합니다.");

    Student s2 = new Student();
    System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
  }
}
