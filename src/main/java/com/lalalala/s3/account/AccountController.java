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
	public void getList(AccountDTO accountDTO, HttpSession session) throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		accountDTO.setId(memberDTO.getId());
		List<AccountDTO> ar = accountService.getList(accountDTO);
		session.setAttribute("account", ar);
	}
	
	@RequestMapping(value = "setInsert")
	public String setInsert(AccountDTO accountDTO, HttpSession session) throws Exception {
		accountDTO = (AccountDTO)session.getAttribute("account");
		
//		accountDTO.setAccountNumber(accountDTO.getBookNumber()+);
		int result = accountService.setInsert(accountDTO);
		return "redirect:accountList";
	}
	
	

}
