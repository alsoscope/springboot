package org.project.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

//필요한 경우 ㅍ ㅣㄹ터를 작성하고 등록해야하는 상황이 있을 수 있다. Filter 인터페이스를 구현한 필터 클래스.
public class SampleFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

	//필터의 내용은 간단한 라인 구분과 호출되는 URI를 출력
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {

		System.out.println("----------------------------------");
		
		HttpServletRequest req=(HttpServletRequest)request;
		
		System.out.println("QueryString : " + req.getQueryString());
		System.out.println("URI : " + req.getRequestURI());
		
		System.out.println("----------------------------------");
		
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}
}
