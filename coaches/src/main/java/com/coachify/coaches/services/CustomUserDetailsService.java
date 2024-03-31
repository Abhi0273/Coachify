package com.coachify.coaches.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.coachify.coaches.entity.Coach;
import com.coachify.coaches.repository.CoachRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private CoachRepository coachRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Coach user = coachRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        return User
                .withUsername(user.getEmail())
                .password(user.getPassword())
                .roles("COACH")
                .build();
    }
}
