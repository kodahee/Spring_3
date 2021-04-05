package com.lalalala.s3.util;

public class Pager {

	// 1. DB에서 일정한 갯수만큼 조회
	// 2. jsp 페이지에 일정한 갯수만큼 페이지 번호(curPage)를 출력
	
	private long perPage;	// DB에서 조회할 갯수
	private long perBlock;	// jsp에 출력할 번호의 갯수
	
	public Pager() {
		this.perPage = 10;
		this.perBlock = 5;
		this.curPage = 1;
	}
	
	private long curPage;	// 현재페이지 번호, ex. curPage가 1이면 1부터 10까지 조회
	

	private long startRow;
	private long lastRow;
	
	// rownum 계산 메서드
	public void makeRow() {
		this.startRow = (this.curPage - 1) * this.perPage + 1;
		this.lastRow = this.curPage * this.perPage;
	}
	
	
//	--------------------------페이징 계산-----------------------------
	private long totalPage;
	private long totalBlock;
	
	private long startNum;
	private long lastNum;
	
	private boolean pre;
	private boolean next;
	
	// 페이징 계산하는 메서드
	public void makeNum(long totalCount) {
		// 1. 전체 글의 갯수로 전체 페이지 갯수 구하기
		totalPage = totalCount / perPage;
		if(totalCount % perPage != 0) {
			totalPage++;
		}
		
		// 2. 전체 페이지 전체 block 수 구하기
		totalBlock = totalPage / perBlock;
		if(totalPage % perBlock != 0) {
			totalBlock++;
		}
		
		// 3. curPage를 이용해서 curBlock 구하기
		long curBlock = curPage / perBlock;
		if(curPage % perBlock != 0) {
			curBlock++;
		}
		
		// 4. curBlock으로 startNum, lastNum 구하기
		startNum = (curBlock - 1) * perBlock + 1;
		lastNum = curBlock * perBlock;
		
		// 5. curBlock이 totalBlock과 같다면 
		if(curBlock == totalBlock) {
			lastNum = totalPage;			// 마지막 페이지 번호 설정
		}
		
		// 6. 이전, 다음 유무
		if(curBlock > 1) {
			pre = true;
		}
		
		if(curBlock != totalBlock) {
			next = true;
		}
		
		
	}

	public long getPerPage() {
		return perPage;
	}

	public void setPerPage(long perPage) {
		this.perPage = perPage;
	}

	public long getPerBlock() {
		return perBlock;
	}

	public void setPerBlock(long perBlock) {
		this.perBlock = perBlock;
	}

	public long getCurPage() {
		return curPage;
	}

	public void setCurPage(long curPage) {
		this.curPage = curPage;
	}

	public long getStartRow() {
		return startRow;
	}

	public void setStartRow(long startRow) {
		this.startRow = startRow;
	}

	public long getLastRow() {
		return lastRow;
	}

	public void setLastRow(long lastRow) {
		this.lastRow = lastRow;
	}

	public long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}

	public long getTotalBlock() {
		return totalBlock;
	}

	public void setTotalBlock(long totalBlock) {
		this.totalBlock = totalBlock;
	}

	public long getStartNum() {
		return startNum;
	}

	public void setStartNum(long startNum) {
		this.startNum = startNum;
	}

	public long getLastNum() {
		return lastNum;
	}

	public void setLastNum(long lastNum) {
		this.lastNum = lastNum;
	}

	public boolean isPre() {
		return pre;
	}

	public void setPre(boolean pre) {
		this.pre = pre;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}
	
	
//	---------------------------검색-----------------------------
	
	private String kind;	// 검색할 컬럼명
	private String search;	// 검색어
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSearch() {
		if(this.search == null) {
			this.search = "";
		}
		return search;
	}
	public void setSearch(String search) {
		if(search == null) {
			search = "";
		}
		this.search = search;
	}
	
	
	
}
