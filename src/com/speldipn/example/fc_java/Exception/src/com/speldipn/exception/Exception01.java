package com.speldipn.example.fc_java.Exception.src.com.speldipn.exception;

public class Exception01 {

	public static void main(String[] args) {
		try {			
			String str = null;
			str.length();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			/* 파일이나 네트워크 처리를 할때 try 문에서 연결한 연결점을 꼭 닫아줘야한다. */
			System.out.println("프로그램이 정상적으로 종료되었습니다.");			
		}
	}
}

//class null {
//	public void length() {
//		
//	}
//}
