package com.example.todo.app.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "users")
public class UserForm {

	@Column(name = "for_search_id")
	private String forSearchId;

	@Column
	private String password;

	@Column(name = "user_kbn")
	private String userKbn;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "postal_code")
	private String postalCode;

	@Column
	private String address;

	@Column(name = "job_code")
	private String jobCode;

	@Column(name = "mail_address")
	private String mailAddress;

	@Column(name = "is_searchable")
	private boolean isSearchable;

}