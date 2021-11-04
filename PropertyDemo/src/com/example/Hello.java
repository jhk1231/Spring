package com.example;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Component // hello
public class Hello {
	@Value("${myname}")
	private String name;
	
//	@Autowired
//	@Qualifier(value = "${myprinter}") // Qualifier가 ${myprinter}를 못찾는다.. 때문에 Resources를 사용
	@Resource(name= "${myprinter}")
	private Printer printer;
	
	@Value("${value1}, ${value2}, ${value3}, ${value4}")
	private List<String> fruits;
	
	public String sayHello() {
		return "Hello " + name;
	}
	
	public void print() {
		this.printer.print(sayHello());
	}
}
