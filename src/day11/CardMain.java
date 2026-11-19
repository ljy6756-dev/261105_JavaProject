package day11;

public class CardMain {

	public static void main(String[] args) {
		// Card c = new Card(!2)
		/* 예) ♥1 => ♥A , ♥5 => ♥E, ♣11 => ♣J
		 * 범위에 없는 모양이면 : ♥
		 * 범위에 없는 숫자면 : 1 => A
*/
	    CardPack cp = new CardPack();
	    System.out.println(cp);
	    
	    cp.getPack()[2].print();
	    
	    //카드 섞기
		System.out.println("딜러가 카드를 섞고 있습니다.");
		cp.shuffle();
		//카드 한 장씩 나눠주기
		//player 4명
		System.out.println("딜러가 카드를 나누고 있습니다.");
		cp.deal().print();	
		System.out.println("player1 카드 pick");
		
		//메서드 호출
		cp.deal().print();
		System.out.println("player2 카드 pick");

		//메서드 호출
		cp.deal().print();
		System.out.println("player3 카드 pick");

		//메서드 호출
		cp.deal().print();
		System.out.println("player4 카드 pick");

		//메서드 호출
		
		
//		System.out.println("player1 card open!");
//		//카드출력
//		System.out.println("player2 card open!");
//		//카드출력
//		System.out.println("player3 card open!");
//		//카드출력
//		System.out.println("player4 card open!");
		//카드출력
		
		//카드 회수
		cp.reset();
		
		//카드 나눠주기
		System.out.println("회수 후 다시 나눠주기");
		
		
		
		
		
		
		System.out.println("----------------------------------");
		Card c = new Card();

		// 기본 생성자 확인
		c.print();  // ♥A

		// 숫자와 모양 변경
		c.setNum(11);
		c.setShape("♣");

		c.print();  // ♣J

		// 숫자 범위를 벗어난 경우
		c.setNum(15);
		c.setShape("★");

		c.print();  // ♥A

		// toString 확인
		c.setNum(12);
		c.setShape("♠");
		
		c.print();   // ♠Q
		System.out.println();
		System.out.println("----------------------");
		String shape[] = {"♥", "◆", "♣", "♠"};
		
		for(int i = 0; i<shape.length; i++) {
			for(int j=1; j<=13; j++) {
				Card cp1 = new Card();
				cp1.setShape(shape[i]);
				cp1.setNum(j);
				cp1.print();
			}
			System.out.println();
		
		}

	}

}
