package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열
		// 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력
		// 검색어를 포함하는 파일이 없다면 => 일치하는 항목이 없습니다.
		//String search = scan.next(); // 한단어 입력
		
	
		Scanner scan = new Scanner(System.in);
	   
		
		String[] fileName = {
				"이것이자바다.java","java의정석.java","array.txt",
				"array.java", "String.txt", "StringMethod.jpg",
				"ArrayMethod.jpg","method.png","javaMethod.png"	
				};
		
		int cnt = 0;   //검색어 개수
		boolean check=false;
		
		// 검색어 입력(대소문자구분없이 검색)
		System.out.println("검색어를 입력하세요 >");
		String sc = scan.next().toLowerCase(); // 소문자로 변환
			
		//검색결과 확인
		
		System.out.println("--"+sc+"포함 fileList--");
		for(int i=0; i<fileName.length; i++) {
		
			if(fileName[i].toLowerCase().contains(sc)) {
				System.out.println(fileName[i]);
				cnt++;
				check=true;
			}
			
			}
		System.out.println("검색결과: "+cnt+"개 검색됨");
		if(cnt == 0) { // (!check) 동일
			System.out.println("일치하는 항목이 없습니다");
			
		
		}
			
		
		scan.close();
	

	}

}