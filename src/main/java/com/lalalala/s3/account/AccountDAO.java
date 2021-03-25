package com.lalalala.s3.account;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.lalalala.account.AccountDAO.";
	
	public List<AccountDTO> accountList(AccountDTO accountDTO) throws Exception {
		return sqlSession.selectList(NAMESPACE+"accountList", accountDTO);
	}

}
