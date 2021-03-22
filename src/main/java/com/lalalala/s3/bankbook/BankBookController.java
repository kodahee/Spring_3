package com.lalalala.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankBookController {
	
	@Autowired
	private BankBookService bankbookService;
	
	// 상품 리스트
	@RequestMapping(value = "/bankbook/bankbookList")
	public void bankbookList(Model model) throws Exception {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("bankbookList", ar);
		
		List<BankBookDTO> ar = bankbookService.bankbookList();
		model.addAttribute("bankbookList", ar);
		model.addAttribute("kind", "BankBook EL Test");
	}
	
	// 상품 상세
	@RequestMapping(value = "/bankbook/bankbookSelect")
	public ModelAndView bankbookSelect(BankBookDTO bankbookDTO, ModelAndView modelAndView) throws Exception {
		bankbookDTO = bankbookService.bankbookSelect(bankbookDTO);
		modelAndView.addObject("dto", bankbookDTO);					// void, model로 해도 상관없음
		modelAndView.setViewName("bankbook/bankbookSelect");		
		
		return modelAndView;
	}
	
	// 상품등록
	@RequestMapping(value = "/bankbook/bankbookAdd")
	public void bankbookAdd() throws Exception {
		
	}
	
	@RequestMapping(value = "/bankbook/bankbookAdd", method = RequestMethod.POST)
	public ModelAndView bankbookAdd(BankBookDTO bankbookDTO, ModelAndView modelAndView) throws Exception {
//		int result = bankbookService.bankbookAdd(bankbookDTO);
//		
//		modelAndView.addObject("bankDTO", bankbookDTO);
		modelAndView.setViewName("redirect:bankbookList");
		
		return modelAndView;
	}
	
	// 상품 수정
	@RequestMapping(value = "/bankbook/bankbookUpdate")
	public void bankbookUpdate(long bookNumber, ModelAndView modelAndView) throws Exception {
		
	}

	@RequestMapping(value = "/bankbook/bankbookUpdate", method = RequestMethod.POST)
	public void bankbookUpdate() throws Exception {
		
	}
	
	// 상품 삭제
	@RequestMapping(value = "bankbook/bankbookDelete")
	public void bankbookDelete(long bookNumber) throws Exception {
		
	}
	
}
