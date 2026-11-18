package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 정수 2개 입력(랜덤도 가능), 연산자 1개를 입력받아 두 정수의 연산결과를 출력
		// 예_ 2 3 + => 2 + 3 =5 / 2 3 - => -1
		// 입력 가능한 연산자는 + - * / %
		// 외 문자가 들어가면 계산하지 않습니다 하고 빠져나가기
		// 연산자 입력은 => String char 가능 Switch 권장
		
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수 입력: ");
		int num1 = (int)(Math.random()*10+1);
		System.out.println(num1);
		
		System.out.println("두번째 정수 입력: ");
		int num2 = (int)(Math.random()*10+1);
		System.out.println(num2);
		
		System.out.println("연산자 입력");
		// 연산자 String
		// String op = scan.next(); // '+'
		
		// Char 형태
		// char opChar = scan.next().charAt(0); //'+'
		
		String op = scan.next();
		
		switch(op) { 
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));	
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			break;
		case "%":
			System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
			break;
		default:
			System.out.println("계산불가 값");
			
		}
		
		
		scan.close();
			
		
}
}