package com.speldipn.example.fc_java.UsingClass.src.com.speldipn.using;

public class UsenMain {

	public static void main(String[] args) {
		// 1. 클래스 자원 사용하기.
		One one = new One();
		one.memFunction();

		// 2. static 예약어 - new 없이 클래스명에 도트연산자를 바로 사용
		// 장점 : 처리 속도가 빨라진다.
		// new는 메모리 공간 효율이 좋아진다.
		
		One.staticFunction();
		System.out.println(One.member);
	}

}

class One {
	static String member = "hello";	
	
	public void memFunction() {
		System.out.println("멤버함수를 호출");		
	}
	
	public static void staticFunction() {
		System.out.println("static 함수를 호출");		
	}
}
