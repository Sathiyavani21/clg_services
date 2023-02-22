package com.tns.collegeservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	private Integer Clg_id;
	private String Clg_name;
	private String Courses;
	private Integer Clg_fees;
	
	public College() {
		super();
	}
	
	public College(Integer clg_id, String clg_name, String courses, Integer clg_fees) {
		super();
		Clg_id = clg_id;
		Clg_name = clg_name;
		Courses = courses;
		Clg_fees = clg_fees;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getClg_id() {
		return Clg_id;
	}
	public void setClg_id(Integer clg_id) {
		Clg_id = clg_id;
	}
	public String getClg_name() {
		return Clg_name;
	}
	public void setClg_name(String clg_name) {
		Clg_name = clg_name;
	}
	public String getCourses() {
		return Courses;
	}
	public void setCourses(String courses) {
		Courses = courses;
	}
	public Integer getClg_fees() {
		return Clg_fees;
	}
	public void setClg_fees(Integer clg_fees) {
		Clg_fees = clg_fees;
	}
	@Override
	public String toString()
	{
		return "College[College id:"+Clg_id+" College name"+Clg_name+" Courses"+Courses+" College fees"+Clg_fees+"]";
	}
	

}
