package com.lalalala.s3.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.lalalala.s3.member.MemberDAO.";
	
	public MemberDTO memberIdCheck(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"memberIdCheck", memberDTO);
	}
	
	// memberFile에서 쓸 id 조회
	public MemberFileDTO memberLoginFile(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"memberLoginFile", memberDTO);
	}
	
	// setFileInsert
	public int setFileInsert(MemberFileDTO memberFileDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setFileInsert", memberFileDTO);
	}
	
	public int memberUpdate(MemberDTO memberDTO) throws Exception {
		// id를 제외하고 나머지 수정
		return sqlSession.update(NAMESPACE+"memberUpdate", memberDTO);
	}
	
	public int memberDelete(MemberDTO memberDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"memberDelete", memberDTO);
	}

	//memberJoin 데이터를 받아서 DB에 insert 하는 메서드
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"memberJoin", memberDTO);
	}

	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"memberLogin", memberDTO);
	}
	
	public MemberDTO memberSelect(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"memberSelect", memberDTO);
	}

	// 조회
	// notice, qna 는 list로 리턴
	public MemberFileDTO getMemberFile(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getMemberFile", memberDTO);
	}

}
