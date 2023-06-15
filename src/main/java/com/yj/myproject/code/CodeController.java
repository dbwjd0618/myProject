package com.yj.myproject.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yj.myproject.code.model.Code;
import com.yj.myproject.code.service.CodeService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/code")
@Slf4j
public class CodeController {

	@Autowired
	CodeService codeService;
	
	@GetMapping("/codeList.do")
	public String codeList(Model model) {
		
		List<Code> codeList = codeService.codeList();
		model.addAttribute("codeList", codeList);
		
		return "code/codeList";
	}
	
	@PostMapping("/insertCode.do")
	public ModelAndView insertCode(Code code) {
		ModelAndView mav = new ModelAndView("jsonView");
		
		try {
			int result = codeService.insertCode(code);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mav;
	}
}
