package com.example.demo.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.filter.JWTRequestFilter;

@Configuration
@EnableWebSecurity
public class JWTConfigure extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService jwtuserdetailsService;
	
	@Autowired
	private JWTRequestFilter jwtrequestfilter;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf()
	    .disable()
		.authorizeRequests().antMatchers("token").authenticated().and().sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		http.addFilterBefore(jwtrequestfilter , UsernamePasswordAuthenticationFilter.class);
		
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder authe) throws Exception {
		authe.userDetailsService(jwtuserdetailsService);
	}
	  
	 @Bean
	public PasswordEncoder passEncoder(){
	return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationManager authenticationmanagerbean () throws Exception{
	return super.authenticationManagerBean();
	}
	

}
