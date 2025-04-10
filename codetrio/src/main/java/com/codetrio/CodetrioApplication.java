package com.codetrio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.codetrio.common.CodeTrioUtil;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class) // Security Fliter 암호화
public class CodetrioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodetrioApplication.class, args);
	}

}
