package day04;

import java.util.Scanner;


public class For05 {

	public static void main(String[] args) {
		// 구구단
		//2~9단까지 한번에 반복

		int dan = 2;
		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단을 입력하세요 >");
//		int dan1 = sc.nextInt
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"     ");
			
			}
			System.out.println();
		}


		
	}

}
