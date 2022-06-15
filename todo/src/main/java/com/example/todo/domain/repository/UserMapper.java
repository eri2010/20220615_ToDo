package com.example.todo.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.todo.app.form.UserForm;

@Mapper
public interface UserMapper {

	List<UserForm> findOne(String mailAddress);

}
