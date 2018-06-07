package com.speldipn.example.fc_java.Function.src.com.speldipn.fucntion;

public class Overload {
	public void take(String str) {		
		System.out.println("스트링님이 탑승하셨습니다.");
	}
	
	// 1. 파라미터의 개수
	public void take(String str, String str2) {
		System.out.println("스트링 두분이 탑승하셨습니다.");
	}
	
	public void take(String str, String str2, String str3) {
		System.out.println("스트링 세분이 탑승하셨습니다.");
	}
	
	// 2. 파라미터의 타입
	public void take(int number) {
		System.out.println("숫자님이 탑승하셨습니다.");
	}
	
	public void take(String str, int number) {
		System.out.println("문자열과 숫자님이 탑승하셨습니다.");
	}
	
	public void take(int number, String str) {
		System.out.println("숫자와 문자열님이 탑승하셨습니다.");
	}
	
	// 3. 리턴타입은 오버로드 대상이 아닙니다
//	public int take(String str) {
//		
//	}
}
