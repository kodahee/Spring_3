package com.lalalala.s3.board;

import java.sql.Date;

public class BoardDTO {
	
	private long num;
	private String name;
	private String title;
	private String contents;
	private Date regDate;
	private long hit;
	
	private BoardFileDTO boardFileDTO;
	
	public BoardFileDTO getBoardFileDTO() {
		return boardFileDTO;
	}
	public void setBoardFileDTO(BoardFileDTO boardFileDTO) {
		this.boardFileDTO = boardFileDTO;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public long getHit() {
		return hit;
	}
	public void setHit(long hit) {
		this.hit = hit;
	}
	
	

}
