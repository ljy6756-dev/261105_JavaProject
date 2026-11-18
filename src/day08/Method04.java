package day08;

import java.util.Random;

public class Method04 {
	
	
	//멤버변수
	Random r = new Random(); 
	
	//1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
	/* 매개변수 : 없음
	 * 메서드명 : print
	 * 리턴타입 : 정수배열 => int[] 또는 void
	 * 
	 */
	
	public int[] print() {
		int[] arrRan = new int[5];
		for(int i = 0; i<arrRan.length; i++) {	
			//arrRan[i] = (int)(Math.random()*101);
			arrRan[i] = r.nextInt(101);		
		}
		return arrRan;
	} 
	
	public int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	/*2. 정수 배열을 받아 평균값을 리턴하는 메서드
     *   - 단 정수 배열이 없거나, 갯수가 0이면 처리불가(평균을 처리할 수 없습니다.)
     *   매개변수 : 정수배열 => int[] arr2
     *   메서드명 : avg
     *   리턴타입 : 평균값 => double
     *   
	 */
	  public double avg(int[] arr2) {
		  if(arr2 == null) {
			  return -9999999;
		  }
		  if(arr2.length <=0) {
			  return -9999999;
		  }
		  return sum(arr2) / (double)arr2.length;
	  }
	
	
	 /*
	 * 3. 정수 배열을 받아 출력하는 메서드 만들기
	 *   - 78 96 85 48 58
	 *   매개변수 : 정수배열 => int[] arr
	 *   매서드명 : printArr
	 *   리턴타입 : 출력 = void
	 *   
	 *   
	 */
	  public void printArr(int[] arr) {
		  for(int i =0; i<arr.length; i++) {
			  System.out.print(arr[i] + " ");
		  }
		  
		  System.out.println();  //줄바꿈
	  }

	public static void main(String[] args) {
		
        /*
		 * 
		 * 
		 * 배열 생성 => 배열 출력 => 평균출력 / 출력못할 시(평균을 처리할 수 없습니다.)
		 * 
		 */
		
		Method04 m = new Method04();
		
		//랜덤배열
		int[] arr = m.print();
		
		//배열출력
		System.out.print("랜덤숫자 : ");
		m.printArr(arr);
		
		//합계출력
		System.out.println("합계 : " + m.sum(arr));
		
		//평균출력
		if(m.avg(arr) == -9999999) {
			System.out.println("평균을 처리할 수 없습니다.");
		}else {
			System.out.println("평균 : "+m.avg(arr));
		}
		

	}

}
