package com.ang.back.dao;

import java.util.List;

import com.ang.back.vo.AngBoard;

public interface AngBoardDAO {

	public List<AngBoard> SelectBoardList(AngBoard ab);
	public int insertBoard(AngBoard ab);
	public AngBoard SelectBoard(Integer num);
}
