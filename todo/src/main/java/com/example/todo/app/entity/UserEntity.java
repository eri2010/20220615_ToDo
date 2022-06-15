package com.example.todo.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "users")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;

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

	@Column(name = "delete_flg")
	private String deleteFlg;

	@Column(name = "created_at")
	private LocalDate createdAt;

	@Column(name = "updated_at")
	private LocalDate updatedAt;

}