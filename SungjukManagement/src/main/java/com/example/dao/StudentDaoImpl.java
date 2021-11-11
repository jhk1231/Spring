package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.vo.StudentVO;

import lombok.extern.java.Log;

@Log
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public void insertStudent(StudentVO student) {
		this.sqlSession.insert("Student.insert", student);
		log.info(student.getName() + "Insert Success."); // Insert가 성공한다면 log가 찍힌다. (확인용)
	}

	@Override
	public StudentVO selectStudent(String hakbun) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> selectAllStudent() {
		return this.sqlSession.selectList("Student.selectList");
	}

	@Override
	public void updateStudent(StudentVO student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(String hakbun) {
		// TODO Auto-generated method stub

	}

}
