package com.speldipn.example.ch07.sovle;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
class Parent1 {
  public String nation;

  public Parent1() {
    this("대한민국");
    System.out.println("Parent() call");
  }

  public Parent1(String nation) {
    this.nation = nation;
    System.out.println("Parent(String nation) call");
  }
}

class Child1 extends Parent1 {
  private String name;

  public Child1() {
    this("홍길동");
    System.out.println("Child() call");
  }

  public Child1(String name) {
    this.name = name;
    System.out.println("Child(String name) call");
  }

}

public class Example06 {
  public static void main(String[] args) {
    Child1 child = new Child1();

    // 생성자 호출 순서
    // Parent(String nation) call
    // Parent() call
    // Child(string name) call
    // Child() call

  }
}
