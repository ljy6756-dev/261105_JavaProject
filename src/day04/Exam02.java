package day04;

import java.util.Scanner;

public class Exam02 { 

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
         Scanner sc = new Scanner(System.in);
   
         int menu = 0;
         int count1 = 0; //(1번 메뉴의 수)
         int count2 = 0;
         int count3 = 0;
         int count4 = 0;
         int total = 0;

         do{
        	 System.out.println("---menu---");
        	 System.out.println("1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5.종료");
        	 System.out.println("메뉴를 선택하세요");
        	 menu = sc.nextInt();
        	 
        	
        	 
        	 if(menu < 1 || menu > 5) {
        		 System.out.println("다시입력해주세요");
        		 continue;
        		 
        
        	 }
        	 
        	 switch(menu) {
        	 case 1:
        		 System.out.println("과자 1개를 선택했습니다");
        		 count1++;
        		 total += 2000;
        		 break;
        	 case 2:
        		 System.out.println("라면 1개를 선택했습니다");
        		 count2++;
        		 total += 3000;
        		 break;
        	 case 3: 
        		 System.out.println("사탕 1개를 선택했습니다");
        		 count3++;
        		 total += 500;
        		 break;
        	 case 4:
        		 System.out.println("젤리 1개를 선택했습니다");
        		 count4++;
        		 total += 5000;
        		 break;
        	 case 5:
        		 System.out.println("종료합니다");
        		 break;
        		 default:
        			 System.out.println("메뉴에 없습니다");
        	 }        	 
        	 
         }while(menu !=5);
         
         //  total = (count1*2000) + (count2*3000) + (count3*500) + ()
             System.out.println("-----------------------");
             System.out.println("과자"+count1+"개: "+count1*2000+'원');
             System.out.println("라면"+count2+"개: "+count1*3000+'원');
             System.out.println("사탕"+count3+"개: "+count1*500+'원');
             System.out.println("젤리"+count4+"개: "+count1*500+'원');
        	 System.out.println("총금액" + total + "원");
         
      		sc.close();	 
         

        	 }
         
         }

         
         
	
	
	
