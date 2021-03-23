package com.lalalala.s3.bankbook;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lalalala.s3.MyAbstractTest;

public class BankBookDAOTest extends MyAbstractTest {
	
	@Autowired
	private BankBookDAO bankbookDAO;
	
	@Test
	public void setWriteTest() throws Exception {
		BankBookDTO bankbookDTO = new BankBookDTO();
		bankbookDTO.setBookName("test");
		bankbookDTO.setBookRate(0.12);
		bankbookDTO.setBookSale("Y");
		int result = bankbookDAO.setWrite(bankbookDTO);
		
		// 단정문
		assertEquals(1, result);
	}

}
