package com.lalalala.s3.account;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lalalala.s3.MyAbstractTest;

public class AccountTest extends MyAbstractTest {
	
	@Autowired
	private AccountDAO accountDAO;
	
//	@Test
	public void setInsertTest() throws Exception {
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setAccountNumber("129-129-1299");
		accountDTO.setAccountBalance(0);
		accountDTO.setId("iu");
		accountDTO.setBookNumber(3);
		int result = accountDAO.setInsert(accountDTO);
		assertEquals(1, result);
	}
	
	@Test
	public void getListTest() throws Exception {
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setId("iu");
		System.out.println(accountDTO.getId());
		List<AccountDTO> ar = accountDAO.getList(accountDTO);
		System.out.println(ar.get(0).getAccountNumber());
		assertNotEquals(0, ar.size());
	}

}
