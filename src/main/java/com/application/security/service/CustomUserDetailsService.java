package com.application.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.application.security.model.User;
import com.application.security.repositories.UserRepository;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByUsername(username);
		CustomUserDetails userDEtails = null;
			if(user != null) {
				userDEtails = new CustomUserDetails();
				userDEtails.setUser(user);	
			}else {
				throw new UsernameNotFoundException("User not exist with name : " + username);
			}
		return userDEtails;
		
	}


}
