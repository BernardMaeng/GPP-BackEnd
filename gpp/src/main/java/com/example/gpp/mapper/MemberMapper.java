package com.example.gpp.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.gpp.dto.MemberDto;

@Mapper
public interface MemberMapper {
	
MemberDto selectMemberDetail(int memIdx) throws Exception;

}
