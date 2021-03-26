package com.lalalala.s3.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.lalalala.s3.notice.";
	
	public List<NoticeDTO> getList(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.selectList(NAMESPACE+"noticeList", noticeDTO);
	}
	
	public NoticeDTO getSelect(NoticeDTO noticeDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"noticeSelect", noticeDTO);
	}

}
