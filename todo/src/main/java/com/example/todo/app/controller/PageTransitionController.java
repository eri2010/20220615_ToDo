package com.example.todo.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.todo.app.constant.Options.jobs;

@Controller
public class PageTransitionController {

	@Autowired
	HttpSession session;

	@RequestMapping("/")
	public String loginPage() {
		session.invalidate();
		return "account/login";

	}

	@RequestMapping("/addManagerAccount")
	public ModelAndView addManagerAccountPage(ModelAndView mv) {
		mv.addObject("userKbn", 1);
		mv.addObject("jobList", jobs.values());
		mv.setViewName("account/addAccount");
		return mv;
	}

	@RequestMapping("/addAccount")
	public ModelAndView addAccountPage(ModelAndView mv) {
		mv.addObject("userKbn", 2);
		mv.setViewName("account/addAccount");
		return mv;
	}

}
