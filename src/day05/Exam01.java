package day05;

import java.util.Scanner;

public class Exam01 {

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
		int total = 0;
		int cho = 0;
		//System.out.println(menu[0]+"("+price[0]+"원)");
		

		
		while(true) {
			
			System.out.println("----menu----");
			for(int i = 0; i<menu.length; i++) {
				System.out.print((i+1) + "." + menu[i] + price[i]+"원 ");
			}
			System.out.println();
			System.out.print("메뉴선택 >");
			cho = sc.nextInt();

			if(cho==5) {
				System.out.println("종료합니다");
				break;
		}
			if(cho < 1 || cho > 5) {
				System.out.println("잘못된 메뉴입니다");
				continue;				
			}
		count[cho -1]++;		
		total += price[cho-1];
		
		System.out.println(menu[cho-1]+"1개를 선택했습니다."+ price[cho- 1]+"원");
		
		}
		for(int i = 0; i<menu.length; i++) {
			if (count[i] > 0) {
			System.out.println(menu[i]+" "+count[i]+"개 "+count[i]*price[i]+"원");	
		}

		}
		System.out.println("------총금액--------");
		System.out.println("총금액" + total + "원");
		
		sc.close();
		}
		}

    
				
        	
     
	
	
	
         

         
         
	
	
	
