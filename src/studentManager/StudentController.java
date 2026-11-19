package studentManager;

import java.util.Scanner;

public class StudentController implements StudentProgram {

    private Student[] students = new Student[5];
    private Subject[] subjects = new Subject[5];
    private int index = 0;

    // 생성자
    public StudentController() {

        // 수강목록(배열)

        subjects[0] = new Subject("Java", "홍길동");
        subjects[1] = new Subject("HTML", "김철수");
        subjects[2] = new Subject("CSS", "이영희");
        subjects[3] = new Subject("JavaScript", "박민수");
        subjects[4] = new Subject("SQL", "신호철");

        students[0] = new Student("홍길동","0101111111");
        students[1] = new Student("김영희","0102222222");
    }
    
    // 1. 학생등록
    @Override
    public void insertStudent(Scanner scan) {

        if(index >= students.length) {
        	//배열 가득차면
        	Student[] sTemp = new Student[index+3];
            System.out.println("학생등록인원 초과"); //가득찼을시
            return;
        } 

        System.out.print("이름 : ");
        String name = scan.next();
        System.out.print("번호 : ");
        String phone = scan.next();
        System.out.print("학원 : ");
        String acaName = scan.next();
        System.out.print("지점 : ");
        String branch = scan.next();

        students[index] = new Student(name, phone,acaName,branch);

        index++;

        System.out.println("학생 등록 완료!");

    }


    // 2. 학생리스트
    @Override
    public void printStudentList() {

        if(index == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        for(int i = 0; i < index; i++) {

            System.out.println("학생번호 : " + (i + 1));

            students[i].printInfo();

        }

    }
    // 3. 학생검색
    @Override
    public void searchStudent(Scanner scan) {

        System.out.print("검색이름 : ");
        String name = scan.next();

        boolean check = false;

        for(int i = 0; i < index; i++) {

            if(students[i].getName().equals(name)) {

                students[i].printInfo();
                check = true;

            }

        }

        if(!check) {
            System.out.println("학생정보를 찾을 수 없습니다.");
        }

    }


    // 학생선택 메서드
    public Student selectStudent(Scanner scan) {

        if(index == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return null;
        }

        // 학생목록 출력
        System.out.println("----- 전체 학생 리스트 -----");
        for(int i = 0; i < index; i++) {

            System.out.println((i + 1) + ". " + students[i].getName());

        }

        System.out.print("학생 선택 : ");
        int num = scan.nextInt();
        scan.nextLine();

        if(num < 1 || num > index) {
            System.out.println("잘못된 번호입니다.");
            return null;
        }

        return students[num - 1];

    }


    // 4. 수강신청
    @Override
    public void insertSubject(Scanner scan) {

        // 학생선택
        Student student = selectStudent(scan);

        if(student == null) {
            return;
        }

        // 수강목록 출력
        System.out.println("----- 수강가능 목록 -----");

        for(int i = 0; i < subjects.length; i++) {

            System.out.print((i + 1) + ". ");
            subjects[i].printInfo();

        }

        // 과목선택
        System.out.print("수강할 과목 선택 : ");
        int num = scan.nextInt();
        scan.next();

        if(num < 1 || num > subjects.length) {
            System.out.println("잘못된 과목 번호입니다.");
            return;
        }

        // 수강신청
        boolean result = student.addSubject(subjects[num - 1]);

        if(result) {
            System.out.println("수강신청 완료!");
        } else {
            System.out.println("이미 신청한 과목이거나 신청 가능한 과목 수를 초과했습니다.");
        }

    }


    // 5. 수강취소
    // 취소하는 번지를 삭제하고, 뒷쪽 앞으로 덮어쓰기
    @Override
    public void deleteSubject(Scanner scan) {

        // 학생선택
        Student student = selectStudent(scan);

        if(student == null) {
            return;
        }

        // 수강과목 확인
        if(student.getSubjectCount() == 0) {
            System.out.println("수강중인 과목이 없습니다.");
            return;
        }

        // 수강과목 출력
        System.out.println("----- 수강중인 과목 -----");

        for(int i = 0; i < student.getSubjectCount(); i++) {

            System.out.print((i + 1) + ". ");
            student.getSubject(i).printInfo();

        }

        // 취소할 과목 선택
        
        System.out.print("취소할 과목 선택 : ");
        int num = scan.nextInt();
        scan.nextLine();

        if(num < 1 || num > student.getSubjectCount()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        // 수강취소
        student.removeSubject(num - 1);

        System.out.println("수강취소 완료!");

    }

}