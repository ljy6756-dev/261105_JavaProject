package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 그림파일만 출력 => .jpg, .png
		// 없으면 그림 파일이 없습니다
		
	
		Scanner scan = new Scanner(System.in);
	   
		
		String[] fileName = {
				"이것이자바다.java","java의정석.java","array.txt",
				"array.java", "String.txt", "StringMethod.jpg",
				"ArrayMethod.jpg","method.png","javaMethod.png"	
				};
		
		int cnt = 0;   //검색어 개수
		
		
		//검색결과 확인
		for(int i=0; i<fileName.length; i++) {
//			int index = fileName[i].lastIndexOf(".");
//			String ex = fileName[i].substring(index);
		
//			if(ex.equals(".jpg") || ex.equals(".png")) { }
				
			if(fileName[i].substring(fileName[i].lastIndexOf(".")+1).equals("jpg") || fileName[i].substring(fileName[i].lastIndexOf(".")+1).equals("png")) {
			System.out.println(fileName[i]);
				cnt++;
			}
			
			}
		System.out.println("검색결과: "+cnt+"개 검색됨");
		if(cnt == 0) { // (!check) 동일
			System.out.println("그림파일이 없습니다");
			
		
		}
		
		scan.close();
		}
			
		

	

	}
