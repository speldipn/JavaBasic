package com.speldipn.example.fc_java.Condition;

public class Example {

	public static void main(String[] args) {
		// --------------
		// GDH웹사이트 회원정보
		// --------------
		
		//회원1
		String name1 = "강다니엘";
		int age1 = 21;
		String gender1 = "남";
		String job1 = "singer";
		
		//회원2
		String name2 = "박지훈";
		int age2 = 21;
		String gender2 = "남";
		String job2 = "singer";
		
		//회원3
		String name3 = "박진영";
		int age3 = 46;
		String gender3 = "남";
		String job3 = "producer";
		
		// 회원 N
		// 1. 40대 이상 회원, 40대 미만 회원 분리
		String above40[] = new String[100];
		String under40[] = new String[100];
		
		int aboveindex = 0;
		int underindex = 0;
		
		if(age1 >= 40) {
			above40[aboveindex++] = name1;
		} else {
			under40[underindex++] = name1;
		}
		
		if(age2 >= 40) {
			above40[aboveindex++] = name2;
		} else {
			above40[underindex++] = name2;		
		}
		
		if(age3 >= 40) {
			above40[aboveindex++] = name3;
		} else {
			above40[underindex++] = name3;		
		}
		
		// 2. 직업군으로 회원 분리
		String singer[] = new String[100];
		String producer[] = new String[100];
		
		int singerindex = 0;
		int producerindex = 0;
		
		switch(job1) {
			case "singer":
			singer[singerindex++] = name1;
				break;
			case "producer":
				producer[producerindex++] = name1;
				break;
			
			default: break;
		}
		
		switch(job2) {
		case "singer":
			singer[singerindex++] = name2;
			break;
		case "producer":
			producer[producerindex++] = name2;
			break;
		case "writer": break;
		case "dancer": break;
		case "investor": break;
		case "trainer": break;
		default: break;
		}
		
		// if 문으로 switch 대체하기
		if(job1.equals("singer")) {
			singer[singerindex++] = name1;
		} else if(job1.equals("producer")){
			producer[producerindex++] = name1;			
		} else if(job1.equals("writer")) {
			
		} else if(job1.equals("dancer")) {
			
		} else if(job1.equals("investor")) {
			
		} else if(job1.equals("trainer")) {
			
		}
		
	}	
}
