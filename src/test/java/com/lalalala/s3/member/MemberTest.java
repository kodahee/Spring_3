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
	public void setFileInsert() throws Exception {
		MemberFileDTO fileDTO = new MemberFileDTO();
		fileDTO.setId("choa");
		fileDTO.setFileName("fileName1");
		fileDTO.setOriginName("originName1");
		int result = memberDAO.setFileInsert(fileDTO);
		assertEquals(1, result);
	}
	
//	@Test
	public void memberDelete() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id7");
		int result = memberDAO.memberDelete(memberDTO);
		assertEquals(1, result);
	}
	
//	@Test
	public void memberUpdate() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("t1");
		memberDTO = memberDAO.memberSelect(memberDTO);
//		memberDTO.setPw("pw");
//		memberDTO.setName("tname");
		memberDTO.setPhone("01054545454");
//		memberDTO.setEmail("tname@gmail.com");
		
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
