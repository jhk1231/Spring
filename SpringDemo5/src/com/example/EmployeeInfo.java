package com.example;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component // employeeInfo
public class EmployeeInfo {
	// EmployeeInfo를 통해서 Imployee를 설정
//	@Autowired(required = true)
//	@Qualifier(value = "smith")
	
//	@Resource(name = "smith")
	
	@Inject
	@Named(value = "smith")
	private Employee employee;
}
