package day11;

import java.util.Arrays;
import java.util.Random;

public class CardPack {
	/*
	 * 52장의 Card 객체를 배열로 저장 pack ♥A~♥K / ◆A~◆K / ♣A~♣K / ♠A~ ♠K
	 * 
	 * 멤버변수 : 52장의 Card 객체를 담을 수 있는 배열 + 번지 - 생성자 : pack의 초기값을 52장의 카드로 초기화 - 메서드 1.
	 * 카드를 섞는 기능 2. 플레이어에게 한장씩 나눠주는 기능 3. 카드를 초기화 기능 (나눠준 카드 회수)
	 * 
	 */

	private Card[] pack = new Card[52]; // 초기값 null
	private int index = 0; // 카드 나눠주는 위치

	public CardPack() {
		String[] shape = { "♥", "◆", "♣", "♠" };

		int cnt = 0;

		for (int i = 0; i < shape.length; i++) {
			for (int j = 1; j <= 13; j++) {

				Card c = new Card();

				c.setShape(shape[i]);
				c.setNum(j);

				pack[cnt] = c;
				cnt++;
			}
		}
	}

	// 카드섞기
	public void shuffle() {

		Random ran = new Random();

		for (int i = 0; i < pack.length; i++) {

			int r = ran.nextInt(52);

			// 카드 위치 바꾸기
			Card temp = pack[i];
			pack[i] = pack[r];
			pack[r] = temp;
		}
		System.out.println("카드를 섞었습니다.");
	}

     // 카드 한 장씩 나눠주기
	public Card deal() {

		if (index >= pack.length) {
			System.out.println("남은 카드가 없습니다.");
			return null;
		}

		return pack[index++];
	}
	//카드 초기화
	public void reset() {
		index = 0;
		
		System.out.println("카드를 모두 회수했습니다.");
	}
	
	
	
	
	//getter, setter

	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "CardPack [pack=" + Arrays.toString(pack) + ", index=" + index + "]";
	}

	
	
	
	
}
