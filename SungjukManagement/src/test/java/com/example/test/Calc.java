 package com.example.test;

import java.util.List;

import com.example.vo.StudentVO;

public class Calc {
	private List<StudentVO> list;

	public Calc(List<StudentVO> list) {
		this.list = list;
		this.list.forEach(student -> this.calc(student));
	}
	
	private void calc(StudentVO student) { // 1명 씩 계산
		int tot = student.getKor() + student.getEng() + student.getMat() + student.getEdp();
		double avg = tot /4.;
		char grade = (avg >= 90)? 'A':
								(avg >= 80)?'B':
									(avg >= 70)?'C':
										(avg >= 60)?'D': 'F';
		student.setTot(tot);
		student.setAvg(avg);
		student.setGrade(grade);
	}
	
}
