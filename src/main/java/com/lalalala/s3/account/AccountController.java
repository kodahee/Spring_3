package com.lalalala.s3.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/account/*")
public class AccountController {
	
	@Autowired
	private AccountDAO accountDAO;
	
	@RequestMapping(value = "getList")
	public void getList(AccountDTO accountDTO, Model model) throws Exception {
		List<AccountDTO> ar = accountDAO.getList(accountDTO);
		model.addAttribute("account", accountDTO);
	}
	
	@RequestMapping(value = "setInsert")
	public void setInsert() throws Exception {
		
	}
	
	@RequestMapping(value = "setInsert", method = RequestMethod.POST)
	public void setInsert(AccountDTO accountDTO) throws Exception {
		
	}
	
	

}
