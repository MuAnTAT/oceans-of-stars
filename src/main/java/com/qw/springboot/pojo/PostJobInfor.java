package com.qw.springboot.pojo;

public class PostJobInfor {
	public int id;
	public String position;
	public String degree;
	public int salary;
	public int experience;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position=position;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree=degree;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience=experience;
	}
}
