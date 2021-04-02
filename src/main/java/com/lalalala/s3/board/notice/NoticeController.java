package com.lalalala.s3.board.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lalalala.s3.board.BoardDTO;
import com.lalalala.s3.util.Pager;

@Controller
@RequestMapping(value = "/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping(value = "noticeList")
	public ModelAndView getList(Pager pager) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println(pager.getCurPage());
		List<BoardDTO> ar = noticeService.getList(pager);
		mv.addObject("list", ar);
		mv.setViewName("board/boardList");
		mv.addObject("board", "notice");
		mv.addObject("pager", pager);
		return mv;
	}
	
	@GetMapping("noticeSelect")
	public ModelAndView getSelect(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		boardDTO = noticeService.getSelect(boardDTO);
		mv.addObject("dto", boardDTO);
		mv.addObject("board", "notice");
		mv.setViewName("board/boardSelect");
		return mv;
	}
	
	@RequestMapping(value = "noticeInsert")
	public ModelAndView setInsert() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/boardInsert");
		mv.addObject("board", "notice");
		return mv;
	}
	
	@RequestMapping(value = "noticeInsert", method = RequestMethod.POST)
	public String setInsert(BoardDTO boardDTO, Model model) throws Exception {
		int result = noticeService.setInsert(boardDTO);
		
		String message = "등록 실패";
		
		if(result > 0) {
			message = "등록 성공";
		}
		
		model.addAttribute("msg", message);
		model.addAttribute("path", "./noticeList");
		
		return "common/commonResult";
	}
	
	@RequestMapping(value = "noticeDelete")
	public String noticeDelete(NoticeDTO noticeDTO, HttpSession session) throws Exception {
		noticeDTO = (NoticeDTO)session.getAttribute("notice");
		int result = noticeService.setDelete(noticeDTO);
		session.invalidate();
		return "redirect:noticeList";
	}
	
	@RequestMapping(value = "noticeUpdate")
	public ModelAndView noticeUpdate(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/boardUpdate");
		mv.addObject("dto", boardDTO);
		return mv;
	}
	
	@RequestMapping(value = "noticeUpdate", method = RequestMethod.POST)
	public String noticeUpdate(NoticeDTO noticeDTO, HttpSession session) throws Exception {
		noticeDTO = (NoticeDTO)session.getAttribute("notice");
		int result = noticeService.setUpdate(noticeDTO);
		System.out.println("UPDATE : " + result);
		if(result > 0) {
			session.setAttribute("notice", noticeDTO);
		}
		return "redirect:noticeList";
	}

}
