package day09;

import java.util.Arrays;

public class Class05t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tv1 t = new tv1();
		System.out.println(t.toString());
		t.power();
		t.chUP();
		t.chUP();
		t.chDOWN();
		t.chDOWN();
		t.chDOWN();
		t.chDOWN();
		t.chDOWN();
		t.chDOWN();
		t.volUP();
		t.chDOWN();
		t.chDOWN();
		t.volDOWN();
		t.volDOWN();
		t.volDOWN();
		t.volUP();
		t.volUP();
		t.volUP();
		t.volUP();
		t.pick();
		t.favorList();
		t.chUP();
		t.pick();
		t.favorList();
		t.chUP();		
		t.pick();
		t.favorList();
		t.chUP();
		t.pick();
		t.favorList();
		t.chUP();
		t.pick();
		t.favorList();
		t.chUP();
		t.pick();
		t.favorList();
		
		t.power();
		t.power();
		t.chUP();
		t.pick();
		t.favorList();
		System.out.println(t.toString());
	}

}

class tv1{
	// brand, power, ch(순환구조 1~10), vol(0~10), favol[5]
	// ch은 20번 까지 더 넘어가면 0번으로 돌아감
	// vol 10에서 더이상 안올라감 / 0은 음소거
	
	/* 선호채널 등록
	 * 5개 까지 등록 가능(배열)
	 * 1. 선호채널 등록 매서드
	 * - 현재 채널 번호를 선호채널 배열에 넣기
	 * 2. 선호채널의 리스트 보기
	 * - 등록된 선호채널을 리스트로 출력
	 * 
	 */
	private final String BRAND = "LG";   // 변경할 수 없는 값
	private boolean power;
	private int ch = 1;
	private int vol;
	private int[] favor = new int[5];
	private int index;
	private int count;
	
	
	//생성자
	public tv1() {
//		this.BRAND = "LG";   // 중간에 바꿀수 없는값 ==상수 == final = 전부 대문자
		this.ch = 3;
		this.vol = 3;
		this.favor = new int[5];   // 생성자로 객체 생성시 배열의 실 객체를 메모리에 올림
	
	}

	
	//메서드
	//pick() : 선호채널 등록 => 메서드를 한번 호출하면 배열 1개 채워짐
	// 번지로 사용할 변수가 필요함, => 메서드를 호출할 때마다 +1 증가
//	public void pick() {
//		int index = 0; => 호출할 때마다 0번지로 변경
//		boolean check = false;
//	if(power) {
//		if(favol.length == index) {
//			index=0;
//		}
//	}
//			//채널의 중복방지
//			for(int i= 0; i<favol.length; i++) {
//				if(favol[i] ==ch) {
//					check = true;
//				}
//			}
//			if(!check) {
//				favol[index] = ch;
//				index++;  // 선호채널 하나 등록
//				count++;  // 선호채널 등록한 횟수
//			}
//			System.out.println(ch+"번 선호채널 등록완료!!");
//		}
//	}
	
	public void pick() {
		// 2. 배열을 늘려서 값을 더 추가
		boolean check = false;
		if(power) {
			if(index  == favor.length) {
				//배열을 늘려서 추가
				int[] arr = new int[favor.length+3];  // 현재 배열의 3개 추가
			System.arraycopy(favor, 0, arr, 0,favor.length);
			//배열의 주소변경
			favor = arr;
			}
			for(int i= 0; i<favor.length; i++) {
			if(favor[i] ==ch) {
			check = true;
		}
	}
	if(!check) {
		favor[index]= ch;
		index++;
	}
		}
	}

	//favolList : 선호채널 리스트
	public void favorList() {
		// index의 위치에 따라 선호채널 등록 개수 확인
		System.out.println("----선호채널 List----");
		if(count==0) {
			System.out.println("등록된 선호채널이 없습니다.");
			return;
		}
		int cnt = count > index ? favor.length : index;
		for(int i = 0; i<cnt; i++) {
			System.out.print(favor[i]+"  ");
		}
		System.out.println();
	}
	
	
	// power on/off
	public void power() {
		this.power = !this.power;
		if(this.power) {
			System.out.println(BRAND+"TV전원이 켜집니다");
		}else {
			System.out.println(BRAND+"TV전원이 꺼집니다");
		}
//		System.out.println(power ? BRAND+"전원이 켜집니다" : BRAND+"전원이 꺼집니다");
	}
	
	//chUp(1~10까지 순환구조)
	public void chUP() {
		if(power){
			ch++;
			if(ch > 10) {
				ch=1;
			}
			System.out.println("ch:"+ch);
		}
	}
	//chDOWN
	public void chDOWN() {
		if(power) {
			ch--;
			if(ch <1) {
				ch=10;
			}
			System.out.println("ch:"+ch);
		}
	}
	
	//volUP
	public void volUP() {
		if(power) {
			vol++;
			if(vol>10) {
				vol = 1;
			}
			System.out.println("vol:"+vol);
		}
	}
	
	//volDOWN
	public void volDOWN() {
		if(power) {
			vol--;
			if(vol <=0) {
				vol=0;
				System.out.println("음소거");
				return;
			}
			System.out.println("vol:"+vol);
		}
	}
	
	
	
	//toString : 멤버번수를 String 리턴
	
	@Override
	public String toString() {
		return "tv1 [BRAND=" + BRAND + ", power=" + power + ", ch=" + ch + ", vol=" + vol + ", favol="
				+ Arrays.toString(favor);
	}
	
	//getter / setter

	public boolean isPower() {
		return power;
	}


	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int[] getFavol() {
		return favor;
	}

	public void setFavol(int[] favol) {
		this.favor = favol;
	}
	

	
	
}