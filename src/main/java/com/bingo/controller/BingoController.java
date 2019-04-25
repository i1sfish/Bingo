package com.bingo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BingoController {
	
	@RequestMapping("/")
	public String home(Model model) {
		return "index";
	}
}
