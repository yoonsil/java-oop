package com.bitcamp.domains;

public class ScheduleBean {
	private int month, endDay;
	private String year;
	
	public void setMonth(int month) {
		this.month= month;
	}
	public int getMonth() {
		return this.month;
	}
	public void setEndday(int endDay) {
		this.endDay= endDay;
	}
	public int getEndday() {
		return this.endDay;
	}
	public void setYear(String year) {
		this.year= year;
	}
	public String getYear() {
		return this.year;
	}

}
