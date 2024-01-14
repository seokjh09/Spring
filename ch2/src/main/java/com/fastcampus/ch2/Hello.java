package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. ���� ȣ�� ������ ���α׷����� ���
@Controller
public class Hello {
	// 2. URL�� �޼��带 ����
	@RequestMapping("/hello")
	private void main() {
		System.out.println("Hello");
	}
}

// �ν��Ͻ� �޼��������� ��ü �������� �ʾƵ� ��.
// ��Ĺ ���ο��� ��ü ������ �̷������ ����.
// Spring�� Reflection API�� ���

// �ν��Ͻ� �޼��� - �ν��Ͻ� ����, static ���� �� �� ����
// static �޼��� - static ������ ����