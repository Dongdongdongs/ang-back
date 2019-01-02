package com.ang.back.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ang.back.dao.AngBoardDAO;
import com.ang.back.service.AngBoardService;
import com.ang.back.vo.AngBoard;

@Service
public class AngBoardServiceImpl implements AngBoardService {
	
	@Autowired
	private AngBoardDAO abd;
	
	@Override
	public List<AngBoard> SelectBoardList(AngBoard ab) {
		return abd.SelectBoardList(ab);
	}

	@Override
	public Integer insertBoard(AngBoard ab) {
		return abd.insertBoard(ab);
	}

	@Override
	public AngBoard SelectBoard(Integer num) {
		return abd.SelectBoard(num);
	}

}
