package com.ang.back.service;

import java.util.List;
import java.util.Map;

import com.ang.back.vo.AngBoard;

public interface AngBoardService {

	public List<AngBoard> SelectBoardList(AngBoard ab);
	public Integer insertBoard(AngBoard ab);
	public AngBoard SelectBoard(Integer num);
	}
