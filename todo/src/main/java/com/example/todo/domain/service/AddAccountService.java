package com.example.todo.domain.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.app.form.UserForm;
import com.example.todo.domain.repository.UserMapper;

@Service
public class AddAccountService implements IAddAccount {

	@Autowired
	HttpSession session;

	@Autowired
	UserMapper userMapper;

	@Override
	public void addAccoount() {

	}

//	新規会員登録処理
//	入力チェックはFormクラスのアノテーションで対応
	public void setAccountInfo(UserForm user) {

//		メールアドレス既存チェック（存在していればfalse）

	}

}
