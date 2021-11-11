package com.example.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.example.vo.StudentVO;

import lombok.extern.java.Log;

// File 처리 Class
@Log
public class Input {
	private List<StudentVO> list;
	private Scanner scan;
	
	
	public Input(List<StudentVO> list) throws IOException {
		this.list = list;
		String path = "C:/Temp/sungjuk_utf8.csv";
		this.scan = new Scanner(new File(path));
	}
	
	public void input() {
		while(this.scan.hasNext()) {
			// log.info(this.scan.nextLine());
			// 1101, 한송이, 78, 87, 83, 78
			String line = this.scan.nextLine(); // 한줄을 읽어서
			String[] array = line.split(","); 		   // 자르자.
			StudentVO student = new StudentVO(array[0].trim(),
					array[1].trim(), Integer.parseInt(array[2].trim()),
					Integer.parseInt(array[3].trim()), 
					Integer.parseInt(array[4].trim()),
					Integer.parseInt(array[5].trim()));
			this.list.add(student); // VO객체를 List에 추가.
		}
		// log.info(this.list.size() + "명");
	}
}
