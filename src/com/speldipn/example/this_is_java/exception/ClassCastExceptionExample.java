package com.speldipn.example.this_is_java.exception;

public class ClassCastExceptionExample {
  public static void main(String[] args) {

    Dog dog = null;
    try {
      dog = new Dog();
      changeDog(dog);
    } catch (Exception e) {
      System.out.println("Dog Cast 실패");
    }


    try {
      Cat cat = new Cat();
      changeDog(cat);
    } catch (Exception e) {
      System.out.println("Cat Cast 실패");
    }
  }

  private static void changeDog(Animal animal) {
    Dog dog = (Dog)animal;
  }

}
