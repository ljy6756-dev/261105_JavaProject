package day09;

public class Class04t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("카니발",2025);
		c.printInfo();
		c.power();
		c.power();
//		c.power();
//		c.power();
//		c.power(); 
//		c.power();
		c.speedUp();
		c.speedUp();
		c.power();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.power();

	}

}

class Car{
	// 기능 : 시동켜기, 시동끄기, 속도up, 속도down
	// name, year
	// power, speed
	private String name;
	private int year;
	private boolean power;
	private int speed;
	
	// 생성자 - 멤버변수 아래
	/* 객체를 생성할 때 (new) 초기값을 지정해주는 역할
	 * 기본생성자 : 컴파일러가 자동으로 제공 (컴파일시 생성자가 없으면...)
	 *  - object = null / 숫자 = 0 / boolean = false
	 *  - 다른 생성자가 존재하면 자동으로 주지 않음.
	 * 기본생성자는 사용자가 직접 생성가능.
	 * 생성자는 여러개 생성 가능 (생성자 오버로딩)
	 * 생성자 오버로딩 조건 : 매개변수의 개수가 다르거나, 타입이 달라야 함.
	 * 생성자 이름은 클래스이름과 동일
	 * 생성자는 리턴타입이 없는 메서드와 같은 구조.
	 * public 클래스명(매개변수){
	 *   멤버변수 값 설정;
	 * }
	 * */
	// 기본생성자
	public Car() {}
	
	// 매개변수로 이름과 연식을 받아서 제공
	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	// 출력메서드
	public void printInfo() {
		System.out.println(name+"(년식:"+year+")");
	}

	// 시동 켜기(끄기)
	public void power() {
		if(speed == 0) {
			power = !power;
			powerPrint();
		}else {
			System.out.println("ERROR!!");
		}
	}
	
	// power출력메서드
	public void powerPrint() {
//		if(power) {
//			System.out.println("ON");
//		}else {
//			System.out.println("OFF");
//		}
		System.out.println((power ? "ON" : "OFF") + " / "+speed);
	}
	
	// speedUp
	public void speedUp(){
		if(power) {
			if(speed >= 200) {
				speed = 200;
			}else {
				this.speed +=20;				
			}
			System.out.println("speed:"+speed);
		}else {
			System.out.println("시동을 켜주세요.");
		}
	}
	// speedDown
	public void speedDown() {
		if(power) {
			if(speed == 0) {
				speed = 0;
			}else {
				this.speed -=20;				
			}
			System.out.println("speed:"+speed);
		}else {
			System.out.println("시동을 켜주세요.");
		}
	}
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

	public boolean isPower() {
		return power;
	}

	public int getSpeed() {
		return speed;
	}
	
	// getter/setter
	
	
	
}