package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.vo.StudentVO;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void create(StudentVO student) {
		this.studentDao.insertStudent(student);
	}

	@Override
	public StudentVO read(String hakbun) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> readAll() {
		return this.studentDao.selectAllStudent();
	}

	@Override
	public void update(StudentVO student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String hakbun) {
		// TODO Auto-generated method stub

	}

}
