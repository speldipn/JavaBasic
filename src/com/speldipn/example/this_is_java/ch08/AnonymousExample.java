package com.speldipn.example.this_is_java.ch08;

public class AnonymousExample {

  public static void main(String[] args) {
    Anonymous anony = new Anonymous();
    // 익명 객체 필드 사용
    anony.field.wake();
    // 익명 객체 로컬 변수 사용
    anony.method1();
    // 익명 객체 개채값 사용
    anony.method2(
      new Person() {
        @Override
        void wake() {
          System.out.println("8시에 일어납니다.");
          study();
        }

        private void study() {
          System.out.println("공부합니다.");
        }
      }
    );

    /////////////////////////////////////////////////
    System.out.println("===========================\n");

    AnonymousRemote ano = new AnonymousRemote();
    // 익명 객체 필드 사용
    ano.field.turnOn();
    // 익명 객체 로컬 변수 사용
    ano.method1();
    // 익명 객체 매개값 사용
    ano.method2(new RemoteControl() {
      @Override
      public void turnOn() {
        System.out.println("SmartTV를 켭니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("SmartTV를 끕니다.");
      }

      @Override
      public void setVolume(int volume) {

      }

      @Override
      public void setMute(boolean mute) {

      }
    });
  }
}
