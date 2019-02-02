package org.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//스프링 부트는 기본적으로 XML설정을 피함. MyBatis 역시 동일한 원칙으로 어노테이션@MapperScan이나 Java코드로 Mapper 인터페이스 인식시킴.
//value 속성으로 문자열의 배열 이용, Mapper 인터페이스가 있는 패키지를 인식시킨다
@MapperScan(value= {"org.project.mapper"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

