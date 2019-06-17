package com.github.shivanikanojia.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.shivanikanojia.model.Users;

@Controller
public class RestResource 
{
	@RequestMapping("/api/users/me")
	public ResponseEntity<Users> profile() 
	{
		//Build some dummy data to return for testing
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String email = user.getUsername() + "@howtodoinjava.com";

		Users profile = new Users();
		profile.setUsername(user.getUsername());
		profile.setEmail(email);

		return ResponseEntity.ok(profile);
	}
}
