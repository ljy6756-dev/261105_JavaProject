package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 야구게임
		/* 컴퓨터 랜덤으로 3자리의 숫자를 생성
		 * 각 자리의 숫자는 0~9 중 랜덤숫자 => 중복불가능
		 * 배열로 저장
		 * 
		 * 유저는 3자리를 맞추는 게임
		 * 위치와 숫자가 맞으면 strike
		 * 숫자만 맞으면 ball(위치는 맞지 않을 때)
		 * 자리도 숫자도 없으면 out!!
		 * ex) com : 1 2 3 (변하지 않음)
		 *    user : 1 9 8    => 1 strike
		 *    user : 2 3 8   => 2 ball
		 *    user : 1 2 5   => 2 strike
		 *    user : 1 3 2   => 1 strike 2 ball
		 *    user : 7 8 9   => out!!
		 *    user : 1 2 3   => 정답!!  break;
		 */
		    int comNum[] = new int[3];
	        int userNum[] = new int[3];

	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("----야구게임 시작----");

	        // 1. 컴퓨터 숫자 생성
	        for (int i = 0; i <comNum.length; i++) {
	        	comNum[i] = (int)(Math.random()*10);
	  
	        for(int j = 0; j<i; j++) {
	        	if(comNum[i]==comNum[j]) {
	        		i--;  //i 위치의 값 재생성
		        	break;
	        	}       	
	        }
	        }
	//System.out.println(Arrays.toString(comNum));
	        // 2. 게임 시작
	        while (true) {

	            int strike = 0;
	            int ball = 0;

	            System.out.print("숫자 3자리를 입력하세요 : ");
	            String user = scan.next();

	            // 입력한 숫자를 배열에 저장
	            if (user.length() != 3) {        
	                continue;
	            }

	            for (int i = 0; i < 3; i++) {
	                userNum[i] = user.charAt(i) - '0';
	            }

	            // 3. 첫 번째 숫자 비교
	            if (comNum[0] == userNum[0]) {
	                strike++;
	            } else if (comNum[0] == userNum[1] || comNum[0] == userNum[2]) {
	                ball++;
	            }

	            // 4. 두 번째 숫자 비교
	            if (comNum[1] == userNum[1]) {
	                strike++;
	            } else if (comNum[1] == userNum[0] || comNum[1] == userNum[2]) {
	                ball++;
	            }

	            // 5. 세 번째 숫자 비교
	            if (comNum[2] == userNum[2]) {
	                strike++;
	            } else if (comNum[2] == userNum[0] || comNum[2] == userNum[1]) {
	                ball++;
	            }

	            // 6. 결과 출력
	            if (strike == 3) {
	                System.out.println("정답!!");
	                break;
	            } else if (strike == 0 && ball == 0) {
	                System.out.println("OUT!!");
	            } else {
	                System.out.println(strike + " Strike " + ball + " Ball");
	            }
	        }

	        scan.close();
	    }
	}