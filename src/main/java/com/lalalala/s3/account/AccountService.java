package com.lalalala.s3.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
	
	public List<AccountDTO> accountList(AccountDTO accountDTO) throws Exception {
		return accountDAO.accountList(accountDTO);
	}

}
