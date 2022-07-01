package com.github.saeschdivara.shop.auth.configs

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {

    @Bean
    fun securityChain(http: HttpSecurity): SecurityFilterChain {
        return http
            .authorizeRequests()
                .anyRequest()
                .authenticated()
            .and()
                .oauth2Login(Customizer.withDefaults())
            .build()
    }

}