package org.project;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	
	//MySQL 설정 테스트
	@Autowired
	private DataSource ds;

	//MyBatis 설정 테스트
	@Autowired
	private SqlSessionFactory sqlSession;
	
	@Test
	public void contextLoads() {
	}

	//MySQL - DataSource connection test
	@Test
	public void testConnection() throws Exception{
		System.out.println("ds : " + ds);
		
		Connection con=ds.getConnection();
		
		System.out.println("con : " + con);
		
		con.close();
	}
	
	//MyBatis 설정 SqlSession 테스트
	@Test
	public void testSqlSession() throws Exception{
		System.out.println("sqlSession : " + sqlSession);
	}
}