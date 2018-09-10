package com.fewstrong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fewstrong.Entity.User;
import com.fewstrong.dto.qo.UserQo;
import com.fewstrong.jpa.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}

	public Page<User> findAll(UserQo userQo) {
		return userRepository.findAll(userQo);
	}
}
