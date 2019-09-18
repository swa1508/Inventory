package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IStudentDao;
import com.app.model.Student;
import com.app.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDao studentDao;

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public Long saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void deleteStudent(Long studentId) {
		studentDao.deleteStudent(studentId);	
	}

	@Override
	public Student getStudentById(Long studentId) {
		return studentDao.getStudentById(studentId);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentDao.getAllStudent();
	}

}
