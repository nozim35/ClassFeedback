package de.hawhamburg.classfee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
//testBranch
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                "/",
                                "/index",
                                "/dashboard",
                                "/login",
                                "/register",
                                "/module",
                                "/feedbacks",
                                "/semester",
                                "/about",
                                "/style.css",
                                "/feedback_form",
                                "/mathe1",
                                "/informatik1",
                                "/programmieren1",
                                "/media_game_design1",
                                "/dramaturgie1",
                                "medienrecht",
                                "/wintersemester24_25",
                                "/sommersemester25"



                        ).permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/login").permitAll()
                )
                .logout(logout -> logout.permitAll());

        return http.build();
    }
}
