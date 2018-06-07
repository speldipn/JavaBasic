package com.speldipn.example.fc_java.Constructor.src.com.speldipn.constructor;

import java.net.SocketTimeoutException;

public class One {
	// 생성자는 리턴타이이 없는 함수이다.
	// 클래스의 이름과 함수의 이름이 같다.
	public One() {
		System.out.println("생성자 One을 호출하였습니다.");			
	}
	
	// 생성자도 함수 오버로드가 가능하다
	// 생성자도 함수이기 때문에 함수 오버로딩이 가능하다
	
	public One(String str) {
		System.out.println(str + "를 생성자에서 호출하였습니다");
	}
	
	public One(int number) {
		System.out.println(number + "를 생성자에서 호출하였습니다");
	}
	
}
