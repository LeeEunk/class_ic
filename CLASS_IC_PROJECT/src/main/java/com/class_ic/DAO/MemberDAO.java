package com.class_ic.DAO;

import java.util.List;

import com.class_ic.DTO.MemberDTO;

public interface MemberDAO {

	public int memberJoin();
	
	public int memberUpdate();
	
	public int memberDelete();
	
	public MemberDTO memberSelectOne();
	
	public List<MemberDTO> memberSelectAll();
}
