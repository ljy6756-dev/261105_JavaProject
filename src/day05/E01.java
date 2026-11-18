package day05;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		/*----menu----
		 * 1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5.종료
		 * menu >1
		 * 과자 1개를 선택했습니다. 2000원
		 * menu >2
		 * 라면 1개를 선택했습니다. 3000원
		 * menu >5
		 * 과자1개 2000원
		 * 라면 1개 3000원
		 * ----------------
		 * 총금액 5000원
		 * 
		 * 종료를 누를 때까지 반복
		 * 1~5를 벗어난 메뉴는 다시입력
		 */
		
		Scanner sc= new Scanner(System.in);
		
		String menu[]= {"과자","라면","사탕","젤리"};
		int price[]= {2000, 3000, 500, 500};
		int count[]= new int[menu.length];
		int choice = 0;
		int sum = 0;
		
		do {
			System.out.println("----menu----");
			for(int i = 0; i<menu.length; i++) {
				System.out.print((i+1)+"." + menu[i] +" "+price[i]+"원");
			}
			System.out.println();
			System.out.println("메뉴를 고르세요 >");
			choice = sc.nextInt();
			
			if(choice ==5) {
				System.out.println("종료합니다");
				break;
			}
			
			if(choice >0 || choice < 5) {
				System.out.println("다시 선택");
			}
			
			count[choice-1]++;
			sum += price[choice-1];
			System.out.println(menu[choice-1] +" "+count[choice-1] +"개 "+"선택"+"("+price[choice-1]+"원)");
			
			
		}while(choice !=5);
		System.out.println("----------------------");
		for(int i=0; i<menu.length; i++) {
			if(count[i] != 0) {
				System.out.println(menu[i]+"("+price[i]+"원) * "+count[i] +
						" = "+(price[i]*count[i]));
				sum += (price[i]*count[i]);
		}
			
sc.close();
		
	}
	}
}

