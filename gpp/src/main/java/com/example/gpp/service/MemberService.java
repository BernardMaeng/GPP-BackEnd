package com.example.gpp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.gpp.dto.MemberDto;

//UserDetailsService 인터페이스는 스프링큐리티에서 인증과 관련된 핵심 인터페이스 중 하나로, 사용자 인증 정보를 조회할 때 필요한 메소드를 제공
public interface MemberService extends UserDetailsService {
	
	public MemberDto selectMemberDetail(int memIdx) throws Exception;
	/*
	 * User createUser(User user);
	 * 
	 * User findByEmail(String email);
	 */
}
