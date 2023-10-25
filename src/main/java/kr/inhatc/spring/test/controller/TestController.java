package kr.inhatc.spring.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //return된 값을 그대로 출력 (view단으로 안감)
public class TestController {
	
	@GetMapping(value = "/")
	public String hello() {
		return "Hello World";
	}
}
