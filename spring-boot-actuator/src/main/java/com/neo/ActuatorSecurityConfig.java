package com.neo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.util.StringUtils;

/**
 * Created by tandy on 2018/4/5.
 */
@Configurable
@EnableWebSecurity
public class ActuatorSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private Environment env;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        String contextPath = env.getProperty("management.context-path");
        if(StringUtils.isEmpty(contextPath)) {
            contextPath = "";
        }
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/**"+contextPath+"/**").authenticated()
                .anyRequest().permitAll().and().httpBasic();


    }
}
