package com.lalalala.s3.account;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountTest {
	
	@Autowired
	private AccountDAO accountDAO;
	
	@Test
	public void accountListTest() throws Exception {
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setId("iu");
		List<AccountDTO> ar = accountDAO.accountList(accountDTO);
		assertNotEquals(0, ar.size());
	}

}
