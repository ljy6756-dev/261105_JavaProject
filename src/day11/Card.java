package day11;

public class Card {
	// 숫자 : (1~13) 1(A), ~ 11(J), 12(Q), 13(K)
	// 모양 : ♥, ◆, ♣, ♠

	/*
	 * 예) ♥1 => ♥A , ♥5 => ♥E, ♣11 => ♣J 범위에 없는 모양이면 : ♥ 범위에 없는 숫자면 : 1 => A 위 내용을
	 * main에서 확인
	 */
	/*
	 * 멤버변수 : 숫자(num), 모양(shape) - getter / setter - toString - 출력 메서드 (숫자가 입력되면 A J
	 * Q K 가 입력되면 영어로 변경해서 출력) switch 또는 if 가능
	 * 
	 */
	private int num;
	private String shape;

	public Card() {
		this.num = 1;
		this.shape = "♥";
	}

	// print 메서드

	public void print() {
		System.out.print(shape);
		switch (num) {
		case 1: System.out.print("A "); break;
		case 11: System.out.print("J "); break;
		case 12: System.out.print("Q "); break;
		case 13: System.out.print("K "); break;
		default: System.out.print(num+" "); break;
		}
	}
	// 숫자가 입력되면 A J Q K 가 입력되면 영어로 변경해서 출력

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		// 숫자범위설정
		if (num < 1 || num > 13) {
			this.num = 1;
			return;
		} 
		this.num = num;
		}
	

	public String getShape() {
		return shape;
		}

	public void setShape(String shape) {
		//모양범위 설정 //모양 : ♥, ◆, ♣, ♠
		if(shape.equals("♥") || shape.equals("◆") || shape.equals("♣")||shape.equals("♠")) {
		this.shape = shape;
	}else {
		this.shape = "♥";
	}	
		/* switch(shape) {
		 * case "♥" :
		 * case "◆" : 
		 * case "♣" : 
		 * case "♠" : 
		 * this.shape = shape;
		 * }
		 */
}
	
	
}
