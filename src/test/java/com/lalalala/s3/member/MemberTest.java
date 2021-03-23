package com.lalalala.s3.member;

import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;

import com.lalalala.s3.MyAbstractTest;

public class MemberTest extends MyAbstractTest {
	
	@Autowired
	private MemberDAO memberDAO;
	
	public void memberJoin() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		int result = memberDAO.memberJoin(memberDTO);
		assertEquals(1, result);
	}

}
