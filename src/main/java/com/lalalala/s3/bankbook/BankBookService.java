package com.lalalala.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {		// annocation, xml에 설정

	@Autowired
	private BankBookDAO bankbookDAO;		// Dependency Injection
	
	public int setUpdate(BankBookDTO bankbookDTO) throws Exception {
		return bankbookDAO.setUpdate(bankbookDTO);
	}
	
	public int setDelete(BankBookDTO bankbookDTO) throws Exception {
		return bankbookDAO.setDelete(bankbookDTO);
	}

	public int setWrite(BankBookDTO bankbookDTO) throws Exception {
		return bankbookDAO.setWrite(bankbookDTO);
	}
	
	public List<BankBookDTO> getList() throws Exception {
		return bankbookDAO.getList();
	}
	
	public BankBookDTO getSelect(BankBookDTO bankbookDTO) throws Exception {
		return bankbookDAO.getSelect(bankbookDTO);
	}
	
}
