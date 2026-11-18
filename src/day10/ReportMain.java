package day10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ReportMain {
	

	public static void main(String[] args) {
		// Report class 객체 생성 => 실행
		// 성적 산출 인원 > 3(입력)Scanner
		// 이름, 국어, 영어, 수학(입력) 랜덤도 가능
		/* 이름   국어   영어   수학   합계   평균   등수 \t
		 * hong  89    85    98    00    00    00  
		 */
		//report[] = new Report[count];
		//Report 객체가 들어가는 배열
		//Report r = new Report("이름", 89,85,98);
		//Report[0] = r;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적산출인원 >");
		int count = sc.nextInt();
		Report[] report = new Report[count];
		
		for(int i =0; i<count; i++) {
			System.out.println((i+1)+"번 이름, 국어, 영어, 수학 순으로 입력 >");
			String name = sc.next();
			//random
			int kor = (int)(Math.random()*70)+30;
			int eng = (int)(Math.random()*70)+30;
			int math = (int)(Math.random()*70)+30;
			report[i] = new Report(name, kor, eng, math); 
		}
		
		//순위
		for(int i =0; i<count; i++) {
			int rank = 1;
			for(int j = 0; j<count; j++) {
				if(report[i].getAvg() < report[i].getAvg()) {
					rank++;
				}
			}
			report[i].setRank(rank);
		}
		
		
		//출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("----------------------------------------------------");
		for(Report tmp : report) {
			System.out.println(tmp);
			
		}
		
//		Report r = new Report("gong", 99, 99, 99);
//		System.out.println(r.toString()); //r.toString();
//		
//		Report r1 = new Report(); 
//		r1.setName("kim");
//		r1.setKor(90);
//		r1.setEng(95);
//		r1.setMath(89);
//		
//		
//		report[0] = r;
//		report[1] = r1;
//		
		System.out.println(report);
		
		
		
		sc.close();

	}
}
