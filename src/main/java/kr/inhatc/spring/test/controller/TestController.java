package kr.inhatc.spring.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.inhatc.spring.test.dto.TestDTO;

@RestController //return된 값을 그대로 출력 (view단으로 안감)
public class TestController {
	
	@GetMapping(value = "/")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/test") //value 생략 가능
	public TestDTO test() {
		TestDTO dto = new TestDTO();
		dto.setName("홍길동");
		dto.setAge(10);
		return dto;
	}
}
