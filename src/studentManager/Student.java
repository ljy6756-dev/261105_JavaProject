package studentManager;

public class Student {
	private String name;
    private String phone;
    private String acaName;
    private String branch;

    // 수강과목 배열
    private Subject[] subjects;
    private int subjectCount;

    // 생성자
    public Student() {}
    
    public Student(String name, String phone) {
    this.name = name;
    this.phone = phone;
    }

    public Student(String name, String phone, String acaName, String branch) {

        this(name, phone);
        this.acaName = acaName;
        this.branch = branch;

        subjects = new Subject[10];
        subjectCount = 0;

    }

    // 수강신청 메서드
    public boolean addSubject(Subject subject) {

        // 중복과목 확인
        for(int i = 0; i < subjectCount; i++) {

            if(subjects[i].getSubjectName().equals(subject.getSubjectName())) {
                return false;
            }

        }

        // 수강과목 배열 확인
        if(subjectCount >= subjects.length) {
            return false;
        }

        subjects[subjectCount] = subject;
        subjectCount++;

        return true;

    }

    // 수강취소 메서드
    public void removeSubject(int num) {

        for(int i = num; i < subjectCount - 1; i++) {

            subjects[i] = subjects[i + 1];

        }

        subjects[subjectCount - 1] = null;
        subjectCount--;

    }

    // 학생정보 출력
    public void printInfo() {

        System.out.println("이름 : " + name);
        System.out.println("번호 : " + phone);
        System.out.println("학원 : " + acaName);
        System.out.println("지점 : " + branch);

        System.out.println("----- 수강과목 -----");

        if(subjectCount == 0) {
            System.out.println("수강중인 과목이 없습니다.");
        }

        for(int i = 0; i < subjectCount; i++) {

            System.out.print((i + 1) + ". ");
            subjects[i].printInfo();

        }

        System.out.println("----------------------");

    }

    // getter / setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAcaName() {
        return acaName;
    }

    public void setAcaName(String acaName) {
        this.acaName = acaName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSubjectCount() {
        return subjectCount;
    }

    public Subject getSubject(int i) {
        return subjects[i];
    }

}


// ==================================
// 수강 클래스 Subject
// ==================================

class Subject {

    // 멤버변수
    private String subjectName;
    private String teacher;

    // 생성자
    public Subject(String subjectName, String teacher) {

        this.subjectName = subjectName;
        this.teacher = teacher;

    }

    // getter
    public String getSubjectName() {
        return subjectName;
    }

    public String getTeacher() {
        return teacher;
    }

    // 과목정보 출력
    public void printInfo() {

        System.out.println("과목명 : " + subjectName);
        System.out.println("강사명 : " + teacher);

    }

}
