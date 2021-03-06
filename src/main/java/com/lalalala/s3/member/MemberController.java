package com.lalalala.s3.member;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
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
		if(result > 0) {
			session.setAttribute("member", memberDTO);
		}
		return "redirect:memberMyPage";
	}
	
	@RequestMapping(value = "memberDelete")
	public String memberDelete(HttpSession session) throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		int result = memberService.memberDelete(memberDTO, session);
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
	
	@RequestMapping(value = "memberJoinCheck")
	public void memberJoinCheck() throws Exception {
		
	}
	
	@RequestMapping(value = "memberJoin")
	public void memberJoin() throws Exception {
		
	}
	
	@RequestMapping(value = "memberJoin", method = RequestMethod.POST)
	public String memberJoin(MemberDTO memberDTO, MultipartFile avatar, HttpSession session, Model model) throws Exception {
		int result = memberService.memberJoin(memberDTO, avatar, session);
		
		System.out.println(avatar.getName());				// 파라미터명
		System.out.println(avatar.getOriginalFilename());	// 업로드 할 때 파일명
		System.out.println(avatar.getSize());				// 파일의 크기, byte 단위
		System.out.println(avatar.isEmpty());				// 파일의 존재 유무
		
		
		String message = "회원가입 실패";
		String path = "./memberJoin";
		
		if(result>0) {
			message = "회원가입 성공";
			path = "../";
		}
		
		model.addAttribute("msg", message);
		model.addAttribute("path", path);
		
		return "common/commonResult";
	}

}
