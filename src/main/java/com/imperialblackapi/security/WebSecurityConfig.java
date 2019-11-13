
//  package com.imperialblackapi.security;
//  
//  import org.springframework.context.annotation.Configuration; import
//  org.springframework.http.HttpMethod; import
//  org.springframework.security.config.annotation.authentication.builders.
//  AuthenticationManagerBuilder; import
//  org.springframework.security.config.annotation.web.builders.HttpSecurity;
//  import
//  org.springframework.security.config.annotation.web.builders.WebSecurity;
//  import org.springframework.security.config.annotation.web.configuration.
//  EnableWebSecurity; import
//  org.springframework.security.config.annotation.web.configuration.
//  WebSecurityConfigurerAdapter; import
//  org.springframework.security.web.util.matcher.RequestMatcher; import
//  org.springframework.util.AntPathMatcher;
//  
//  @Configuration
//  @EnableWebSecurity public class WebSecurityConfig extends
//  WebSecurityConfigurerAdapter{
//  
//  @Override 
//  public void configure(HttpSecurity http) throws Exception {
//  http.csrf().disable().authorizeRequests() .antMatchers(HttpMethod.GET,
//  "/login").permitAll() .anyRequest().authenticated().and().formLogin().permitAll()
//  ;
//  
//  }
//  
//  @Override 
//  public void configure(AuthenticationManagerBuilder auth) throws Exception { 
//	  auth.inMemoryAuthentication()
//  .withUser("gustavo").password("123456").roles("ADMIN"); }
//  
//  
//  }
 