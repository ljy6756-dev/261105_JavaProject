package day03;

import java.util.Scanner;

public class Exme01 {

	public static void main(String[] args) {
		// up/down game
		// 1~50까지 중 랜덤 수 하나를 컴퓨터가 생성 => user는 모름
		// user가 그 랜덤수를 맞추는 게임
		/* 출력예시)
		 * 컴퓨터가 랜덤수를 생성했습니다.() 유저가 맞추기
		 * 38 > 입력 > 30 => up 
		 * 입력 > 40 > down
		 * 입력 > 38 => 정답!!(3회만에 정답) => 종료
		 * 랜덤수 > 유저수 up!
		 * 랜덤수 < 유저수 down!
		 * 랜덤수 = 유저수 정답!!
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		//1~50 까지 랜덤수 생성, 유저는 보이지 않음
		int ran = (int)(Math.random()*50)+1;
		int user = 0;
		int count = 0;
		System.out.println("랜덤한 수가 생성 되었습니다");
		System.out.println("------------------------------");
		do {
			System.out.print("숫자 입력 > ");
			user = scan.nextInt();
			if(user > ran) System.out.println("다운");
			if(user < ran) System.out.println("업");
			if(user == ran) System.out.println("정답");
			count++;
	
			
		}while (ran!=user);
		System.out.println("시도한 횟수 : "+ count + "회");
		
		
		scan.close();
		
	}		
		
		
		
		
	}
		
	
