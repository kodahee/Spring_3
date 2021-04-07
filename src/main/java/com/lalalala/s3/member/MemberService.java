package com.lalalala.s3.member;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.lalalala.s3.util.FileManager;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private FileManager fileManager;
	
	public int memberUpdate(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberUpdate(memberDTO);
	}
	
	public int memberDelete(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberDelete(memberDTO);
	}
	
	public int memberJoin(MemberDTO memberDTO, MultipartFile avatar, HttpSession session) throws Exception {
		
		fileManager.save("member", avatar, session);
		
		// makePath 호출
		
		
		// 4. 저장할 파일명 생성
		
		// makeTimeFileName or makeUUIDFileName 호출
		
		// 1) time
//		Calendar cal = Calendar.getInstance();
//		long time = cal.getTimeInMillis();
//		String name = avatar.getOriginalFilename();
//		name = name.substring(name.lastIndexOf("."));
//
//		System.out.println("확장자 : "+ name);
//
//		name = time + avatar.getOriginalFilename();
//		System.out.println("최종이름1 : " + name);
//
//		name = time + "_" + avatar.getOriginalFilename();
//		System.out.println("최종이름2 : " + name);
		
		// 2) UUID
//		String fileName = UUID.randomUUID().toString();
//		fileName = fileName + "_" + avatar.getOriginalFilename();
//		System.out.println("UUID : " + fileName); 
		
		// 5. HDD 에 파일 저장
		// 목적지 객체
//		file = new File(file, name); 		// parent : 경로, child : 저장할 이름
		
		// 1) FileCopyUtils 클래스의 copy 메서드 사용
		// FileCopyUtils.copy(avatar.getBytes(), file);
		
		// 2) MultipartFile 클래스의 메서드 사용
//		file = new File(file, fileName);
//		avatar.transferTo(file);
		
		
		return 0;
		// return memberDAO.memberJoin(memberDTO);
	}
	
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberLogin(memberDTO);
	}

}
