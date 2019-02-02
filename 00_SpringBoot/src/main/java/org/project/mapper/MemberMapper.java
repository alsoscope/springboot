package org.project.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.project.domain.MemberVO;

public interface MemberMapper {
	
	@Insert("insert into tbl_member (userId, userPw, userName, userEmail)"
			+ "values (#{userId},#{userPw},#{userName},#{userEmail})")
	public void create(MemberVO vo)throws Exception;
	
	@Select("select * from tbl_member where userId=#{userId}")
	public MemberVO read(String userId)throws Exception;
	
	@Update("update tbl_member set userPw=#{userPw}, userName=#{userName}, userEmail=#{userEmail} where userId=#{userId}")
	public void update(MemberVO vo)throws Exception;
	
	@Delete("delete from tbl_member where userId=#{userId}")
	public void delete(String userId)throws Exception;
	
	public MemberVO login(@Param("userId")String userId, @Param("userPw")String userPw) throws Exception;
}
