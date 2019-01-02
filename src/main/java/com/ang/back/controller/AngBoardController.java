package com.ang.back.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ang.back.HomeController;
import com.ang.back.service.AngBoardService;
import com.ang.back.vo.AngBoard;

@RestController
public class AngBoardController {
	private static final Logger logger = LoggerFactory.getLogger(AngBoardController.class);
	@Autowired
	private AngBoardService abs;
	
	@GetMapping("/list")
	public List<AngBoard> selectBoardList(@ModelAttribute AngBoard ab){
		logger.info("params=>{}", ab);
		return abs.SelectBoardList(ab);
	}
	
	@GetMapping("/list/{num}")
	public AngBoard selectBoard(@PathVariable Integer num){
		System.out.println(num);
		return abs.SelectBoard(num);
	}
	
	@PostMapping("/write")
	public Map<String,String> insertBoard(@RequestBody AngBoard ab) {
		Map<String,String> Map = new HashMap<>();
		Integer result = abs.insertBoard(ab);
		
		Map.put("msg", "성공");
		if(result!=1) {
			Map.put("msg", "실패");
		}
		return Map;
	}
}
