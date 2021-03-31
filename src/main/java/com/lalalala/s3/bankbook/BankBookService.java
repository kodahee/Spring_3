package com.lalalala.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lalalala.s3.util.Pager;

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

	public List<BankBookDTO> getList(Pager pager) throws Exception {
		int perPage = 10;
		int perBlock = 8;

		// startRow, lastRow
		long startRow = (pager.getCurPage() - 1) * perPage + 1;
		long lastRow = pager.getCurPage() * perPage;

		pager.setStartRow(startRow);
		pager.setLastRow(lastRow);

		// 1. totalCount
		long totalCount = bankbookDAO.getTotalCount(pager);

		// 2. totalPage
		long totalPage = totalCount / perPage;
		if(totalCount % perPage != 0) {
			totalPage++;
		}

		// 3. totalBlock
		long totalBlock = totalPage / perBlock;
		if(totalPage % perBlock != 0) {
			totalBlock++;
		}

		// 4. curBlock
		long curBlock = pager.getCurPage() / perBlock;
		if(pager.getCurPage() % perBlock != 0) {
			curBlock++;
		}

		// 5. startNum, lastNum
		long startNum = (curBlock - 1) * perBlock + 1;
		long lastNum = curBlock * perBlock;

		pager.setStartNum(startNum);
		pager.setLastNum(lastNum);
		System.out.println("TotalPage : " + totalPage);
		System.out.println("TotalBlock : " + totalBlock);
		System.out.println("CurBlock : " + curBlock);

		return bankbookDAO.getList(pager);
	}

	public BankBookDTO getSelect(BankBookDTO bankbookDTO) throws Exception {
		return bankbookDAO.getSelect(bankbookDTO);
	}

}
