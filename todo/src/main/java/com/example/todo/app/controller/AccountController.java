package com.example.todo.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.todo.app.form.UserForm;
import com.example.todo.domain.service.AddAccountService;
import com.example.todo.domain.util.HashPwService;

@Controller
public class AccountController {

	@Autowired
	HttpSession session;

	@Autowired
	AddAccountService addAccountService;

	@Autowired
	HashPwService hashPwService;

	@RequestMapping(value = "/addAccount", method = RequestMethod.POST)
	private ModelAndView addAccount(
			@ModelAttribute UserForm userForm,
			ModelAndView mv) {

		String hashPW = hashPwService.hashPw(userForm.getPassword());
		userForm.setPassword(hashPW);
		addAccountService.setAccountInfo(userForm);
		return mv;

	}

}