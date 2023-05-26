package com.example.gpp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.gpp.dto.MemberDto;
import com.example.gpp.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		throw new UsernameNotFoundException("Not found.");
	}
	@Override
	public MemberDto selectMemberDetail(int memIdx) throws Exception {
		
		return memberMapper.selectMemberDetail(memIdx);
	}

	/*
	 * @Override public User createUser(User user) { return
	 * userRepository.save(user); }
	 * 
	 * @Override public User findByEmail(String email) { return
	 * userRepository.findByEmail(email); }
	 */

}
