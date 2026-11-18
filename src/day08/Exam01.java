package day08;

import java.util.Random;

public class Exam01 {
	// 메서드 오버로딩 조건
	// 매개변수의 개수 다름
	// 매개변수의 순서가 다름

	
	//1. 랜덤수를 리턴하는 매서드 (1~45)
	//매개변수 : 없음 / 리턴타입 : 랜덤수 => 정수 => int
	Random r = new Random();
	
	public int ranNum() {
		return r.nextInt(10)+1; 
//		return (int)(Math.random()*45)+1;   // random r 없을시
		}
	
	// 범위를 입력받아 해당 범위의 랜덤수를 리턴하는 메서드
	// 1~45  / 1~6  / 1~52  / 
	public int makeRandom(int count, int start) {
		return (int)(Math.random()*count)+start;
	}
	
	// 범위로 랜덤수 생성
	public int makeRandom2(int begin, int end) {
		// 1~45 => 45개 / 10 ~ 45 = > 36개  end - begin + 1
		return (int)(Math.random()*end - begin + 1)+begin;
	}
		
		
	
	//2. 중복확인메서드 : 배열에 정수가 있는 확인(true, false)
	//  - 매개변수(배열 int[] arr , 정수 int num)
	//  - 리턴타입 : boolean
	
	public boolean check(int[] arr, int num) {
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	//3. 배열을 매개변수로 받아 랜덤수(1번매서드 호출)를 중복x(2번메서드 호출) 채워주는 메서드
	// 매개변수 : 배열 int[] arr
	// 리턴타입 : 없음void
	public void arr(int[] arr) {
		// int = 0;
		// while(i < arr.lemgth) {
//		int ranodom = makeRandom2(1, 45);
//		if(check(arr, random)) { 
//		arr[i] = random;
//		i++;}
		
		for(int i =0; i <arr.length; i++) {
			int num = ranNum();
			if(check(arr, num)) {
				i--;
			}else {
				arr[i] = num;
			}
		}
	}
	//4. 배열을 출력하는 메서드
	// - 사용자 번호 1 2 3 4 5 6 
	// - 당첨번호 1 2 3 4 5 6 [7] * 보너스 번호 별도 표시(가장 마지막 뽑힌번호)
	// 매개변수 : 배열 int[] arr / 출력 = void
	
	public void printArr(int[] arr, String title) {
		System.out.print(title + " : ");
		for(int i = 0; i<arr.length; i++) {

		if(title.equals("당첨번호") && i == 6) {
			System.out.println("["+arr[i]+"]");
			
		}else {
			System.out.print(arr[i] + " ");
		}
	}
	}
	// 5. 당첨을 확인하는 메서드
	
	/* - 6개 일치 = 1등(순서상관업음, 보너스 제외)
	 * - 5개 일치 + 보너스번호 = 2등
	 * - 5개 일치 = 3등
	 * - 4개 일치 = 4등
	 * - 3개 일치 = 5등
	 * - 나머지 꽝
	 */
	
	public void rank(int[] user, int[] lotto) {
		int count = 0;
		boolean bonus = false;
		// - 사용자번호, 당첨번호를 받아서 등수를 출력하는 메서드
		for(int i =0; i<user.length; i++) {
			for(int j = 0; j < 6; j++) {
				if(user[i] == lotto[j]) {
					count++;
				}
			}
			if(user[i] == lotto[6]) {
				bonus = true;
			}
		}
		if(count == 6) {
			System.out.println("1등 당첨");
		}else if(count == 5 && bonus) {
			System.out.println("2등 당첨");
		}else if(count == 5) {
			System.out.println("3등 당첨");
		}else if(count == 4) {
			System.out.println("4등 당첨");
		}else if(count == 3) {
			System.out.println("5등 당첨");
		}else {
			System.out.println("꽝! 다음기회에!");
		}
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// 로또 만들기
		/* - 사용자 번호 (6자리)
		 * - 당첨 번호(7자리)
		 * 
		 */
		
		int user[]= new int[6];
		int lotto[] = new int[7];

		Exam01 m = new Exam01();
		System.out.println(m.makeRandom(6, 1));
		System.out.println(m.makeRandom2(1, 10));
		
		m.arr(user);
		m.printArr(user, "사용자번호");
		System.out.println();
		m.arr(lotto);
		m.printArr(lotto, "당첨번호");
		
		m.rank(user, lotto);
		
		
		
	}

}
