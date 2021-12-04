package com.jboss.eap7.ds.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jboss.eap7.ds.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
