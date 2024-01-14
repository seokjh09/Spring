package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 원격 호출 가능한 프로그램으로 등록
@Controller
public class Hello {
	// 2. URL과 메서드를 연결
	@RequestMapping("/hello")
	private void main() {
		System.out.println("Hello");
	}
}

// 인스턴스 메서드이지만 객체 생성하지 않아도 됨.
// 톰캣 내부에서 객체 생성이 이루어지기 때문.
// Spring은 Reflection API를 사용

// 인스턴스 메서드 - 인스턴스 변수, static 변수 둘 다 가능
// static 메서드 - static 변수만 가능