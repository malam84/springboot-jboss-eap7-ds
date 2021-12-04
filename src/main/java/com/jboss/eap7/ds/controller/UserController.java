package com.jboss.eap7.ds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jboss.eap7.ds.model.User;
import com.jboss.eap7.ds.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<User> saveUser(@RequestBody User user) {
		User usr = userService.saveUser(user);
		return new ResponseEntity<User>(usr, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
    public ResponseEntity<List<User>> UserList() {
		List<User> usr = userService.fetchAllUser();
		 return new ResponseEntity<>(usr, HttpStatus.OK);
	}
}
