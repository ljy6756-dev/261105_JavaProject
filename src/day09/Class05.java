package day09;

import java.util.Arrays;

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tv t = new tv();
		t.printbr("Lg전자");  // 브랜드 입력
		t.power();  // 전원 on
		t.chUp();   // 
		t.favAdd();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		
		t.chUp();
		t.favAdd();
		t.favList();
		System.out.println();
	}

}


class tv{
	// brand, power, ch, vol, favol[]
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
	private String brand;
	private boolean power;
	private int ch = 1; 
	private int vol;
	private int[] favol = new int[5];
	
	private int count;
	
	//브랜드
	public void setbrand(String brand) {
		this.brand = brand;
	}
	
	//출력 메서드
	public void printbr(String brand) {
		System.out.println("TV brand: "+brand);
	}
	public void printFavol(int favol) {
		System.out.println("선호채널: ");
	}
	
	// 전원 on off
	public void power() {
		if(power== false) {
			power = true;
			System.out.println("TV 전원이 켜졌습니다.");
		}else {
			power = false;
			System.out.println("TV 전원이 꺼졌습니다.");
		}
	}
		
	// 채널 올리기
	public void chUp() {
		if(power == true) {
			ch++;
			if(ch>20) {
				ch=0;
			}
			System.out.println("현재 채널 : "+ch);
		}else {
			System.out.println("TV 전원을 켜주세요.");
		}
	}
	// 채널 내리기
	public void chDown() {
		if(power == true) {
			ch--;
			if(ch <0) {
				ch=20;
			}
			
			System.out.println("현재채널 : "+ch);
		}else {
			System.out.println("TV 전원을 켜주세요.");
		}
	}
	//볼륨 올리기
	public void volUp() {
		if(power == true) {
			vol++;
			if(vol > 10) {
	
			}
			System.out.println("현재 볼륨 : "+vol);
		}else {
			System.out.println("TV 전원을 켜주세요.");
		}
	}
	//볼륨 내리기
	public void volDown() {
		if(power == true) {
			if(vol > 0) {
				vol--;
			}
			System.out.println("현재 볼륨 : "+vol);
		}else {
			System.out.println("TV 전원을 켜주세요");
		}
	}
	
	//선호채널 등록
	public void favAdd() {
		if(count <= 5) {
			favol[count] = ch;
			count++;
			System.out.println("선호채널이 등록되었습니다");
		}else {
			System.out.println("선호채널은 최대 5채널까지 등록 가능합니다.");
		}
	}
	
	//선호채널리스트
	public void favList() {
		System.out.println("-----선호채널-----");
		for(int i = 0; i<count; i++) {
			System.out.print(favol[i]+"번 ");
		}
		System.out.println();
	}
	
	//get / set

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
		return favol;
	}

	public void setFavol(int[] favol) {
		this.favol = favol;
	}
}