package com.lalalala.s3.notice;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lalalala.s3.MyAbstractTest;

public class NoticeDAOTest extends MyAbstractTest {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void getList() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		List<NoticeDTO> ar = noticeDAO.getList(noticeDTO);
		assertNotEquals(0, ar.size());
	}

}
