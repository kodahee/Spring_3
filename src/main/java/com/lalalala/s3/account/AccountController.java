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
	public void getList(AccountDTO accountDTO, Model model, HttpSession session) throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		accountDTO.setId(memberDTO.getId());
		List<AccountDTO> ar = accountService.getList(accountDTO);
		session.setAttribute("account", ar);
	}
	
	@RequestMapping(value = "setInsert")
	public void setInsert() throws Exception {
		
	}
	
	@RequestMapping(value = "setInsert", method = RequestMethod.POST)
	public void setInsert(AccountDTO accountDTO) throws Exception {
		
	}
	
	

}
