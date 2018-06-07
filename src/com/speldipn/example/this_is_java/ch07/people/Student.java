package com.speldipn.example.this_is_java.ch07.people;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-20
 */
public class Student extends People {
  public int studentNo;

  public Student(String name, String ssn, int studentNo) {
    super(name, ssn); // 부모생성자 호출.
    this.studentNo = studentNo;
  }
}
