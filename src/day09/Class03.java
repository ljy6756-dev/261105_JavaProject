package day09;

public class Class03 {
	
	public static void main(String[] args) {
		// 클래스 생성
		// 학생이름, 국어점수, 영어점수, 수학점수를 객체로 하는 클래스 생성
		// 이름(국어, 영어, 수학) => 출력매서드
		// 메서드를 호출하면 국어+영서+수학 리턴되는 => 합계 메서드
		// 메서드를 호출하면 합계/3 평균 리턴되는 => 평균 메서드
		// 각각 멤버변수의 getter / setter 생성
		
		StudentClass stu = new StudentClass();

		stu.setName("홍길동");
		stu.setKor((int)(Math.random()*101));
		stu.setEng((int)(Math.random()*101));
		stu.setMath((int)(Math.random()*101));
		stu.print();
		
		StudentClass[] studentArr = new StudentClass[10];
		studentArr[0] = new StudentClass();
		studentArr[0].setName("주영");
		studentArr[0].setKor((int)(Math.random()*101));
		studentArr[0].setEng((int)(Math.random()*101));
		studentArr[0].setMath((int)(Math.random()*101));
		studentArr[0].print(); 

		
		
	}

}

//클래스 생성
class StudentClass{

	//멤버변수
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	//sum, avg = 국 영 수 변하는 값이 아님, 값을 따로 입력하지 않음
	// 받고 싶다면 setter가 없어야 하는 변수

	//출력메서드
	public void print() {
		System.out.println("이름 : " + name);// 갈색으로 변할시 this. 붙여 사용
		System.out.println("국어: " + kor + " 영어: " + eng + " 수학: " + math);
		System.out.println("합계 : " + sum() + " / 평균 : "+avg());
	}
	
	//합계
	public int sum() {
		return kor + eng + math;
		
	}
	
	//평균
	public double avg() {
		return sum() / 3.0;
	}
	
	// 각각 멤버변수의 getter / setter 생성
	// 자동변환 방법 우클릭 source => Generater get / set
	
	
	public String getName() {
		return this.name;
	}
	
	public int getSum() {  // 
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return this.kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return this.eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return this.math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
	
	
}