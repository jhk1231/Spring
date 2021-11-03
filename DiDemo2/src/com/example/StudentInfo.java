package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 학생을 넘겨받아서 출력만 하게된다.
// 출력은 toString으로 하겠다.
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentInfo {
	private Student student;
	
	public void printStudent() {
		System.out.println(this.student);
	}
	
}
