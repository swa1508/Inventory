package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.generic.InventoryBaseEntity;

@Entity 
@Table(name="student")
public class Student extends InventoryBaseEntity {
	
	private static final long serialVersionUID = 6026833778020449893L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="id")
	private Long id;
	@Column(name="sname")
	private String studentName;
	@Column(name="sadd")
	private String StudentAddress;
	public Student() {
		super();
	}
	public Student(Long id) {
		super();
		this.id = id;
	}
	public Student(Long id, String studentName, String studentAddress) {
		super();
		this.id = id;
		this.studentName = studentName;
		StudentAddress = studentAddress;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
