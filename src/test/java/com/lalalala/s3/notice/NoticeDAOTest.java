package com.lalalala.s3.notice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lalalala.s3.MyAbstractTest;

public class NoticeDAOTest extends MyAbstractTest {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
//	@Test
	public void getList() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		List<NoticeDTO> ar = noticeDAO.getList(noticeDTO);
		assertNotEquals(0, ar.size());
	}
	
//	@Test
	public void getSelect() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(2);
		noticeDTO = noticeDAO.getSelect(noticeDTO);
		assertNotNull(noticeDTO);
	}
	
	@Test
	public void setInsert() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setName("admin");
		noticeDTO.setTitle("d");
		noticeDTO.setContents("dd");
		int result = noticeDAO.setInsert(noticeDTO);
		assertEquals(1, result);
	}

}
