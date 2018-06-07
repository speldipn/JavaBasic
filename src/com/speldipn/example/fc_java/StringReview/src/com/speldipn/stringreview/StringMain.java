package com.speldipn.example.fc_java.StringReview.src.com.speldipn.stringreview;ㄴpackage com.speldipn.stringreview;

public class StringMain {

	public static void main(String[] args) {
		
		String word = "안" + "녕" + "하" + "세" + "요";
		// 메로리 공간을 낭비
		// [안녕] [안녕하] [안녕하세] [안녕하세요]
		
		System.out.println(word);
		
		// 1. StringBuffer : 문자열 연산을 위해 제공되는 클래스
		StringBuffer buffer = new StringBuffer();
		buffer.append("안");
		buffer.append("녕");
		buffer.append("하");
		buffer.append("세");
		buffer.append("요");
		System.out.println(buffer.toString());		
		// [안] [녕] [하] [세] [요]
				
		// 2. StringBuilder : 제공되는 칼래스
		StringBuilder builder = new StringBuilder();
		builder.append("안");
		builder.append("녕");
		builder.append("하");
		builder.append("세");
		builder.append("요");
		System.out.println(builder);
		// 동작 방법은 StringBuffer와 비슷하나 멀티스레드 환경에서는  

	}

}
