package day02;

import java.util.Random;

public class Math01 {

	public static void main(String[] args) {
		// Math 클래스 : 수학과 연관된 기능을 제공하는 클래스
		// Math.round(값) : 정수로 반올림 => 소수자리수 0
		// Math.floor(값) : 버림 => 소수자리수 0
		// Math.seil(값) : 올림 => 소수자리수 0 
		
		// Math.random(값) : 0~1사이의 아무수 => double(0.0000) 주사위, 로또, 룰렛, 이벤트 등

		
		double number = 3.14159; 
		
		long pi = Math.round(number);
				System.out.println(pi);
				
		//실수의 기본자료형 = double 정수의 기본 자료형 = int
				
		int r = (int)Math.round(number);
		
		//floor()
		int floorNum = (int)Math.floor(number);  // return double
		
		Math.ceil(number); // return double
		int celilNum = (int)Math.ceil(number);
		
		//Math.random() => return double
		double ran = Math.random()*10;		
		System.out.println(ran);
		
		// 0~9 한자리를 랜덤선택
		// int rannum = (int)(Math.random()*10);
		//		System.out.println(rannum);
		
		//1~10 랜덤선택
		int rannum = (int)(Math.random()*10)+1;
		System.out.println(rannum);
		
		// (int)(Math.random()*count) + start
		// 주사위값 (1~6)
		//(int)(Math.random()*6)+1
		System.out.println("-----주사위 랜덤-----");
		System.out.println((int)(Math.random()*10)+1);
		

		//로또(1~45)				
		//(int)(Math.random()*45)+1
		
		System.out.println("-----로또 랜덤-----");
		System.out.println((int)(Math.random()*45)+1);
	
		//Random() 클래스 new 키워드
		Random random1 = new Random();
	// int 자료형으로 랜덤 값을 리턴
	// random.nextInt(count)+start
	    System.out.println(random1.nextInt(45)+1);
		
	    //Math.max(값1, 값2) 누가큰가요?  / <ath.min(값1, 값2) 작은거 주세요	    
	    System.out.println(Math.max(10, 20));
	    System.out.println(Math.min(10, 20));
	
	
	
	
		
	}

}
