package day09;

public class Class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	car cars = new car();

	cars.power();   //시동 켜고
	cars.speedUp();
	cars.speedUp();
	cars.speedUp();
	cars.speedUp();
	cars.speedUp();
	cars.speedUp();
	
		
	}

}

//생성자 - 멤버변수 아래
/* 객체를 생성할 때 (new)초기값을 지정해주는 역할
 * 기본생성자 : 컴파일러가 자동으로 제공(컴파일시 생성자가 없으면...)
 *  - object = null / 숫자 = 0 / boolean = false
 *  - 다른생성자가 존재하면 자동으로 주지 않음.
 * 기본생성자는 사용자가 직접 생성가능.
 * 생성자는 여러개 생성 가능(생성자 오버로딩)
 * 생성자 오버로딩 조건 : 매개변수의 개수가 다르거나, 타입이 달라야 함
 * 생성자 이름은 클래스 이름과 동일
 * 생성자 이름은 클래스이름과 동일
 * 셍성자는 리컨타입이 없는 메서드와 같은 구조.
 * public 클래스명(매개변수){
 *   멤버변수 값 설정
 *   }
 *   
 */

class car{
	// 비교, 연산을 하느냐에 따라 하면 int 안하면 String
	// 기능 : 시동 켜기, 시동끄기, 속도up, 속도down
	// name, year
	// power, speed
	
	private String name;
	private int year;
	private boolean power;
	private int speed;  // 10씩 속도 측정
	
	
	
	
	

	public void print() {
		System.out.println("이름: "+name);
		System.out.println("년식: "+year+"년식");
		System.out.println("시동: "+power);
		System.out.println("속도: "+speed);
	}
	
	
	
	//시동켜기(끄기) 자동변속 만들기
	// 스피드가 0일때 시동이 켜지고 꺼질 수 있게
	// 속도를 줄이고 꺼주세요
	public void power() {
		if(power == false) {
			power = true;
			System.out.println("시동이 켜졌습니다.");
		}else {
			if(speed ==0) {
				power = false;
				System.out.println("시동이 꺼졌습니다");
			}else {
				System.out.println("속도를 0으로 줄이고 시동을 꺼주세요");
			}		
		}
	}
	
	// speedUp
	// 시동이 꺼져있으면 켜달라는 메세지
	// 속도 0~200까지 제한
	public void speedUp() {
		if(power == true) {
			if(speed < 200) {
				this.speed +=10;
			}
			if(speed > 200) {
			  speed = 200;
			}
			System.out.println("현재속도는"+speed+"km 입니다.");
		}
		else {
			System.out.println("시동을 꺼주세요");

		}
		}	
	
	// speedDown
	// 시동이 꺼져있으면 속도를 줄일 수 없는 메세지
	public void speedDown() {
		if(power == false) {
			if(speed ==0) {
				this.speed -=10;
			}
			if(speed == 0) {
				speed = 0;
			}
			System.out.println("현재속도는"+speed+"km 입니다.");
		}else {
			System.out.println("현재속도는 0km 입니다.");	
		}	
	}

	// getter, setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	}



