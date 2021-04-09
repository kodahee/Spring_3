package com.lalalala.s3.board.comments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comments/**")
public class CommnetsController {
	
	@Autowired
	private CommentsService commentsService;
	
	// /comments/commentsList
	@GetMapping("commentsList")
	public void getList(CommentsDTO commentsDTO) throws Exception {
		
		List<CommentsDTO> ar = commentsService.getList(commentsDTO);
	}

}
