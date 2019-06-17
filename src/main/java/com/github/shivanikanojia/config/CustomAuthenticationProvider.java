//package com.github.shivanikanojia.config;
//
//import java.util.Collections;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CustomAuthenticationProvider implements AuthenticationProvider {
//    
//	@Autowired
//	private UserDetailsService userservice;
//	
////	@Autowired
////	private TokenStore tokenStore;
//	
//	@Override
//    public Authentication authenticate(Authentication auth) 
//      throws AuthenticationException {
//
//    	DaoAuthenticationProvider provider =  new DaoAuthenticationProvider();
//
//		provider.setUserDetailsService(userservice);
//		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//    	
//		provider.authenticate(auth);
//    	String username = auth.getName();
//        String password = auth.getCredentials()
//            .toString();
// 
//        if (provider.authenticate(auth).isAuthenticated()) {
//            return new UsernamePasswordAuthenticationToken
//              (username, password, Collections.emptyList());
//        } else {
//            throw new
//              BadCredentialsException("External system authentication failed");
//        }
//    }
// 
//    @Override
//    public boolean supports(Class<?> auth) {
//        return auth.equals(UsernamePasswordAuthenticationToken.class);
//    }
//}