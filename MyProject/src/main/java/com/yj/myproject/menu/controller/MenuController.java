package com.yj.myproject.menu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yj.myproject.menu.model.service.MenuService;
import com.yj.myproject.menu.model.vo.Gallary;

import lombok.extern.slf4j.Slf4j;

@Controller
@SessionAttributes(value= {"gallaryList"})
@RequestMapping("/gallary")
@Slf4j
public class MenuController {
	
	@Autowired
	MenuService menuService;

	@GetMapping("/gallaryList.do")
	public String gallaryList(Model model, 
							  @RequestParam("boardCode") String boardCode,
							  HttpSession session) {
		
		List<Gallary> gallaryContents = menuService.gallaryList(boardCode);
		model.addAttribute("gallaryContents", gallaryContents);
		
		return "gallary/gallaryList";
	}
	
}
