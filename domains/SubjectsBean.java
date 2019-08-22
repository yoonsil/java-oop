package com.bitcamp.domains;

public class SubjectsBean {
	private int kor,eng,math;
	private double total, avg;
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getTotal() {
		return total;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getAvg() {
		return avg;
	}
	
	public String toString() {
		return String.format("국어:%d점\n"
				+ "영어:%d점\n"
				+ "수학:%d점", kor,eng,math);
	}
}
