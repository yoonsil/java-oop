package com.bitcamp.domains;

public class MemberBean {
	private String name, id, pw, ssn, blood;
	private double height, weight;
	//------------------------------------
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw=pw;
	}
	public String getPw() {
		return this.pw;
	}
	public void setSsn(String ssn) {
		this.ssn=ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	public void setBlood(String blood) {
		this.blood=blood;
	}
	public String getBlood() {
		return this.blood;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public Double getHeight() {
		return this.height;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public Double getWeight() {
		return this.weight;
	}
	@Override
	public String toString() {
		return String.format("[회원정보\n"
				+ "이름:%s\n"
				+ "아이디:%s\n"
				+ "비밀번호:%s\n"
				+ "주민번호:%s\n"
				+ "헐액형:%s형\n"
				+ "키:%scm\n"
				+ "몸무게:%skg]",
				name, id, pw, ssn, blood,height,weight);
	}
	
}
