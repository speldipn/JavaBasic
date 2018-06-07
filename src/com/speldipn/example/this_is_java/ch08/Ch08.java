package com.speldipn.example.this_is_java.ch08;

public class Ch08 {
  public static void main(String[] args) {
    // 1. (3)
    // 2. (4)
    // 3.
    Cat cat = new Cat();
    Dog dog = new Dog();
    printSound(cat);
    printSound(dog);

    doWork(new OracleDao());
    doWork(new MySql());

    Action act = new Action() {
      @Override
      public void work() {
        System.out.println("복사를 합니다.");
      }
    };
    act.work();

  }

  public static void doWork(DatabaseAccessObject obj) {
    obj.select();
    obj.insert();
    obj.update();
    obj.delete();
  }

  public static void printSound(Soundable s) {
    System.out.println(s.sound());
  }
}

interface Soundable {
  String sound();
}

class Dog implements Soundable {
  @Override
  public String sound() {
    return "멍멍";
  }
}

class Cat implements Soundable {
  @Override
  public String sound() {
    return "야옹";
  }
}

////////////////////////////////////////

interface DatabaseAccessObject {
  public void select();
  public void insert();
  public void delete();
  public void update();

}

class OracleDao implements DatabaseAccessObject {
  static final String THISNAME = "Oracle DB";
  @Override
  public void select() {
    System.out.println(THISNAME + "에서 검색.");
  }

  @Override
  public void insert() {
    System.out.println(THISNAME + "에 삽입.");
  }

  @Override
  public void delete() {
    System.out.println(THISNAME + "에서 삭제.");

  }

  @Override
  public void update() {
    System.out.println(THISNAME + "에 갱신");

  }
}


class MySql implements DatabaseAccessObject {
  static final String THISNAME = "test.MySql DB";
  @Override
  public void select() {
    System.out.println(THISNAME + "에서 검색.");
  }

  @Override
  public void insert() {
    System.out.println(THISNAME + "에 삽입.");
  }

  @Override
  public void delete() {
    System.out.println(THISNAME + "에서 삭제.");

  }

  @Override
  public void update() {
    System.out.println(THISNAME + "에 갱신");

  }
}

/////////////////////////////////////////
interface Action {
  public void work();
}