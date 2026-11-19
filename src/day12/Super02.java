package day12;

public class Super02 {

	public static void main(String[] args) {
		// 출력용 클래스
		
		//강아지
		Dog d = new Dog("뽀삐","강아지");
		d.printInfo();
		d.howl();
		System.out.println("--------------");  //줄바꿈
		Cat c = new Cat("초코","고양이");
		c.printInfo();
		c.howl();
		System.out.println();  //줄바꿈
		Tiger t = new Tiger("호박","호랑이");
		t.printInfo();
		t.howl();

	}

}

class Tiger extends Animal{
	
	public Tiger(String name, String category) {
		super(name,category);
	}
	@Override
	public void howl() {
		super.howl();
		System.out.println("어흥!!");
	}
	
}

class Cat extends Animal{
	
	public Cat(String name, String category) {
		super(name, category);
		
	}
	@Override
	public void howl() {
		super.howl();
		System.out.println("야옹~~");
	}
	
	
}

//자식 클래스
class Dog extends Animal{
	
	public Dog(String name, String category) {
		//부모 생성자를 호출 super()
		super(name, category);
		
//		super.setName(name);
//		super.setCategory(category);
		
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍!!");
	}
}


// 부모클래스
class Animal{
	private String name;  //이름
	private String category; //종
	
	//생성자 => 상속안됨.
	public Animal() {}
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
		
		
	//출력매서드
	public void printInfo() {
		System.out.println("이름: "+name+"("+category+")");
	}
	
	//울음소리 출력 메서드 => 자식이 구현하도록 남겨두기
	
    public void howl() {
    	System.out.println(name+"의 울음소리");
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", category=" + category + "]";
	}
	
		
    
	
}





