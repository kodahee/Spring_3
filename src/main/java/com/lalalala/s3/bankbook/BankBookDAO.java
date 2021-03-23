package com.lalalala.s3.bankbook;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.lalalala.s3.bankbook.BankBookDAO";
	
	public int setWrite(BankBookDTO bankbookDTO)throws Exception{
		int result = sqlSession.insert(NAMESPACE+".setWrite", bankbookDTO);
		return result;
	}


	public BankBookDTO getSelect(BankBookDTO bankbookDTO) throws Exception {
		return bankbookDTO;
	}

	// getList
	// bankbook table의 모든 데이터 조회 후 리턴
	public List<BankBookDTO> getList() throws Exception {
		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		return ar;
	}

}
