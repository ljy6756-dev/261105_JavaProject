package day06;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 정수배열[10] => 0~100까지 랜덤으로 채우기 => 출력
		// 오름차순으로 정렬 => 출력(2중for문)

		int arr[] = new int[10];

		
		for(int i= 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					int t = arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
				
				
			}
			
		}
		System.out.println("Arrays.sort(arr) : 오름차순정렬");
		Arrays.sort(arr);
		// Cellections.reversOder() => Object 가능 Int 내림차순
	    // Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
