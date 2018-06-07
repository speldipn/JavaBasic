package com.speldipn.example.fc_java.Collection.src.com.speldipn.collection;

import java.util.Random;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		
		// Set - List와 동일한데 중복값을 허용하지 않는다.
		//          동일한 Collection 인터페이스를 사용하기 때문에 명령어(함수) 체계가 같다.
		
		/*
		 * 중요 - 컬렉션은 꼭 generic과 함께 사용한다.
		 */
		
		// HashSet, TreeSet <- 정렬기능
		// 1. TreeSet 선언
		TreeSet<String> set = new TreeSet<>();
		
		// 1. 입력
		set.add("월");
		set.add("화");
		set.add("수");
		set.add("목");
		set.add("금");
		
		// Set을 사용하는 이유는 같은 값을 허용하지 않는다는 특징때문이다.
		set.add("수");
		
		//2. 조회 - Set은 index가 없어 get()이 없다.
		// 정렬이 자동으로 된다.
		// 반복문을 사용하여 조회하는것이 가장 쉽다.
		for(String str : set) {
			// 자동정렬 되기 때문에 가나다 순으로 출력된다.
			System.out.print(str + " ");
		}
		System.out.println();
		
		// 3. Set 예제 - 로또 번호 생성기
		Random random = new Random();
		TreeSet<Integer> numbers = new TreeSet<>();
		while(numbers.size() < 6) {
			int number = random.nextInt(36) + 1;
			numbers.add(number);			
		}
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
		
		// 5. 삭제
		set.remove("금");
		for(String str : set) {
			System.out.print(str + " " );
		}
		System.out.println();
		
		// 4. 수정 - (삭제 + 입력)
		set.remove("월");
		set.add("일");
		for(String str : set) {
			System.out.print(str + " " );
		}
		System.out.println();

	}

}
