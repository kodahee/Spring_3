package com.lalalala.s3.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lalalala.s3.member.MemberDTO;

@Controller
@RequestMapping(value = "/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping(value = "noticeList")
	public void getList(NoticeDTO noticeDTO, HttpSession session) throws Exception {
		List<NoticeDTO> ar = noticeService.getList(noticeDTO);
		session.setAttribute("list", ar);
	}
	
	@RequestMapping(value = "noticeSelect")
	public void getSelect(NoticeDTO noticeDTO, HttpSession session) throws Exception {
		noticeDTO = noticeService.getSelect(noticeDTO);
		session.setAttribute("notice", noticeDTO);
	}
	
	@RequestMapping(value = "noticeInsert")
	public void setInsert() throws Exception {
		
	}
	
	@RequestMapping(value = "noticeInsert", method = RequestMethod.POST)
	public String setInsert(NoticeDTO noticeDTO, HttpSession session) throws Exception {
//		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
//		noticeDTO.setName(memberDTO.getName()); 
		int result = noticeService.setInsert(noticeDTO);
		return "redirect:noticeList";
	}
	
	@RequestMapping(value = "noticeDelete")
	public String noticeDelete(NoticeDTO noticeDTO, HttpSession session) throws Exception {
		int result = noticeService.setDelete(noticeDTO);
		return "redirect:noticeList";
	}
	
	@RequestMapping(value = "noticeUpdate")
	public void noticeUpdate() throws Exception {
		
	}
	
	@RequestMapping(value = "noticeUpdate", method = RequestMethod.POST)
	public String noticeUpdate(NoticeDTO noticeDTO, HttpSession session) throws Exception {
		int result = noticeService.setUpdate(noticeDTO);
		if(result > 0) {
			session.setAttribute("notice", noticeDTO);
		}
		return "redirect:noticeList";
	}

}
