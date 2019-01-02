package com.ang.back.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ang.back.service.AngUserService;
import com.ang.back.vo.AngBoard;
import com.ang.back.vo.AngUser;
@RestController
public class AngUserController {
	private static final Logger logger = LoggerFactory.getLogger(AngUserController.class);
	@Autowired
	private AngUserService aus;
	
	@PostMapping("/login")
	public AngUser userLogin(@RequestBody AngUser au, HttpSession session) {
		logger.info("session id=>{}", session.getId());
		au = aus.loginUser(au);
		if(au!=null) {
			au.setToken("bdi");
		}
		return au;
	};

}
