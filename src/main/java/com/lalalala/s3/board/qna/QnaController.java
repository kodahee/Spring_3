package com.lalalala.s3.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lalalala.s3.board.BoardDTO;
import com.lalalala.s3.util.Pager;

@Controller
@RequestMapping("/qna/**")
public class QnaController {

	@Autowired
	private QnaService qnaService;
	
	@GetMapping("qnaUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO) throws Exception {
		boardDTO = qnaService.getSelect(boardDTO);
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("dto", boardDTO);
		mv.addObject("board", "qna");
		mv.setViewName("board/boardUpdate");
		
		return mv;
	}
	
	@PostMapping("qnaUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv) throws Exception {
		mv = new ModelAndView();
		int result = qnaService.setUpdate(boardDTO);
		
		if(result > 0) {
			mv.setViewName("redirect:./qnaList");
		} else {
			mv.addObject("msg", "수정 실패");
			mv.addObject("path", "./qnaList");
			mv.setViewName("common/commonResult");
		}
		
		return mv;
	}
	
	@PostMapping("qnaDelete")
	public ModelAndView setDelete(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setDelete(boardDTO);
		
		String message = "삭제 실패";
		String path = "./qnaList";
		
		if(result > 0) {
			message = "삭제 성공";
		}
		
		mv.addObject("msg", message);
		mv.addObject("path", path);
		mv.setViewName("common/commonResult");
		
		return mv;
	}
	
	@PostMapping("qnaReply")
	public ModelAndView setReply(QnaDTO qnaDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setReply(qnaDTO);
		mv.setViewName("redirect:./qnaList");
		return mv;
	}
	
	@GetMapping("qnaReply")
	public ModelAndView setReply() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/boardReply");
		mv.addObject("board", "qna");
		return mv;
	}
	
	@GetMapping("qnaSelect")
	public ModelAndView getSelect(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		boardDTO = qnaService.getSelect(boardDTO);
		mv.addObject("board", "qna");
		mv.addObject("dto", boardDTO);
		mv.setViewName("board/boardSelect");
		return mv;
	}
	
	@GetMapping("qnaList")		// post는 @PostMapping
	public ModelAndView getList(Pager pager) throws Exception {
		ModelAndView mv = new ModelAndView();
		List<BoardDTO> ar = qnaService.getList(pager);
		mv.addObject("list", ar);
		mv.addObject("board", "qna");
		mv.setViewName("board/boardList");
		
		mv.addObject("pager", pager);
		
		return mv;
	}
	
	@GetMapping("qnaInsert")
	public ModelAndView setInsert() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/boardInsert");
		mv.addObject("board", "qna");
		
		return mv;
	}
	
	@PostMapping("qnaInsert")
	public ModelAndView setInsert(BoardDTO boardDTO, MultipartFile [] files) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setInsert(boardDTO, files);
		mv.setViewName("redirect:./qnaList");
		return mv;
	}
	
}
