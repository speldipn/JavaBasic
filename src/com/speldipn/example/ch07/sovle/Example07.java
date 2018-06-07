package com.speldipn.example.ch07.sovle;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
class Tire {
  public void run() {
    System.out.println("일반 타이가 굴러갑니다.");
  }
}

class SnowTire extends Tire {
  @Override
  public void run() {
    System.out.println("스노우 타이어가 굴러갑니다.");
  }
}

public class Example07 {
  public static void main(String[] args) {
    SnowTire snowTire = new SnowTire();
    Tire tire = snowTire;

    snowTire.run();
    tire.run();

    // 실행결과
    // 스노우 타이거 굴러갑니다.
    // 스노우 타이거 굴러갑니다.

    // 8번문항 : (2)
  }
}


