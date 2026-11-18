package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * ---menu--- 1. + |2.-|3./ 5.*|6. 종료|
		 * 
		 * menu >1 두 수를 입력 > 2 3 결과 => 2+3=5
		 * 
		 * 누를때마다 반복
		 * 
		 * 두번째 값이 0인 경우 / % 연산은 연산할 수 없음(0으로 나눌 수 없습니다.)
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in); 

		int menu = 0;

		do {
			System.out.println("1. + " + "2. - " + "3. / " + "4. *" + "5. % " + "6. 종료");
			System.out.println("메뉴를 선택하세요 >");
			menu = sc.nextInt();
			
			if(menu ==6) {
				System.out.println("종료합니다");
				break;
			}else if(menu < 1 || menu >6) {
				System.out.println("다시입력해주세요");
			}else {
			System.out.println("첫번째 정수 입력");
			int num1 = sc.nextInt();
			System.out.println("두번째 정수 입력");
			int num2 = sc.nextInt();
			
			
			switch (menu) {
			case 1:
				System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
				break;
			case 2:
				System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
				break;
			case 3:
				if(num2 ==0) {
					System.out.println("0으로 나눌 수 없습니다");
				} else {
				System.out.println(num1 + "/" + num2 + "=" + (num1 * num2));
				}break;
			case 4:
			    System.out.println(num1 + "*" + num2 + "=" + (num1 / num2));
				break;
			case 5:
				System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
				break;
				default:
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			
					
			}
			}
			
		}while (menu != 6);
			System.out.println("종료합니다");
				
		

		
			sc.close();
		}
	
	}
		
			
	
	

	
		


