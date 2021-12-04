package com.jboss.eap7.ds.service;

import java.util.List;

import com.jboss.eap7.ds.model.User;

public interface UserService {
   User saveUser(User usr);
   List<User> fetchAllUser();
}
