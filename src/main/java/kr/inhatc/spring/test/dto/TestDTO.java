package kr.inhatc.spring.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor //default 생성자
@AllArgsConstructor //필드 모두 가진 생성자
@Builder //필요로 하는 필드만 사용해서 생성자
@ToString //필드 정보 출력
public class TestDTO {
	
	private String name;
	private int age;
	
}
