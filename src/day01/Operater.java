package day01;

public class Operater {

	public static void main(String[] args) {
		/* 연산자
		 * 대입연산다 : = 오른쪽에 있는 리터럴 값을 왼족의 변수에 저장
		 * a = b
		 * b 변수의 값을 a변수로 덮어쓰기(대입, 저장)
		 * 왼쪽은 반드신 변수여야함.
		 * a = 10(가능)  / 10 = a (불가능)
		 * 문자열 + 숫자 = 문자열로 변환(1+a = a1)
		 * != 같지않다
		 * art + ctrl : 복사 / ctrl +  : 삭제
		 */ 
		int a = 10;
		int b = 20;
		a = b + 10;
		System.out.println(a);
		// 10 = a; 에러발생
		
		// 문자연결 : +
		System.out.println("a = "+a); //연산의 결과는 String
		
		// 산술연산자 : + - * / %(나머지)
		System.out.println(4+3);
		System.out.println(4-3);
		System.out.println(4*3);
		System.out.println(4/3.0);  // 실수 .0 추가
		System.out.println(4%3);
		
		/* 나누기
		 * 정수 / 정수 = 정수(소수점 버림)
		 * 정수 / 실수 = 실수
		 * 실수 / 정수 = 실수
		 * 실수 / 실수 = 실수 
		 * */
		// 자료형 변환 casting (자료형 변수)
		//System.out.println(a/b); 불가
		System.out.println((double)a/b);
		
		// ==(같다), !=(같지않다), >(초과), <(미만), >=(이상), <=(이하)
        // 비교연산의 결과는 항상 true / false
		System.out.println(a>b);
		System.out.println(a==b);
		
		// 논리연산자 : ! 아니다 / && 그리고 / || 또는]
		System.out.println(!(a==b));
		// && : 모든 조건이 참이어야 함
		// || : 하나만 참이어도 참
		System.out.println((1<3) && (3>4));
		System.out.println((1<3) || (3>4));
		
		
		// 삼항연산자
		// 조건식 ? true : false
		System.out.println(a==b ? "a와 b가 같습니다." : "a와 b는 다릅니다.");
		
		// 증감연산자 : ++(1씩증가), --(1씩감소)
		System.out.println(a); //30
		a++; //31
		System.out.println(a); // 31
		a--; // 30
		System.out.println(a); // 30
		System.out.println(++a); // 30출력 후 1 증가
		// a = 31
		a = a + 1;
		System.out.println(a); // 32
		++a; // 증가 우선
		a++; // 나중 증가
		
		// 복합연산자 : +=
		a += 2; // a = a + 2 와 같다.
		
		//교재 33장에 있음
				 
				 

	}

}
