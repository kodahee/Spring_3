package com.lalalala.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/member/")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "memberLogin")
	public void memberLogin() throws Exception {
		
	}
	
	@RequestMapping(value = "memberLogin", method = RequestMethod.POST)
	public ModelAndView memberLogin(MemberDTO memberDTO, ModelAndView modelAndView) throws Exception {
		memberDTO = memberService.memberLogin(memberDTO);
		modelAndView.addObject("dto", memberDTO);
		if(memberDTO != null) {		// 로그인 성공시 인덱스페이지
			modelAndView.setViewName("redirect:../");
		} else {					// 로그인 실패시 다시 로그인
			modelAndView.setViewName("/member/memberLogin");
		}
		return modelAndView;
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
