package day01;

public class Exam02 {

	public static void main(String[] args) {
		// 국어 영어 수학 세 점수를 입력하고 합계와 평균 출력
		// 각 점수는 0~100점 => 점수가 잘못입력되었습니다.
		// pass : 평균이 60점 이상이면 합격 아니면 불합격 if문 이용
		
		int kor = 80;
		int eng = 60;
		int math = 50;
		
		//각 점수가 조건에 맞는지 확인
		// 조건에 맞으면 계산
		
		if((kor>=0 && kor <=100) && (eng>=0 && eng <=100) && (math>=0 && math <=100)) {
			int total = kor + eng + math;
			double avg = (double)total/3;
			System.out.println("total : "+total + "avg : "+avg);
			
		if(avg >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		//삼항연산자는 연산자 안네 처리구분을 할 수 있음
	System.out.println(avg >= 60 ? "합격" : "불합격");		
			
		}else {
			System.out.println("점수가 잘 못 입력되었음");
		}
	//2. 각 점수의 조건 맞지 않으면 계산하지 마시오		
		if((kor>100 || kor<0) || (eng>100 || eng <0) || (math>100 || math <0)) {
	System.out.println("점수가 잘 못 입력되었습니다.");
		}else {
			int total = kor + eng + math;
			double avg = (double)total/3;
			
			System.out.println("total : "+total + "avg : "+avg);
		
		if(avg >=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
	}
		
	}	

}
