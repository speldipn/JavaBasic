package com.speldipn.example.fc_java.Condition;

public class If {

	public static void main(String[] args) {
		// if문의 기본구조
		String id = "Scott12@";
		String password = "asdf1234";		
		
		if(id.equals("")) {
			// 1. id의 존재여부 확인
			System.out.println("id가 없습니다");			
		}
		else if(id.length() < 6) {
			// 2. id의 길이가 6자 이상인지 검사
			System.out.println("id의 길이가 6보자 작습니다");			
		}
		else if(!id.contains("@")) {
			// 3. id에 @가 포함되어있는 검사
			System.out.println("id에 @이 없습니다");
		}
		else if(password.equals("")) {
			// 4. password의 존재여부확인
			System.out.println("password가 존재하지 않습니다");
		}
		else if(password.length() < 8 || password.length() > 16) {
			// 5. password의 길이가 8자이상 16자 이하인지 검사
			System.out.println("password의 길이가 8보다 작거나 또는 16보다 큽니다");
		} else {
			System.out.println("로그인 되었습니다");
		}
	}
}
