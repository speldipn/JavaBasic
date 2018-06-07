package com.speldipn.example.this_is_java.ch07.abstracttest;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class AnimalExample {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    dog.sound();
    cat.sound();
    System.out.println("-----");

    Animal animal = null;
    animal = new Dog();
    animal.sound();
    animal = new Cat();
    animal.sound();
    System.out.println("-----");

    animalSound(new Dog());
    animalSound(new Cat());

  }

  private static void animalSound(Animal animal) {
    animal.sound();
  }
}
