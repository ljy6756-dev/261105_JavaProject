package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아 합계, 평균, pass 출력
		// 입력받은 점수는 0~100 범위 안에 있어야 함.
		// 올바른 값을 입력해야 넘어감
		//return; 해당 메서드를 빠져나오는 키워드
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요 >");
		int kor = scan.nextInt();
		System.out.println("점수 :"+kor+"점");
		if(kor <0 || kor > 100) {
			System.out.println("국어점수가 잘 못 입력되었습니다");
		return;
		// else{ 가능
		}
			scan.nextLine();
			
		System.out.println("영어점수를 입력하세요 >");
		int eng = scan.nextInt();
		System.out.println("점수 :"+eng+"점");
		if(eng <0 || eng > 100) {
		System.out.println("영어점수가 잘 못 입력되었습니다");
		return;
		}		
		
		scan.nextLine();
				
		System.out.println("수학점수를 입력하세요 >");
		int math = scan.nextInt();
		System.out.println("점수 :"+math+"점");
		if(math <0 || math > 100) {
		System.out.println("수학점수가 잘 못 입력되었습니다");
		return;
		}
		
		scan.nextLine();
		
		int total = kor + eng + math;
		double avg = (double)total / 3;
		System.out.println("합계 :"+total+"점");
		System.out.println("평균 :"+avg+"점");
		System.out.println(avg >=60 ? "합격" : "불합격");
		
		
		
		scan.close();
	}

}