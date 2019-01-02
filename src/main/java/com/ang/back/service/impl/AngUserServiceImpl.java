package com.ang.back.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ang.back.dao.AngUserDAO;
import com.ang.back.service.AngUserService;
import com.ang.back.vo.AngUser;

@Service
public class AngUserServiceImpl implements AngUserService {

	@Autowired
	private AngUserDAO audao;
	
	@Override
	public AngUser loginUser(AngUser au) {
		AngUser anguser = audao.loginUser(au);
		if(anguser==null) {
			return null;
		}
		if(au.getPwd().equals(anguser.getPwd())) {
			return anguser;
		}
		return null;
	}

}
