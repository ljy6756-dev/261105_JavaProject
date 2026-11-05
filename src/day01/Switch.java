package day01;

public class Switch {

	public static void main(String[] args) {
		// 조건문 : if, switch(딱딱 끊어질때)
		/* switch(변수 / 식){
		 *   case 값1: 실행문; Break;
		 *   case 값2: 실행문; Break;
		 *   case 값3: 실행문; Break;
		 *   default : 실행문;
		 * }
		 * 
		 * Break : 실행중인 구문을 강제로 빠져나오게 하는 구문(조건문을 동반)
		 */

		int number = 5;
		
		// number % 2 
		switch(number % 2) {
		case 0: System.out.println("짝수");
		break;
		case 1:System.out.println("홀수");
		break;
		default: System.out.println("이상한수");
		

		}
		//1~6까지 주사위 숫자를 num 라고 가정
		//switch 문을 이용하여 넘버의 숫자까지 전진
		int num = 5;
		
		switch(num) {
		case 1: System.out.println("1칸 전진"); // (num+"칸전진)
		break;
		case 2: System.out.println("2칸 전진");
		break;
		case 3: System.out.println("3칸 전진");
		break;
		case 4: System.out.println("4칸 전진");
		break;
		case 5: System.out.println("5칸 전진");
		break;
		case 6: System.out.println("6칸 전진");
		break;
		default: System.out.println("재시도");
		}
		
		
//----------------------------------------------------
int num1 = 5;
		
		switch(num) {
		case 1: System.out.println(num1+"칸 전진"); // (num1+"칸전진)
		break;
		case 2: System.out.println(num1+"칸 전진");
		break;
		case 3: System.out.println(num1+"칸 전진");
		break;
		case 4: System.out.println(num1+"칸 전진");
		break;
		case 5: System.out.println(num1+"칸 전진");
		break;
		case 6: System.out.println(num1+"칸 전진");
		break;
		default: System.out.println("재시도");
	}
		
		switch(num) {
		case 1: case 2: case 3: case 4: case 5: case 6:
		System.out.println(num+"칸 전진");
		break;
		default: System.out.println("다시");
		}
		
		int month = 11;
		// 3~5 봄 6~8 여름 9~11 가을 12~2 겨울
		switch(month) {
		case 3: case 4: case 5: 
			System.out.println("봄");
			break;
		case 6: case 7: case 8: 
			System.out.println("여름");
			break;
		case 9: case 10: case 11: 
			System.out.println("가을");
			break;
		case 12: case 1: case 2: 
			System.out.println("겨울");
			break;
		default: 
			System.out.println("그런 계절은 없슴다");
 

}
	
}
}


