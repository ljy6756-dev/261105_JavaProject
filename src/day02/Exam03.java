package day02;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 랜덤으로 생성(0~100점)
		// 각 과목 출력 + 합게, 평균, pass
		// pass 80점 이상 상 / 60점이상이면 중 / 나머지는 하

		
		//3과목 랜덤 점수
		
		//5명의 값을 출력
		for(int i=1; i<=5; i++) {
		
		int kor = (int)(Math.random()* 101);
		int eng = (int)(Math.random()* 101);
		int math = (int)(Math.random()* 101);
		System.out.println((i+1)+"번의 점수");
		System.out.print("국어점수 : " + kor +"점 ");
		System.out.print("영어점수 : " + eng +"점 ");
		System.out.println("수학점수 : " + math+"점 ");
		
		// 3과목의 합계 및 평균
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		System.out.println("합계 : "+ sum +"점");
		System.out.print("평균 : "+ avg + "점");
		
		// 평균에 따른 등급(상, 중, 하)
		
		
		if(avg>=80) {
			System.out.println(" 등급 : 상");
		}else if(avg>=60){
			System.out.println(" 등급 : 중");
		}else {
			System.out.println(" 등급 : 하");
		}
		
		System.out.println("----------------------");
	}

}
}