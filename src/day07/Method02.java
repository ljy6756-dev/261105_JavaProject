package day07;

import java.lang.reflect.Method;

public class Method02 {

	/* 메서드 => 기능을 정의하는 역할(함수)
	 * 접근제어자 리턴타입 메서드명(매개변수) {
	 * 구현;
	 * (return;) 
	 * }
	 * - 리턴타입 : 기능을 구현 후 결과로 변환하는 값의 타입
	 * - 매개변수 : 기능을 구현하기 위해 외부에서 받아와야 하는 값
	 * - 메서드명 : 의미있게 소문자로 작성
	 */
	
	//메서드 생성 영역
	// + - * / %
	// 두 정수를 주고(매개변수) 각 연산의 결과를 리턴하는 메서드
	
	public int q(int a, int b) {
		return a+b;
	}
	public int w(int a, int b) {
		return a-b;
	}
	
	public int e(int a, int b) {
		return a*b;
	}
	
	public int r(int a, int b) {
		if(b==0) {
			return -999999;
		}
		return a / b;		
	}
	
	public int t(int a, int b) {
		if(b==0) {
			return -999999;
		}
		return a%b;
	}
	
	
	
	public static void main(String[] args) {
		// 메서드 호출영역
		int num1 = 100;
		int num2 = 0;
		
		
		
    Method02 pr = new Method02();
    int q = pr.q(num1, num2);
    System.out.println(q);
    int w = pr.w(num1, num2);
    System.out.println(w);
    int e = pr.e(num1, num2);
    System.out.println(e);
    
    double r = pr.r(num1, num2);
    if(r == -999999) {
    	System.out.println("0으로 나눌 수 없습니다");
    }else {
    	System.out.println(r);
    }
    System.out.println(r);
    int t = pr.t(num1, num2);
    if(t == -999999) {
    	System.out.println("0으로 나눌 수 없습니다");
    }else {
    	System.out.println(t);
    }
    System.out.println(t);
    		
    
		
		
		
	}

}
