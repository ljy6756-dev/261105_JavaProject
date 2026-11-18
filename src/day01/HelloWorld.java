package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// 매서드 (method) : 함수(function)
		// 실행을 담당(콘솔 실행, class안에 main이 있어야 실행가능)
		// 주석 : 실행과 상관없는 영역(ctrl + / +> 한번더 누르면 풀림)
		/* 여러줄 주석
		 * java
		 * package => class => method 실행가능
		 * main : 실행담당
		 * println() : 괄호 안의 값을 콘솔 출력(줄바꿈 포함)
		 * print() : 줄바꿈x
		 * 마지막 끝처리 : 세미클론 ;
		 * 문자 : String 클래스를 사용 
		 */
		System.out.println(123*45);
		/* 실행 : ctrl + f11
		 * 숫자 : +, -
		 * 문자 : "문자는 모두 큰따옴표로 묶기"
		 * 한글자의 문자 : 'a' => char
		 * 
		 */
		System.out.println("HelloWorld");
		System.out.println('a');
		
		// = (대입) 오른쪽의 리터널 값을 왼쪽의 변수에 넣는다.
		int number = 10;
		System.out.println(number);
		
		number = 20;
		System.out.println(number);
		
		String str = "123";
		System.out.println(str+10);
		int st = Integer.parseInt(str);  //문자를 숫자로 변환
		System.out.println(st);
		
		//---------------------------------
		
		byte b = 20;
		short s = 100;
		long l = 100L; // 접미사 l/L 선택
		float f = 1.1f;  // 접미사 f/F 필수
		double d = 1/1;
		char ch = 'a';
	}

}
