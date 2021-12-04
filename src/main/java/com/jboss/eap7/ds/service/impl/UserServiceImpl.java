package com.jboss.eap7.ds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jboss.eap7.ds.model.User;
import com.jboss.eap7.ds.repo.UserRepo;
import com.jboss.eap7.ds.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public User saveUser(User usr) {
		return userRepo.save(usr);
	}

	@Override
	public List<User> fetchAllUser() {
		return userRepo.findAll();
	}

}
