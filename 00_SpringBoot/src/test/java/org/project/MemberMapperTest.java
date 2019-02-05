package org.project;

import org.junit.Test;
import org.project.domain.MemberVO;
import org.project.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;

//기존의 테스트 코드가 복잡해짐에 따라 상속받아 새로 작성한다
public class MemberMapperTest extends ApplicationTests{
	@Autowired
	private MemberMapper mapper;
	
	//MapperInterface Test
/*	@Test
	public void testInsert() throws Exception{
		MemberVO vo=new MemberVO();
		
		vo.setUserId("user00");
		vo.setUserPw("00");
		vo.setUserName("margot");
		vo.setUserEmail("daisy@ggg");
		
		mapper.create(vo);
	}*/
	
	//Mapper XML Test
	@Test
	public void testLogin() throws Exception{
		MemberVO vo=mapper.login("user00", "00");
		
		System.out.println("vo : " + vo);
	}
}
