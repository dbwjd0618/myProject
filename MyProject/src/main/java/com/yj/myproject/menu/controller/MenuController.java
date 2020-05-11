package com.yj.myproject.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yj.myproject.menu.model.service.MenuService;
import com.yj.myproject.menu.model.vo.Gallary;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/gallary")
public class MenuController {
	
	@Autowired
	MenuService menuService;

	@GetMapping("/gallaryList.do")
	public String gallaryList(Model model) {
		
		List<Gallary> gallary = menuService.gallaryList();
		model.addAttribute("gallary", gallary);
		
		
		return "gallary/gallaryList";
	}
	
}
