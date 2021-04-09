package com.lalalala.s3.board.qna;

import java.util.List;

import com.lalalala.s3.board.BoardDTO;
import com.lalalala.s3.board.BoardFileDTO;

public class QnaDTO extends BoardDTO {

	private long ref;
	private long step;
	private long depth;
	
	private List<BoardFileDTO> qnaFiles;
	
	
	public List<BoardFileDTO> getQnaFiles() {
		return qnaFiles;
	}
	public void setQnaFiles(List<BoardFileDTO> qnaFiles) {
		this.qnaFiles = qnaFiles;
	}
	public long getRef() {
		return ref;
	}
	public void setRef(long ref) {
		this.ref = ref;
	}
	public long getStep() {
		return step;
	}
	public void setStep(long step) {
		this.step = step;
	}
	public long getDepth() {
		return depth;
	}
	public void setDepth(long depth) {
		this.depth = depth;
	}
	
}
