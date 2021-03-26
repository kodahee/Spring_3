package com.lalalala.s3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping(value = "noticeList")
	public void getList(NoticeDTO noticeDTO, Model model) throws Exception {
		List<NoticeDTO> ar = noticeService.getList(noticeDTO);
		model.addAttribute("list", ar);
	}

}
