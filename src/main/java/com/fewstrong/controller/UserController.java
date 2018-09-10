package com.fewstrong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fewstrong.Entity.User;
import com.fewstrong.dto.qo.UserQo;
import com.fewstrong.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/all", method = { RequestMethod.GET })
	public List<User> all() {
		return userService.findAll();
	}
	
	@RequestMapping(value = "/all", method = { RequestMethod.POST })
	public Page<User> all(@RequestBody UserQo userQo) {
		return userService.findAll(userQo);
	}
}
