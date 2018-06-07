package com.speldipn.example.fc_java.String.src.com.speldipn.string;

import javax.swing.text.Position;

public class StringMain {

	public static void main(String[] args) {
		// 1. 문자열 비교		
		String eq1 = "Aaa";
		String eq2 = "AAa";		
		
		System.out.println(eq1.equals(eq2));
		// 대소문자 구분하지 않고 비교하는 함수
		System.out.println(eq1.equalsIgnoreCase(eq2));		
		
		// 2. 문자열 합치기 - concat
		String addString = "안녕" + "하세요";
		String addString2 = addString.concat(" 반갑습니다");
		
		System.out.println(addString);
		System.out.println(addString2);
		
		// 3. 문자열 길이
		int strLen = addString2.length();
		System.out.println(strLen);
		
		// 4. 시작 또는 끝나는 문자
		// startsWith
		String fullName = "김동성";
		System.out.println(fullName.startsWith("김"));
		System.out.println(fullName.startsWith("김동"));
		
		// endsWith
		String fullName1 = "홍길동";
		System.out.println(fullName1.endsWith("동"));
		System.out.println(fullName1.endsWith("홍길동"));
		
		// 5. 특정 위치의 문자 반환 - charAt
		String tempStr = "Hello";
		char ch = tempStr.charAt(2);
		System.out.println(ch);
		
		// 6. 문자열 교체 - replace
		String replaced = addString2.replace(" ", "!");
		System.out.println(replaced);
		System.out.println(addString2);
		
		// 7. 구분자로 문자열 분리 - split
		String original = "김동성:37:남";
		String items[] = original.split(":");
		for(int i = 0; i < items.length; ++i) {
			System.out.println(items[i]);
		}
		
		// 8. 특정 위치의 문자열 추출 - substring
		String subStr = original.substring(3, 5);
		System.out.println(subStr);
		// a b c d e  (string)
		//0 1 2 3 4 5 (index)
		
		// 9. 문자열 검색 indexof()		
		int pos = original.indexOf("37");
		System.out.println(original);
		System.out.println("문자열 37은 " + pos + "번째에 있습니다");		
		
		// indexOf
		// 문자열이 없으면 -1 을 반환한다.
		
		// contains
		// 리턴 타입이 boolean
		
		// 10. 공백제거 - trim
		// 맨앞에 맨뒤에 white space 문자를 제거
		// 중간거까지 제거하고 싶으면 replaceAll() 함수를 사용한다.
 		
		// 11. toLowerCase, toUpperCase 
	}
}
