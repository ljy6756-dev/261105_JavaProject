package day10;

public class StudentMain {

	public static void main(String[] args) {
		/* 학생 정보를 관리하기 위한 클래스 생성
		 * 학생의 기본정보 : 이름, 전화번호, 주소, 생년월일
		 * 학원정보 : 학원명(final) = "더조은", 지점 
		 * 수강정보 : 수강과목[], 기간[](26.11.02 ~ 27.05.17)
		 * 		수강과목은 여러과목을 들을 수 있다. 수강과목[5] / 기간[5]
		 * 		같은 번지는 같은 값으로 인지
		 * 
		 * ex) 홍길동, 010-1111-111, 인천, 000505
		 * 		더조은, 인천지점
		 * 		AI풀스택, 26.11.02 ~ 27.05.17
		 * 		JAVA,	26.10.01 ~ 26.11.01 
		 * */
		Student s = new Student("홍길동", "010-1111-1111", "인천", "990427", "마포");
		Student s1 = new Student("김영이", "010-1111-2222", "인천", "000505", "부평");
		Student s2 = new Student("철수", "010-1111-3333", "부천", "000505", "부평");
		Student s3 = new Student("영철", "010-1111-4444", "인천", "000505", "부평");
		Student s4 = new Student("순이", "010-1111-5555", "서울", "000505", "신촌");
		Student s5 = new Student("승철", "010-1111-6666", "인천", "000505", "부평");
		
//		s.printInfo();
//		s.printCompany();
//		s.printCourse();
		
		System.out.println();
		s1.insertCourse("AI풀스택", "26.11.02 ~ 27.05.17");
		s1.insertCourse("java", "26.10.01 ~ 26.11.01");
		s2.insertCourse("AI풀스택", "26.11.02 ~ 27.05.17");
		s2.insertCourse("java", "26.10.01 ~ 26.11.01");
		s3.insertCourse("AI풀스택", "26.11.02 ~ 27.05.17");
		s3.insertCourse("java", "26.10.01 ~ 26.11.01");
		
		Student[] student = new Student[6];
		student[0] = s;
		student[1] = s1;
		student[2] = s2;
		student[3] = s3;
		student[4] = s4;
		student[5] = s5;
		
//		for(int i=0; i<student.length; i++) {
//			System.out.println(student[i]);
//			System.out.println(student[i].equals("인천"));

//		}
		
		
		System.out.println("-------------------");
		
		
		// 인천사는 학생만 출력 - 학원정보, 학생정보
	for(int i=0; i<student.length; i++) {
		if(student[i].getAddress() !=null && student[i].getAddress().equals("인천"));{
			student[i].printCompany();
			student[i].printInfo();
		}
	}

		
		
		// AI풀스택 과정을 수강하는 학생만 출력 - 학생정보, 수강정보

	System.out.println("----------------------");
		int cnt = 0;
		while(cnt < student.length) {
			System.out.println(student[cnt]);
			for(int i=0; i<student[cnt].getIndex(); i++) {
				if(student[cnt].getCourse()[i].equals("AI풀스택")) {
					student[cnt].printInfo();
					student[cnt].printCourse();
					
				}
			}
			
			cnt++;
		}
		
//		s1.printCompany();
//		s1.printInfo();
//		s1.printCourse();
		
		
//		System.out.println(s);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
		
	}

}
