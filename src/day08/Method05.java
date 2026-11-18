package day08;

import java.util.Arrays;

import day07.Exam01;

public class Method05 {
	
	/* 매서드 생성
	 * 1. 배열을 받아 출력하는 메서드(호출가능)

	 * 2. 배열을 받아 오름차순 정렬하는 메서드
	 * 매개변수 : int[] arr
	 * 메서드명 : sort
	 * 리턴타입 : void
	 */ 
	
	public void sort(int[] arr) {
		if(arr ==null) {  // 에러상황 대비  
			return;
		}
		for(int i=0; i<arr.length; i++) {
			for(int j =i+1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
				int t = arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				}
			}
		}
	}
	
	  
	 /*
	 * 3. 배열을 받아서 합계, 평균, 최대 최소 출력
     *    - 합계와 평균은 다른 메서드를 호출 Exam02 호출
	 *  - 최대, 최소 따로 출력
	 * 매개변수 : int[] arr
	 * 메서드명 : 최대값 : int max
	 * 리턴타입 : 어
	 *  
	 */
	
	public int Max(int[] arr) {
		if(arr == null) {
			return -999999;
		}
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			}
		return max;
		}
		
	public int Min(int[] arr) {
		if(arr == null) {
			return -999999;
		}
		int min = arr[0];
		for(int t : arr) {
			if(min > t) {
				min = t;
			}	
		}
		return min;
	}
	// 메서드는 같은 이름의 메서드 기능 => 메서드오버로딩
	// 오버로딩 조건
	// 매개변수가 달라야 함. (타입이 달라야 함, 개수가 달라야 함.)
	
	

	public static void main(String[] args) {
		/* 매서드 생성
		 * 1. 배열을 받아 출력하는 메서드
		 * 2. 배열을 받아 오름차춘 정렬하는 메서드
		 * 3. 배열을 받아서 합계, 평균, 최대 최소 출력
		 *    - 합계와 평균은 다른 메서드를 호출 Exam02 호출
		 *    - 최대 값 리턴, 최소값 리턴 별도
		 * 
		 */

		
		int[] arr = {77,45,35,47,76,56,25,46,87,63,34,78,65,98,54};
    
		Method04 m4 = new Method04();
		m4.printArr(arr);
		

		
//	    System.out.println(Math.max(max, arr1.length));
//	    System.out.println(Math.min(min, arr1.length));
		
		Exam01 e01 = new Exam01();
		int sum = e01.sum(arr);
		System.out.println("합계 : "+sum);
		double avg = e01.avg(arr);
		System.out.println("평균 : "+avg);
		
		
		Method05 m5 = new Method05();
		m5.sort(arr);
		m4.printArr(arr);
		
		int max = m5.Max(arr);
		int min = m5.Min(arr);
		if(max ==-999999) {
			System.out.println("배열 오류!!");
		}
		if(min == -999999) {
			System.out.println("배열 오류!!");
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);

		
	}

}
