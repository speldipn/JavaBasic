package com.speldipn.example.fc_java.FileIO.src.com.speldipn.fileio;

import java.io.IOException;
import java.nio.file.Files;

/*
 * IO : Input / Output
 * NIO : New Input / Output
 */

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class UsePath {	 
	// 1. 읽기
	public String read(String filePath) {
		String result = "";	
		
		// 1.1 Path 선언하기
		Path path = Paths.get(filePath);
		// 1.2 파일 읽기
		try {
			List<String> lines = Files.readAllLines(path);
			for(String line : lines) {				
				result = result + line;
				result = result + "\r\n";
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		return result;
	}
	
	// 2. 쓰기
	public void write(String filePath, String content) {
		// 2.1 Path 만들기
		Path path = Paths.get(filePath);
		// 2.2. Path로 파일 쓰기
		try {
			Files.write(path, content.getBytes());
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}
}
