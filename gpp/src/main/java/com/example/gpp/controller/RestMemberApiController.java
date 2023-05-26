package com.example.gpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.gpp.dto.MemberDto;
import com.example.gpp.service.MemberService;

@RestController
public class RestMemberApiController {

	@Autowired
	private MemberService memberService;

	@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
	@RequestMapping("/mem/{memIdx}")
	public ResponseEntity<MemberDto> selectMemberDetail(@PathVariable("memIdx")int memIdx) throws Exception {
		MemberDto memberDto = memberService.selectMemberDetail(memIdx);
		if(memberDto == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		} else {
			return ResponseEntity.ok(memberDto);
		}
		
	}

//	@PostMapping("/register")
//	public ResponseEntity<User> registerUser(@RequestBody User user) {
//		try {
//			User createdUser = userService.createUser(user);
//			return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//
//	@PostMapping("/login")
//	public ResponseEntity<User> loginUser(@RequestParam(name = "email") String email,
//			@RequestParam(name = "password") String password) {
//		User user = userService.findByEmail(email);
//		if (user != null && user.getPassword().equals(password)) {
//			return new ResponseEntity<>(user, HttpStatus.OK);
//		} else {
//			return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
//		}
//	}

//	@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
//	@RequestMapping("/check")
//	public String check() {
//		boolean condition = true;
//
//		if (condition) {
//			return "응답 성공";
//		} else {
//			return "응답 실패";
//		}
	
	
}
