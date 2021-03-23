package com.lalalala.s3.member;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lalalala.s3.MyAbstractTest;

public class MemberTest extends MyAbstractTest {
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void memberUpdate() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("t1");
		memberDTO.setPw("pw");
		memberDTO.setName("tname");
		memberDTO.setPhone("01012121212");
		memberDTO.setEmail("tname@gmail.com");
		
		int result = memberDAO.memberUpdate(memberDTO);
		assertEquals(1, result);
	}
	
//	@Test
	public void memberLogin() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("iu");
		memberDTO.setPw("pw1");
		memberDTO = memberDAO.memberLogin(memberDTO);
		assertNotNull(memberDTO);
	}
	
//	@Test
	public void memberJoin() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("t1");
		memberDTO.setPw("t1pw");
		memberDTO.setName("t1");
		memberDTO.setPhone("01012341234");
		memberDTO.setEmail("t1@naver.com");
		int result = memberDAO.memberJoin(memberDTO);
		assertEquals(1, result);
	}

}
