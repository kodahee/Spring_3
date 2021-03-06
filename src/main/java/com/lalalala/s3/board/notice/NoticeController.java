package com.lalalala.s3.board.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
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
	public String setInsert(BoardDTO boardDTO, Model model, MultipartFile [] files)throws Exception{

//		System.out.println("**************Insert Start**************");
//		for(MultipartFile mf: files) {
//			System.out.println(mf.getOriginalFilename());
//		}
//		System.out.println("**************Insert Finish**************");
		
		int result = noticeService.setInsert(boardDTO, files);

		String message = "?????? ??????";
		
		if(result > 0) {
			message = "?????? ??????";
		}
		
		model.addAttribute("msg", message);
		model.addAttribute("path", "./noticeList");
		
		return "common/commonResult";
	}
	
	@PostMapping("noticeDelete")
	public ModelAndView noticeDelete(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setDelete(boardDTO);
		
		String message = "?????? ??????";
		String path = "./noticeList";
		
		if(result > 0) {
			message = "?????? ??????";
		}

		mv.addObject("msg", message);
		mv.addObject("path", path);
		mv.setViewName("common/commonResult");
		
		return mv;
	}
	
	@GetMapping("noticeUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		boardDTO = noticeService.getSelect(boardDTO);
		
		mv.setViewName("board/boardUpdate");
		mv.addObject("dto", boardDTO);
		mv.addObject("board", "notice");
		
		return mv;
	}
	
	@PostMapping("noticeUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv) throws Exception {
		mv = new ModelAndView();
		int result = noticeService.setUpdate(boardDTO);
		
		String message = "?????? ??????";
		String path = "./noticeList";

		if(result > 0) {		// ???????????? ???????????? ??????
			mv.setViewName("redirect:./noticeList");
		} else {				// ???????????? ?????? ??????, ???????????? ??????
			mv.addObject("msg", message);
			mv.addObject("path", path);
			mv.setViewName("common/commonResult");
		}
		
		return mv;
	}

}
