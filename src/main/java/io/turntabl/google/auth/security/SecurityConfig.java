package io.turntabl.google.auth.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.antMatcher("/**")
               .authorizeRequests()
               .antMatchers("/", "/login").permitAll()
               .anyRequest()
               .authenticated()
               .and()
               .oauth2Login()
               .and()
               .logout();
    }
}
