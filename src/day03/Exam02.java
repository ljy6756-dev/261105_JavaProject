package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 연도를 숫자로 입력받아, 어린이(13살), 청소년(19살), 성인(20부터) 으로 구분
		// 어린이 5,000원, 청소년 7000원, 성인 10000원 입장료 출력
		// ex) 2017 => 9살 어린이 입니다. 입장료는 5000원 입니다.
		// 2026 생년을 기준으로 2026 - 2017 => 아니
		// 생년의 유요한 값을 1900 ~ 2026 => 유효하지 않는다 출력
		// 기준에 넘어간 데이터는 다시 입력하라고 요청
		// 생년이 유효하지 않습니다. 다시 입력해주세요(1900~2026) > 종료키도 가능
		
		// 한 가족 또는 단체입장료 계산법
		// 반복적인 생년을 입력받고 싶음 = 종료키워드 0
		// 반복이 종료되면 최종결재금액
		
		
		Scanner sc = new Scanner(System.in);
		int year=0;
		int age =0;
		int sum = 0;
		int count = 0;
		while(true) {System.out.println("태어난 연도를 입력하세요 > (0입력시 총금액 계산)");
			year = sc.nextInt();
			if(year == 0) { System.out.println("프로그램 종료");
			break;}
			if(year < 1900 || year > 2026) {
			System.out.println("생년이 유효하지 않습니다. 다시입력해주세요");
			continue;}
			else {age = 2026 - year; }
			if(age <=13) { System.out.println(age + "살 어린이 입니다."+"입장료는 5,000원 입니다");
			sum += 5000;}
			else if(age <=19) { System.out.println(age + "살 청소년 입니다."+"입장료는 7,000원입니다");
			sum += 7000;}
			else {System.out.println(age + "살 성인 입니다."+"입장료는 10,000원 입니다");
			sum += 10000;
			}
			count++;
			}

		System.out.println("----------------------------");
	    System.out.println("총 금액은"+sum+"이며, "+"총"+count+"명 입니다");
		  sc.close();
		  
			}
		

}
