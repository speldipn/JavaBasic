package com.speldipn.example.ch07.sovle;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
class Parent {
  public String name;

  public Parent(String name) {
    this.name = name;
  }
}

class Child extends Parent {
  public int studentNo;

  public Child(String name, int studentNo) {
    // 부모 생성자가 사용자 정의되어 있기때문에 반드시 자식 클래스에서 생성자를 호출해줘야 한다.
    super(name);
    this.name = name;
    this.studentNo = studentNo;
  }
}

public class Example05 {
  public static void main(String[] args) {

  }
}
