package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Component(value = "smith1") // 호출 name을 smith로 설정
public class Employee2 {
	@Value("7788")
	private @NonNull int empno; // 사원 번호
	@Value("Smith Pitt")
	private @NonNull String ename; // 사원명
	@Value("1500")
	private double salary; // 급여
	@Value("Designer")
	private String job; // 하는 일
}
