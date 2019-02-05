package org.project.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//가장 많이 사용하는 방법은 WebMvcConfigurerAdapter를 상속받아 @Configuration 어노테이션 사용
/*@Configuration
public class SampleInterceptor extends WebMvcConfigurerAdapter{
*/

public class SampleInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("===Sample Interceptor===");
		
		return true;
	}

}
