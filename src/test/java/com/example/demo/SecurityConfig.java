package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
          .authorizeHttpRequests(authorize -> authorize
              .anyRequest().authenticated()
            )
          .formLogin()
          .and()
          .csrf().disable()
          .exceptionHandling().authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/login"))
          .and()
          .formLogin()
          .loginPage("/login")
          .permitAll()
          .and()
          .logout()
          .logoutSuccessUrl("/")
          .permitAll();
    }
}