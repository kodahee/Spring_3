package com.lalalala.s3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lalalala.s3.util.Pager;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO> getList(Pager pager) throws Exception {
		int perPage = 10;	// 한 페이지당 보여줄 글의 갯수
		int perBlock = 5;	// 한 블럭당 보여줄 숫자의 갯
		
		// startRow, lastRow
		long startRow = (pager.getCurPage() - 1) * perPage + 1;
		long lastRow = pager.getCurPage() * perPage;
		
		pager.setStartRow(startRow);
		pager.setLastRow(lastRow);
		
		
		// page count, paging 순서
		// 1. totalCount
		long totalCount = noticeDAO.getTotalCount(pager);
		
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
		
		// 6. curBlock이 마지막 block일때(totalBlock) 
		if(curBlock == totalBlock) {
			lastNum = totalPage;
		}
		
		// 7. 이전, 다음 block 존재 여부
		// 이전
		if(curBlock != 1) {
			pager.setPre(true);
		}
		
		// 다음
		if(curBlock != totalBlock) {
			pager.setNext(true);
		}
		
		pager.setStartNum(startNum);
		pager.setLastNum(lastNum);
		System.out.println("TotalPage : " + totalPage);
		System.out.println("TotalBlock : " + totalBlock);
		System.out.println("CurBlock : " + curBlock);
		
		return noticeDAO.getList(pager);
	}
	
	public NoticeDTO getSelect(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.getSelect(noticeDTO);
	}
	
	public int setInsert(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.setInsert(noticeDTO);
	}
	
	public int setUpdate(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.setUpdate(noticeDTO);
	}
	
	public int setDelete(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.setDelete(noticeDTO);
	}

}
