package day05;

import java.util.Arrays;

public class String02 {

	public static void main(String[] args) {
		// String method

		// toLowerCase() / toUpperCase() : 소문자변환 / 대문자변환
		// jpg, JPG, Jpg => jpg

		System.out.println("--toLowerCase() / toUpperCase()--");
		System.out.println("Jpg".toLowerCase()); // 소문자로
		System.out.println("jpg".toUpperCase()); // 대문자로

		// isEmpty() : 값이 비었는지 확인(공백도 데이터가 있는 것으로 간주)
		// true / false
		System.out.println("--isEmpty()--");
		System.out.println(" ".isEmpty());

		// isBlank() : 값이 비었는지 확인(공백은 (데이터가 없는) 비어있는것으로 간주)

		System.out.println("--isBlank()--");
		System.out.println(" ".isBlank());

		// trim() : 불필요한 공백 제거(날씨 주식등 데이터 가져올떄 빈공간 제거 함)
		System.out.println("--trim()--");
		System.out.println("         abc         ".trim());

		// replace() : 글자를 변환
		System.out.println("--replace--");
		// 2026-11-06 =>2026/12/9
		System.out.println("2024-11-09".replace("-", "/"));

		// split : 특정 값으로 나누기 => 배열로 리턴
		String str = "apple, banana, kiwi, orange";
		System.out.println("--split--");
		String[] arr = str.split(",");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString("1234".split("")));

		// 문자를 숫자로 변경 => Integer.parseInt()
		String num = "123";
		int num2 = Integer.parseInt(num);
		System.out.println(num2);

		// 숫자를 문자로 변경 String.valueOf()
		String num3 = String.valueOf(num2);
		System.out.println(num3);

		// instanceof : 같은 클래스인지 비교하는 연산자(클래스 자료형만 가능)
		System.out.println(num3 instanceof String);
		
		
		

	}

}
