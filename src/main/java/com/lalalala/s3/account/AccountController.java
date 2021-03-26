package com.lalalala.s3.account;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lalalala.s3.member.MemberDTO;

@Controller
@RequestMapping("/account/*")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value = "accountList")
	public void getList(AccountDTO accountDTO, HttpSession session, Model model) throws Exception {
		// Service에서 해도 되고, mapper에서 parameterType을 memberDTO를 받아도 되고, String type을 선언해서 변수 하나만 받아도 됨
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		accountDTO.setId(memberDTO.getId());
		List<AccountDTO> ar = accountService.getList(accountDTO);
		model.addAttribute("account", ar);
	}
	
	@RequestMapping(value = "accountInsert")
	public String setInsert(AccountDTO accountDTO, HttpSession session) throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		accountDTO.setId(memberDTO.getId());
		
		int result = accountService.setInsert(accountDTO);
		return "redirect:./accountList";
	}
	
	

}
