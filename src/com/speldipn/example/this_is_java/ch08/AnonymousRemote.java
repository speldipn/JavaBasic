package com.speldipn.example.this_is_java.ch08;

public class AnonymousRemote {
  // 필드 초기값으로 대입
  RemoteControl field = new RemoteControl() {
    @Override
    public void turnOn() {
      System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
      System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void setMute(boolean mute) {

    }
  };

  void method1() {
    RemoteControl localVar = new RemoteControl() {
      @Override
      public void turnOn() {
        System.out.println("오디오를 켭니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("오디오를 끕니다.");
      }

      @Override
      public void setVolume(int volume) {

      }

      @Override
      public void setMute(boolean mute) {

      }
    };
    localVar.turnOn();
  }

  void method2(RemoteControl rc) {
    rc.turnOn();
  }
}
