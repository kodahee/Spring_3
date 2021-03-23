package com.lalalala.s3.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lalalala.s3.MyAbstractTest;

public class BankBookDAOTest extends MyAbstractTest {
	
	@Autowired
	private BankBookDAO bankbookDAO;
	
	@Test
	public void setUpdateTest() throws Exception {
		BankBookDTO bankbookDTO = new BankBookDTO();
		bankbookDTO.setBookNumber(7);
		
		bankbookDTO = bankbookDAO.getSelect(bankbookDTO);
		
		bankbookDTO.setBookName("20일적금");
		bankbookDTO.setBookRate(0.44);
		int result = bankbookDAO.setUpdate(bankbookDTO);
		assertEquals(1, result);
	}
	
//	@Test
	public void setDeleteTest() throws Exception {
		BankBookDTO bankbookDTO = new BankBookDTO();
		bankbookDTO.setBookNumber(10);
		int result = bankbookDAO.setDelete(bankbookDTO);
		assertEquals(1, result);
	}
	
//	@Test
	public void getListTest() throws Exception {
		List<BankBookDTO> ar = bankbookDAO.getList();
		assertNotEquals(0, ar.size());
	}
	
//	@Test
	public void getSelectTest() throws Exception {
		BankBookDTO bankbookDTO = bankbookDAO.getSelect(null);
		assertNotNull(bankbookDTO);
	}
	
//	@Test
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
