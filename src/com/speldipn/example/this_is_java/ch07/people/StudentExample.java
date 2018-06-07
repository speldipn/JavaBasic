package com.speldipn.example.this_is_java.ch07.people;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-20
 */
public class StudentExample {
  public static void main(String[] args) {
    Student student = new Student("홍길동", "12346-1234567", 1);
    System.out.println("name: " + student.name);
    System.out.println("ssn: " + student.ssn);
    System.out.println("studentNo: " + student.studentNo);
  }
}
