package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.Setter;

// annotation으로 바인딩을 모두 했기 때문에 beans.xml을 사용할 필요가 없다.

@Setter
@NoArgsConstructor
@Component
public class Hello {
	@Value("김지민") // 값 주입
	private String name;
	
	@Autowired(required = true) 
	@Qualifier("stringPrinter") // 같은 이름을 쓰는애가 있다면 Qualifier를 써야한다. 명확하지 않고 충돌날 위험이 있다면 사용
	private Printer printer;

	public String sayHello() {
		return "Hello" + name;
	}
	
	public void print() {
		this.printer.print(sayHello());
	}
}
