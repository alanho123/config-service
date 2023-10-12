package com.polarbookshop.configservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author : Jason Ho
 * @since : 2023/10/11
 */
@Configuration
public class SecurityConfiguration {

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf()
//                .ignoringAntMatchers("/encrypt/**")
//                .ignoringAntMatchers("/decrypt/**");
//    }

    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
//                .csrf(csrf -> {
//                    csrf.ignoringRequestMatchers("/encrypt/**").ignoringRequestMatchers("/decrypt/**");
//                })
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/token/**").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
//                .httpBasic(Customizer.withDefaults())
                .build();
    }
}
