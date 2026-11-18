package day04;

public class For04 {

	public static void main(String[] args) {
		// 약수 : 나누어서 떨어지는 수의 집합
		/* 6의 약수 : 1, 2, 3, 4
		 * 6%1==0
		 * 6%2==0
		 * 6%3==0
		 * 6%4==2
		 * 6%5==1
		 * 6%6==0
		 * 
		 */
//		int number = 12;
//		//1~ number 까지 반복
//		// number % i ==0 => 출력
//		for(int i=1; i<=number; i++) {
//			if(number % i ==0) { System.out.print(" "+i);
//			}
//		}
		
		//공약수 : 두 수의 공통된 약수
		/*6,12의 공약수
		 * 6: 1, 2, 3, 6
		 * 12: 1, 2, 3, 4, 6, 12
		 *공약수 : 1,2,3,6
		 *공약수 중 가장 큰 수 = 최대공약수 => 6
		 * 
		 * 
		 */

		int num1 = 6;  // num1 % i == 0
		int num2 = 12;  // num2 % i == 0
		int gcd = 0;
		for(int i=1; i<=num1; i++) {
			if(num1 % i == 0 && num2 % i ==0) {
				gcd = i;
			}

		}
		
		System.out.print("최대 공약수 : "+gcd);
		
	   for(int i=num1; ;i--) {
		   if(num1%i==0 && num2%i==0) {
			   System.out.println("최대공약수 : "+i);
			   break;
		   }
	   }
	   
	   //------------------------------------------------
	   //배수 : 1부터 값을 곱해서 나오는 값
	   //10의 배수 : 10, 20, 30, 40, 50, ....
	   //15의 배수 : 15, 30, 45 ,60, ......
	   //공배수: 두 수의 공통돤 배수 => 30, 60, 90, .....
	   //최소 공배수 : 30
	   
	   int n1 = 10; 
	   int n2 = 15; 
	 
	 a:  for(int i =n1;;i=i+n1) {
		   if(i % n1 ==0 && i% n2 ==0) { 
System.out.println("최소공배수 : "+i);
break a;
		   }
	   }
	}

}
