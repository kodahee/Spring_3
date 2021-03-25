package com.lalalala.s3.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/account/*")
public class AccountController {
	
	@Autowired
	private AccountDAO accountDAO;
	
	@RequestMapping(value = "accountList")
	public void accountList(AccountDTO accountDTO, Model model) throws Exception {
		List<AccountDTO> ar = accountDAO.accountList(accountDTO);
		model.addAttribute("accountList", accountDTO);
	}
	
	

}
