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
		System.out.println(accountDTO.getId());
		List<AccountDTO> ar = accountDAO.getList(accountDTO);
		assertNotEquals(0, ar.size());
	}

}
