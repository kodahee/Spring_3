package com.lalalala.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankbookDAO;
	
	public List<BankBookDTO> bankbookList() throws Exception {
		List<BankBookDTO> ar = bankbookDAO.getList();
		return ar;
	}
	
	public BankBookDTO bankbookSelect(BankBookDTO bankbookDTO) throws Exception {
		bankbookDTO = bankbookDAO.getSelect(bankbookDTO);
		return bankbookDTO;
	}

	public int bankbookAdd(BankBookDTO bankbookDTO) throws Exception {
		int result = bankbookDAO.setWrite(bankbookDTO);
		
		
		return result;
	}
	
}
