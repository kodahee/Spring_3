package com.lalalala.s3.member;

import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;

import com.lalalala.s3.MyAbstractTest;

public class MemberTest extends MyAbstractTest {
	
	@Autowired
	private MemberDAO memberDAO;
	
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
