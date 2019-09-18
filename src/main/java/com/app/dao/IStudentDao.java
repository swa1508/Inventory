package com.app.dao;

import java.util.List;

import com.app.model.Student;

public interface IStudentDao {
	public Long saveStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(Long studentId);
	public Student getStudentById(Long studentId);
	public List<Student> getAllStudent();

}
