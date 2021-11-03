package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.Employee;
import com.example.EmployeeInfo;

@Configuration
@ComponentScan(basePackages = {"com.example"})
public class ApplicationConfig {
	
//	// ID가 메소드 이름이야
//	// Return 타입이 class 다
//	@Bean
//	public Employee smith() {
//		// Smith는 생성자를 2개로 받고 나머지 2개는 Setter로 받는다.
//		Employee smith = new Employee(7788, "Smith Pitt");
//		smith.setSalary(1500);
//		smith.setJob("Marketter");
//		return smith;
//	}
//	
//	@Bean
//	public EmployeeInfo info() {
//		EmployeeInfo info = new EmployeeInfo(smith());
//		return info;
//	}
	
}
