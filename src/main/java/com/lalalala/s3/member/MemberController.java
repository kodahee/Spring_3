package com.lalalala.s3.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "memberUpdate")
	public void memberUpdate() throws Exception {
		
	}
	
	@RequestMapping(value = "memberUpdate", method = RequestMethod.POST)
	public String memberUpdate(MemberDTO memberDTO, HttpSession session) throws Exception {
		int result = memberService.memberUpdate(memberDTO);
		session.setAttribute("member", memberDTO);
		return "redirect:memberMyPage";
	}
	
	@RequestMapping(value = "memberDelete")
	public String memberDelete(HttpSession session) throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		int result = memberService.memberDelete(memberDTO);
		session.invalidate();
		return "redirect:../";
	}
	
	@RequestMapping(value = "memberMyPage")
	public void memberMyPage() throws Exception {
		
	}
	
	@RequestMapping(value = "memberLogout")
	public String memberLogout(HttpSession session) throws Exception {
		session.invalidate();		// session 유지시간
		return "redirect:../";
	}
	
	@RequestMapping(value = "memberLogin")
	public void memberLogin() throws Exception {
		
	}
	
	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public String memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception {
		memberDTO = memberService.memberLogin(memberDTO);
		session.setAttribute("member", memberDTO);
		return "redirect:../";
	}
	
	@RequestMapping(value = "memberJoin")
	public void memberJoin() throws Exception {
		
	}
	
	@RequestMapping(value = "memberJoin", method = RequestMethod.POST)
	public String memberJoin(MemberDTO memberDTO) throws Exception {
		int result = memberService.memberJoin(memberDTO);
		return "redirect:../";
	}

}
