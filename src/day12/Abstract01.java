package day12;

public class Abstract01 {

	public static void main(String[] args) {
		// 추상 클래스 = 미완성 클래스
		// 추상 클래스 키워드 : abstract
		// 추상 클래스는 추상 메서드를 포함하는 클래스
		// 추상 메서드는 선언부만 있고, 구현부가 없는 메서드
		// 객체 생성이 불가능
		
		Dog2 d = new Dog2("뽀삐","강아지");
		d.printInfo();
		d.howl();
		d.eating("고기");
		
//		Animal2 a = new animal2(); => 추상 클래스는 객체 생성 불가능

	}

}
class Dog2 extends Animal2{
	private String eat;
	
	//생성자
	public Dog2(String name, String category) {
	// 상속받은 멤버변수의 접근제어자가 protected일 경우 this.멤버변수 사용가능
    this.name = name;
	//	super.name = name;
    super.category = category;
	}
	

	@Override
	void howl() {
		// TODO Auto-generated method stub
		System.out.println(name+"의 울음소리 멍멍!!");
		
	}

	@Override
	void eating(String eat) {
		// TODO Auto-generated method stub
		System.out.println(name+"는 "+eat+"를 좋아해요");
		
	}
	
}


// 같은 패키지에 같은 이름의 클래스가 있으면 안됨.
// abstract : 상속용
abstract class Animal2{
	protected String name;
	protected String category;
	
	public void printInfo() {
		System.out.println(name+"("+category+")");
	}
	
	//추상메서드
	abstract void howl();
	abstract void eating(String eat);
}