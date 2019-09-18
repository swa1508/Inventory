package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IStudentDao;
import com.app.model.Student;
@Repository
public class StudentDaoImpl implements IStudentDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Long saveStudent(Student student) {
		Long stu = (Long) ht.save(student);
		return stu;
	}

	@Override
	public void updateStudent(Student student) {
		ht.update(student);
	}

	@Override
	public void deleteStudent(Long id) {
		Student s = new Student();
		s.setId(id);
		ht.delete(s);
	}

	@Override
	public Student getStudentById(Long studentId) {
		Student stu = ht.get(Student.class, studentId);
		return stu;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list  =  ht.loadAll(Student.class);
		return list;
	}

}
