package com.lalalala.s3.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lalalala.s3.util.Pager_backUp;

@Repository
public class BankBookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.lalalala.s3.bankbook.BankBookDAO";
	
	public Long getTotalCount() throws Exception {
		return sqlSession.selectOne(NAMESPACE+".getTotalCount");
	}
	
	public int setUpdate(BankBookDTO bankbookDTO) throws Exception {
		return sqlSession.update(NAMESPACE+".setUpdate", bankbookDTO);
	}
	
	public int setDelete(BankBookDTO bankbookDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+".setDelete", bankbookDTO);
	}
	
	public int setWrite(BankBookDTO bankbookDTO) throws Exception {
		int result = sqlSession.insert(NAMESPACE+".setWrite", bankbookDTO);
		return result;
	}


	public BankBookDTO getSelect(BankBookDTO bankbookDTO) throws Exception {
		//long num = 1L;
		bankbookDTO = sqlSession.selectOne(NAMESPACE+".getSelect", bankbookDTO);
		return bankbookDTO;
	}

	// getList
	// bankbook table의 모든 데이터 조회 후 리턴
	public List<BankBookDTO> getList(Pager_backUp pager) throws Exception {
		System.out.println(pager.getStartRow());
		System.out.println(pager.getLastRow());
		return sqlSession.selectList(NAMESPACE+".getList", pager);
	}

}
