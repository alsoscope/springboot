package org.project;

import javax.servlet.Filter;

import org.mybatis.spring.annotation.MapperScan;
import org.project.filter.SampleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//스프링 부트는 기본적으로 XML설정을 피함. MyBatis 역시 동일한 원칙으로 어노테이션@MapperScan이나 Java코드로 Mapper 인터페이스 인식시킴.
//value 속성으로 문자열의 배열 이용, Mapper 인터페이스가 있는 패키지를 인식시킨다
@MapperScan(value= {"org.project.mapper"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//SampleFilter.java / 필터 설정은 web.xml 없이 Application 실행 파일에서 처리
	@Bean
	public FilterRegistrationBean<SampleFilter> someFilterRegistration() {
		
		FilterRegistrationBean registration = new FilterRegistrationBean();
		//registration.setFilter(getFilter());
		registration.setFilter(new SampleFilter());
		registration.addUrlPatterns("/test/*");
		registration.setName("sampleFilter");
		
		return registration;
		
		/*public Filter getFilter() {
			return new SampleFilter();*/
	}//someFilterRegistration
	
}//Application

