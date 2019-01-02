package com.ang.back.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ang.back.dao.AngUserDAO;
import com.ang.back.vo.AngUser;
@Repository
public class AngUserDAOImpl implements AngUserDAO {

	@Autowired
	private SqlSession ss;
	@Override
	public AngUser loginUser(AngUser au) {
		return ss.selectOne("com.ang.back.board.USERLOGIN",au);
	}

}
