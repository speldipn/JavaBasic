package com.speldipn.example.this_is_java.ch07.phone;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-20
 */
public class DmbCellPhoneExample {
  public static void main(String[] args) {
    DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

    // CellPhone으로부터 상속받은 필드
    System.out.println("모델: " + dmbCellPhone.model);
    System.out.println("색상: " + dmbCellPhone.color);
    System.out.println("채널: " + dmbCellPhone.channel);

    // CellPhone으로부터 상속받은 메소드
    dmbCellPhone.powerOn();
    dmbCellPhone.bell();
    dmbCellPhone.sendVoice("여보세요?");
    dmbCellPhone.receiveVoice("안녕하세요. 저는 홍길동인데요.");
    dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
    dmbCellPhone.hangUp();

    // DmbCellPhone의 메소드 호출
    dmbCellPhone.turnOnDmb();
    dmbCellPhone.changeChannelDmb(12);
    dmbCellPhone.turnOffDmb();
  }
}
