package com.speldipn.example.fc_java.FileIO.src.com.speldipn.fileio;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class UseFile {
	
	// 1. 파일의 정보
	public void info() {
		// 1.1 파일의 경로를 File 클래스의 생성자에 넘겨준다
		// 가. 절대 경로 
		String absPath = "/Temp/test.txt";
		String path = "newFile.txt";
		
		// 나. 상대 경로
		
		File file = new File(path);
		System.out.println(file.getName());
		System.out.println("파일크기: " + file.length());
		
		// 숫자로 반환된 날짜 > 형식 지정하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String formattedDate = sdf.format(file.lastModified());		
		System.out.println("작성시간: " + formattedDate);	
	
	}
	
	// 2. 디렉토리를 생성
	public void makeDir() {
		String dirPath = "/Temp/one/two";
		File dir = new File(dirPath);
		
		// 가. 경로상의 마지막 디렉토리만 생성해준다.
		//dir.mkdir();
		
		// 나. 경로상의 모든 디렉토리를 생성해준다. < 이것을 더 선호한다.
		dir.mkdirs();
	}
	
	// 3. 파일의 생성
	public void makeFile() {
		String path = "/Temp/newOne.txt";
		File file = new File(path);
		
		try {
			if(file.createNewFile()) {
				System.out.println("파일이 정상적으로 생성되었습니다.");
			} else {
				System.out.println("파일이 생성되지 않았습니다");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 4. 디렉토리와 파일 모두 생성 ( 인자로	
	public void makeFile(String absPath) {	
		
		// 1. 경로상의 디렉토리를 검사하고 없으면 생성해준다.
		String dirPath = absPath.substring(0, absPath.lastIndexOf('/'));
		System.out.println(dirPath);
		
		// 2. 디렉토리가 존재하는지 검사
		File dir = new File(dirPath);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		// 2. 파일을 생성
		File file = new File(absPath);
		try {
			if(file.createNewFile()) {
				System.out.println("파일이 생성되었습니다.");
			} else {
				System.out.println("파일이 생성되지 않았습니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
