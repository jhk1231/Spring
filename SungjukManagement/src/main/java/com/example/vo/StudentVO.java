package com.example.vo;

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
@RequiredArgsConstructor
public class StudentVO {
	private @NonNull String hakbun; // 학번
	private @NonNull String name;    // 이름
	private @NonNull int kor;
	private @NonNull int eng;
	private @NonNull int mat;
	private @NonNull int edp;
	private int tot;
	private double avg;
	private char grade;
}
