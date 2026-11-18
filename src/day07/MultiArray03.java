package day07;

import java.util.Scanner;

public class MultiArray03 {
	
 int a;   // 멤버변수
	
	public static void main(String[] args) { //지역변수
		// 성적표
		/* 전체인원 > 3 (입력) = 인원수만큼 배열 생성
		 * 이름   국어   영어   수학   합계   평균   등수
		 * hong  89    78    88    --    --    --
		 * kim   42    98    78    --    --    --
		 * lee   57    97    35    --    --    --
		 * 
		 * 
		 * 이름, 국어, 영어, 수학 점수를 입력받아 합계 평균 등수 나타내기
		 */

		//각각의 필요한 배열을 따로 생성 같은 번지의 학생은 같은 답으로 정의
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적산출인원 > ");
		int tester = scan.nextInt(); //인원수
		int subject = 3; //과목수(국어, 영어, 수학)
		
		
		//배열
		String[] name = new String[tester];  //이름
		int[][] scores = new int[tester][subject];  //점수 -이름/과목
		int[] total = new int[tester];  // 점수합계
		double[]avg = new double[tester];  // 평균
		int[] ranking = new int[tester];  // 등수 
		
		//이름 입력 / 성적 입력
		for(int i = 0; i<tester; i++) {
			System.out.println((i+1)+". 번재 학생>");
			name[i] = scan.next();
			System.out.println(name[i]+"학생의 성적(국,영,수) >");
			for(int j=0; j<subject; j++) {
				scores[i][j] = (int)(Math.random()*101);		
				total[i] += scores[i][j];
			}
			avg[i] = total[i]/3.0;
			ranking[i] = 1;
		}	
		for(int i =0; i<tester; i++) {
			for(int j=0; j<tester; j++) {
				if(total[i] < total[j]) {
					ranking[i]++;
				}
			}
		}
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("----------------------------------------------------");
		for(int i =0; i<tester; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<subject; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.print(total[i]+"\t");
			System.out.printf("%.2f\t", avg[i]);
			System.out.println(ranking[i]+"\t");
			
			//순위(다른방법)
//		 int r = 1;
		 // i = 순위를 구할 대상
		 // j = 비교대상
//		 for(int j=0; j<tester; i++) {
//			 if(avg[i] < avg[j]) {
//				 r++;
//			 }
//		 }
		 
//		 ranking[i] = r;
		
		 System.out.println();
			
		}
		scan.close();
		
	}

}
