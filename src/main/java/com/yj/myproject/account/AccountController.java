package com.yj.myproject.account;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yj.myproject.account.exception.AccountException;
import com.yj.myproject.account.model.Account;
import com.yj.myproject.account.service.AccountService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/account")
@Slf4j
@SessionAttributes(value = {"memberLoggedIn"})

public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping("/login.do")
	public String login() {
		log.debug("login.do!!");
		
		return "account/login";
	}
	
	
	@PostMapping("/login.do")
	public String login(@RequestParam("memberID") String memberID,
		  			    @RequestParam("memberPWD") String memberPWD,
		  			    Model model,
		  			    RedirectAttributes redirectAttributes) {
		
		try	{
			
			Account account = accountService.login(memberID);
			
			if(account != null && memberPWD.equals(account.getMemberPWD())) {
				//로그인 성공시
				model.addAttribute("memberLoggedIn", account);
				/* log.debug(memberID); */
				
				return "redirect:/";
			} else {
				//로그인 실패
				String msg = "입력하신 계정이 일치하지 않습니다.";
				
				redirectAttributes.addFlashAttribute("msg", msg);
				log.debug(msg);
			}
		
		} 
		
		catch(Exception e) {
			log.error("로그인 처리 예외", e);
			
			throw new AccountException("로그인 중 오류가 발생하였습니다.", e);
		}
		
		return "redirect:/account/login.do";
	}
 
	
	@GetMapping("/logout.do")
	public String logout(SessionStatus sessionStatus,
						 @ModelAttribute("memberLoggedIn") Account account,
						 HttpSession session) {
		
		if(!sessionStatus.isComplete())
			sessionStatus.setComplete();
		
		session.invalidate();
		
		return "redirect:/account/login.do";
	}

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
