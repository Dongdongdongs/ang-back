package com.ang.back.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ang.back.dao.AngBoardDAO;
import com.ang.back.vo.AngBoard;

@Repository
public class AngBoardDAOImpl implements AngBoardDAO {

	@Autowired
	private SqlSession ss;
	@Override
	public List<AngBoard> SelectBoardList(AngBoard ab) {
		return ss.selectList("com.ang.back.board.BOARDLIST",ab);
	}
	@Override
	public int insertBoard(AngBoard ab) {
		return ss.insert("com.ang.back.board.INSERTBOARD", ab);
	}
	@Override
	public AngBoard SelectBoard(Integer num) {
		return ss.selectOne("com.ang.back.board.BOARD", num);
	}

}
