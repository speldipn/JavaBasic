package com.speldipn.example.ch03.casting;

public class CheckValueCasting {
    public static void main(String[] args) {
        int i = 127;

        // 데이터를 검사하여 형변환시에 손실이 발생하지 않도록 한다.
        if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
            System.out.println("byte 타입으로 변환할 수 없습니다.");
            System.out.println("값을 다시 확인해주세요.");
        } else {
            byte b = (byte)i;
            System.out.println(b);
        }
    }
}
