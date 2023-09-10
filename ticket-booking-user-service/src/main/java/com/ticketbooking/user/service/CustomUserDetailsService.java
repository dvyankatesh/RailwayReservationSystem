package com.ticketbooking.user.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ticketbooking.user.entity.User;

@Service
public class CustomUserDetailsService  {
	
    @Autowired
    private UserService userService;

    public User loadUserByUsername(String emailId,String password)  {
    	
    	User user = this.userService.getUserByEmailAndPassword(emailId,password);
    	
        return user;
        
    }
    	
}
