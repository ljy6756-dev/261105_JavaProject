package day05;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일과 성별, 나이를 출력
		String regnum = "990101-1234567";   // 1999년생 => 1(남), 2(여)
//		String regnum = "010101-3234567";   // 2000년생 => 3(남), 4(여)
		
		//출력결과
		/* 생년월일 : 990101
		 * 성별 : 남
		 * 나이 : 28세
		 * 
		 */
		
		int today = 2026;
		
		//생년월일 추출
		String birth = regnum.substring(0, 6);
		//System.out.println(birth);
		
		//남여구분
		char genderNum = regnum.charAt(7);
		String gender = "";
		//System.out.println(gender);
		
		//성별구분
		if(genderNum == '1' || genderNum == '3') {
			gender = "남";
		}else if(genderNum == '2' || genderNum == '4') {
			gender = "여"; }
			
		//출생 연도 구하기
		int year = Integer.parseInt(regnum.substring(0, 2));
		
		if(genderNum == '1' || genderNum=='2') {
			year += 1900;
		}else if(genderNum=='3' || genderNum=='4') {
			year += 2000;
		}		
	
		//결과
	      int age = today-year+1;
			System.out.println("생년월일 : "+birth);
			System.out.println("성별 : "+gender);
			System.out.println("나이는 : "+age+"세");
		}






		

	}

