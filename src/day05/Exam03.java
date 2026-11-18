package day05;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 가위 바위 보
		/*
		 * 컴퓨터와 유저가 가위바위보 게임을 진행 컴퓨터는 랜덤으로 값을 지정 0, 1, 2 중 선택 가위 = 0, 바위 =1, 보 = 2
		 * 
		 * 유저도 input 0 1 2 중 선택
		 * 
		 * ex) com = 0 / me = 0 com (가위) / me(가위) => 무승부 com =0(가위) / me=1(바위) => me 승리
		 * 
		 * 유저의 입력값중 0 1 2 외의 다른 값이 입력되면 입력오류 => 다시입력
		 * 
		 */

//		int user = 0;
//		int count0 = 0;
//		int count1 = 0;
//		int count2 = 0;
//		int sum = count0 + count1 + count2;
//
//		Scanner sc = new Scanner(System.in);
//		int com = (int) (Math.random() * 3);
//		System.out.println("가위바위보게임!!");
//
//
//		do {
//			System.out.println("나의 선택은? (9번 종료)");
//			user = sc.nextInt();
//		
//
//			if(user == 9) {
//				System.out.println("종료합니다");
//			    break;
//			}
//			
//			if (com < 0 || user > 2) {
//				System.out.println("입력오류. 다시입력하세요.");
//				continue;}
//			
//			String comRe = "";
//			String userRe = "";
//			
//			if(com == 0) {
//				comRe = "가위";
//			} else if(com == 1) {
//				comRe = "바위";
//			}else{
//				comRe = "보";
//			}
//			
//			if(user == 0) {
//				userRe = "가위";
//			} else if(user == 1) {
//				userRe = "바위";
//			}else{
//				userRe = "보";
//			}
//			
//			System.out.print("컴퓨터: "+comRe);
//			System.out.println("/ 유저: "+userRe);
//			
//			
//			if (com == user) {
//				count0++;
//				sum+=count0;
//				System.out.println("무승부입니다");
//			} else if ((user == 0 && com ==2) || (user == 1 && com ==0) || (user == 2 && com == 1)) {
//				count1++;
//				sum+=count1;
//				System.out.println("유저 승리!!");
//			} else {
//				count2++;
//				sum+=count2;
//				System.out.println("컴퓨터 승리!!");
//			} 
//	}while(user != 9); {
//		System.out.println("----가위바위보 최종결과----");
//		System.out.println("총: "+sum+"회");
//		System.out.println("유저: "+count1+"승"+count2+"패");
//		System.out.println("컴퓨터: "+count2+"승"+count1+"패");
//		System.out.println("무승부: "+count0+"회");
//		
//	}
//	sc.close();
		
		Scanner sc = new Scanner(System.in);
		String[] choice = {"가위", "바위", "보"};
		
		int comNum = (int)(Math.random()*3);
		System.out.println("가위바위보 시작~!!");
		System.out.println(comNum + "/" +choice[comNum]);
		
		System.out.println("가위(0), 바위(1), 보(2) 중 선택 >");
		
		int myNum = sc.nextInt();		
//		System.out.println(myNum + "/" +choice[comNum]);
		
		System.out.print("com:"+choice[comNum] + "/ user"+choice[myNum]+"=>");
		if(comNum == myNum) {
			System.out.print("무승부!!");
		}else {
			if(myNum == 0) {
				System.out.println(comNum == 2 ? "유저 승" : "유저 패");
			}else if(myNum ==1) {
				System.out.println(comNum == 0 ? "유저 승" : "유저 패");
		}else {
			System.out.println(comNum == 1 ? "유저 승" : "유저 패");

		}

			
		
		sc.close();
		}	
	}

	}		
