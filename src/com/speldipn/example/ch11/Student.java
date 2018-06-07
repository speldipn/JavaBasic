package com.speldipn.example.ch11;

import java.util.Objects;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-12
 */
public class Student {
  int sno;
  String name;

  public Student(int sno) {
    this.sno = sno;
  }

  public Student(int sno, String name) {
    this.sno = sno;
     this.name = name;
  }

  @Override
  public int hashCode() {
//    return super.hashCode();
    System.out.println("hashCode() 호출.");
    return Objects.hash(sno, name);
  }
}
