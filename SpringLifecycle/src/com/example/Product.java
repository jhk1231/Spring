package com.example;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;

@RequiredArgsConstructor
@ToString
@Log
public class Product {
	private @NonNull String name;
	private @NonNull int price;
	private @Setter String maker;
	private @Setter String color;

	// Annotation Config를 xml에 정의해야 사용이 가능하다.
	@PostConstruct
	public void doStart() {
		log.info("방금 Product Bean이 생성되었 습니다. ");
	}
	
	@PreDestroy
	public void doEnd() {
		log.info("방금 Product Bean이 소멸되었습니다. ");
	}
}
