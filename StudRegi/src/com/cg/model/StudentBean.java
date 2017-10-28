package com.cg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="studentbean")
@NamedQueries({@NamedQuery(name="getall",query="select bean from StudentBean bean"),
@NamedQuery(name="getname",query="select bean from StudentBean bean"),
@NamedQuery(name="getNameDetails",query="select bean from StudentBean bean where bean.studentName=:sName"),
@NamedQuery(name="deleteId",query="select bean from StudentBean bean")})
public class StudentBean 
{
	
	@Id
	@NotNull(message="please insert Your ID")
private int studentId;
	
	@NotEmpty(message="please insert Your Name")
private String studentName;
	
	@NotEmpty(message="please insert Your Class")
private String studentClass;
	
	@NotNull(message="please insert Your Contact Number")
private int studentMob;
	
	@NotEmpty(message="please insert Your Residential Address")
private String studentAdd;


public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentClass() {
	return studentClass;
}
public void setStudentClass(String studentClass) {
	this.studentClass = studentClass;
}
public int getStudentMob() {
	return studentMob;
}
public void setStudentMob(int studentMob) {
	this.studentMob = studentMob;
}
public String getStudentAdd() {
	return studentAdd;
}
public void setStudentAdd(String studentAdd) {
	this.studentAdd = studentAdd;
}
@Override
public String toString() {
	return "StudentBean [studentId=" + studentId + ", studentName="
			+ studentName + ", studentClass=" + studentClass + ", studentMob="
			+ studentMob + ", studentAdd=" + studentAdd + "]";
}

public StudentBean() 
{
	
}




}
