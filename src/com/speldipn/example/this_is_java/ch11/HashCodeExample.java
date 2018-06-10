package com.speldipn.example.this_is_java.ch11;

import java.util.Objects;
import com.speldipn.example.ch11.Student;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-12
 */
public class HashCodeExample {
  public static void main(String[] args) {
    Student s1 = new Student(1, "홍길동");
    Student s2 = new Student(1, "홍길동");
    System.out.println(s1.hashCode());
    System.out.println(Objects.hashCode(s2)); // 1. 주어진 매개 객체의 해시코드를 리턴.
    // 2. 따라서 두 결과는 같다.
  }
}
