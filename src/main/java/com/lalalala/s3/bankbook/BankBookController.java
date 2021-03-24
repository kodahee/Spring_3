package com.lalalala.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankbookService;
	
	@RequestMapping(value = "bankbookUpdate")
	public void setUpdate() throws Exception {

	}
	
	@RequestMapping(value = "bankbookUpdate", method = RequestMethod.POST)
	public String setUpdate(BankBookDTO bankbookDTO) throws Exception {
		int result = bankbookService.setUpdate(bankbookDTO);
		return "redirect:./bankbookList";
	}
	
	@RequestMapping(value = "bankbookDelete")
	public String setDelete(BankBookDTO bankbookDTO) throws Exception {
		int result = bankbookService.setDelete(bankbookDTO);
//		modelAndView.addObject("dto", bankbookDTO);
//		modelAndView.setViewName("redirect:bankbookList");
		return "redirect:./bankbookList";
	}
	
	@RequestMapping(value = "bankbookAdd")
	public void setWrite() throws Exception {
		
	}
	
	@RequestMapping(value = "bankbookAdd", method = RequestMethod.POST)
	public ModelAndView setWrite(BankBookDTO bankbookDTO, ModelAndView modelAndView) throws Exception {
		int result = bankbookService.setWrite(bankbookDTO);
		modelAndView.addObject("dto", bankbookDTO);
		modelAndView.setViewName("redirect:bankbookList");
		return modelAndView;
	}
	
	@RequestMapping("bankbookList")		// url 주소 하나만 쓴다면 value 생략 가능
	public void getList(Model model) throws Exception {
		List<BankBookDTO> ar = bankbookService.getList();
		model.addAttribute("list", ar);
	}
	
	@RequestMapping(value = "bankbookSelect")
	public ModelAndView getSelect(BankBookDTO bankbookDTO, ModelAndView modelAndView) throws Exception {
		bankbookDTO = bankbookService.getSelect(bankbookDTO);
		modelAndView.addObject("dto", bankbookDTO);
		modelAndView.setViewName("bankbook/bankbookSelect");
		return modelAndView;
	}
	
}
