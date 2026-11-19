package examStudentManager;

import java.util.Scanner;

public interface Stprogrem {

	 // 학생 등록
    void insertStudent(Scanner scan);

    // 학생 리스트 출력
    void printStudentList();

    // 학생 검색
    void searchStudent(Scanner scan);

    // 수강 신청
    void insertSubject(Scanner scan);

    // 수강 취소
    void deleteSubject(Scanner scan);
	
	
}
