package com.example.todo.domain.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author hiran
 *         パスワードのハッシュ化機能
 */
@Service
public class HashPwService {

	public String hashPw(String pw) {
		BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
		String hashPw = bcpe.encode(pw);
		return hashPw;

	}

}
