package com.speldipn.example.fc_java.FileIO.src.com.speldipn.fileio;

import java.io.FileInputStream;

public class FileMain {

	public static void main(String[] args) {
		// 파일 입출력
		// IO : Input Output
		
		// 1. File 클래스 사용
		// 가. 파일의 정보를 읽는다.
		// 나. 파일 생성, 디렉토리 생성
		
//		UseFile file = new UseFile();
//		file.info();
		//file.makeDir();
		//file.makeFile();
//		file.makeFile("/Temp/sample/test/abc.txt");
		
//		UseStream stream = new UseStream();
//		String content = stream.read("/Temp/sample/test/abc.txt");
//		System.out.println("content : " + content);
//		stream.write("/Temp/sample/test/abc.txt", "hello");
		
//		String content1 = stream.read("/Temp/test.txt");
//		System.out.println("content1:" + content1);
		
		// 2. Stream 사용
		// 가. 파일을 읽고 쓴다.
		// - 일반 변수에 값을 입력하는 법
//		String str = "aaa";
		// Stream : 일반변수와 다르게 열고 닫는 과정을 거친다.
//		FileInputStream fis = new FileInputStream("");
//		fis.open();		
//		fis.read();		
//		fis.close();
		
		// 3. Stream + Buffer 사용
		// Stream의 처리 속도를 향상시켜 준다. 적게는 100배에서 1000배까지
		
//		UseBuffer ub = new UseBuffer();
//		ub.write("/Temp/buffer.txt", "안녕하세요");
//		String content = ub.read("/Temp/buffer.txt");
//		System.out.println("[buffer] content :" + content);
		
		// 4. Reader 와 Writer 사용
		// Stream을 쓰기 쉽게 해주는 보조 클래스
		// 텍스트 파일을 읽고 쓰게 해준다.
		
//		UseReaderWriter urw = new UseReaderWriter();
//		String content = urw.read("/Temp/reader.txt");
//		System.out.println("content: " + content);
//		urw.write("/Temp/reader.txt","오준영");
		
		
		// 5. Path 사용 - JDK 7 이상
		// Path 는 위에 3가지보다 더 간편하게 파일을 처리할 수 잇게 해준다.
		
		UsePath path = new UsePath();
		String content  = path.read("/Temp/path.txt");
		System.out.println(content);
		
//		path.write("/Temp/path.txt","Test Code!");
	}

}
