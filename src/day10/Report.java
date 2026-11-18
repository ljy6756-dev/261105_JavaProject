package day10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Report {

	// 한사람 성적 클래스
	//멤버변수 : 이름, 국어, 영어, 수학, 합계, 평균, 등수
	//생성자 : 이름, 국어, 영어, 수학 => 매개변수로 등록
	// 기본생성도 같이 오버로딩 해서 생성
	// 합계, 평균 계산
	//# : 선택 해당 자리수가 있으면 출력 없으면 안함.
	//0 : 필수 해당 자리수가 없으면 0으로 맞춰서 출력
	//출력 => 평균은 소수점 2자리(DecimalFormat("##.00")
	//(DecimalFormat("##.00") => 객체명.format(avg

private int test;
private String name;
private int kor;
private int eng;
private int math;
private int sum = kor+eng+math;
private double avg = sum/(double)3;
private int rank;




public Report(int test, String name, int kor, int eng, int math, int sum, double avg) {
	this.test = test;
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	this.sum = kor+eng+math;
	this.avg = sum/(double)3;
	this.rank = rank;
}



public Report(String string, int i, int j, int k) {
	// TODO Auto-generated constructor stub
}



public Report() {
	// TODO Auto-generated constructor stub
}



public void print() {
	
	System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
	System.out.println("----------------------------------------------------");
//	System.out.println(name + "\t" + kor+"\t"+eng+"\t"+math+"\t"+sum()+"\t"+avg()+"\t");
	System.out.println();
}



//getter, setter


@Override
public String toString() {
	DecimalFormat d = new DecimalFormat("##.00");
	return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t";
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public int getKor() {
	return kor;
}



public void setKor(int kor) {
	this.kor = kor;
}



public int getEng() {
	return eng;
}



public void setEng(int eng) {
	this.eng = eng;
}



public int getMath() {
	return math;
}



public void setMath(int math) {
	this.math = math;
}



public int getSum() {
	return sum;
}



public void setSum(int sum) {
	this.sum = sum;
}



public double getAvg() {
	return avg;
}



public void setAvg(double avg) {
	this.avg = avg;
}



public int getRank() {
	return rank;
}



public void setRank(int rank) {
	this.rank = rank;
}

	
	
}

