package fr.softingit.springbootsecservice.sec.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Test 1 :
        http.csrf().disable();

        // Test 2 :
        http.headers().frameOptions().disable();

        // Test 3 :
        // toutes les requettes ne necessiste pas une authentification
        http.authorizeRequests().anyRequest().permitAll();
    }
}
