package com.speldipn.example.ch11;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-12
 */
public class MemberExample {
  public static void main(String[] args) {
    // 원본 객체 생성
    Member original = new Member("홍길동", 25, new int[]{10, 30, 20, 50, 40}, new Car("BMW 320D"));

    Member cloned = original.getMember();
    cloned.scores[0] = 100;
    cloned.car.model = "Benz";

    System.out.println("[복제 객체의 필드값]");
    System.out.println("name: " + cloned.name);
    System.out.println("age: " + cloned.age);
    for(int i = 0; i < cloned.scores.length; ++i) {
      System.out.print(cloned.scores[i] + " ");
    }
    System.out.println();
    System.out.println("car model: " + cloned.car.model);

    System.out.println();

    System.out.println("[원본 객체의 필드값]");
    System.out.println("name: " + original.name);
    System.out.println("age: " + original.age);
    for(int i = 0; i < original.scores.length; ++i) {
      System.out.print(original.scores[i] + " ");
    }
    System.out.println();
    System.out.println("car model: " + original.car.model);

    System.out.println(original.equals(cloned));
    System.out.println(original == cloned);
    System.out.println(original.hashCode());
    System.out.println(cloned.hashCode());
  }
}
