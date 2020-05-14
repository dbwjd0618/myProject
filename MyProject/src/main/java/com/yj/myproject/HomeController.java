package com.yj.myproject;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.yj.myproject.menu.model.service.MenuService;
import com.yj.myproject.menu.model.vo.Gallary;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	@Autowired
	private MenuService menuService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model,
					   HttpSession session) {
		
		List<Gallary> gallaryList = menuService.gallaryList();
		session.setAttribute("gallaryList", gallaryList);
		
		
		return "index";
	}
	
}
