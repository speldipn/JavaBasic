package com.speldipn.example.fc_java.String;

public class StringEample {

	public static void main(String[] args) {
		//------------------------------
		// 일반적인 로그인 처리 순서
		//------------------------------		
		boolean validation = true;
		String id = "john@12";
		String password = "pass1234";
		
		// 1. 입력된 아이디가 존재하는 검사
		validation = !id.equals("");
		System.out.println("로그인 처리 결과: " + validation);
		
		// 2. 입력된 아이디의 길이가 6자 이상인지 검사
		validation = validation && (id.length() >= 6);
		System.out.println("로그인 처리 결과: " + validation);
		
		// 3. 입력된 아이디가 이메일이라면 형식에 맞는지도 검사 (@만 검사)
		validation = validation && id.contains("@");
		System.out.println("로그인 처리 결과: " + validation);
		
		// 4. 입력된 비밀번호가 존재하는지 검사
		validation = validation && !password.equals("");
		System.out.println("로그인 처리 결과: " + validation);
		
		// 5. 입력된 비밀번호의 길이가 8자 이상이고 16자 이하인지 검사
		validation = validation && (password.length() >= 8 && password.length() <= 16);		
		System.out.println("로그인 처리 결과: " + validation);
	}
}
