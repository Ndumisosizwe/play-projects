package com.ndumiso.security.JWTSecurity.config.security;

import com.ndumiso.security.JWTSecurity.entity.authentication.CustomUserDetails;
import com.ndumiso.security.JWTSecurity.entity.authentication.User;
import com.ndumiso.security.JWTSecurity.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("myCustomUserDetailService")
public class MyUserDetailService implements UserDetailsService {

    private UserRepository userRepository;

    public MyUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findByName(s);
        User user = optionalUser.orElseThrow(() -> new UsernameNotFoundException("Username not found."));
        return new CustomUserDetails(user.getEmail(), user.getPassword(), user.getName(), user.getLastName(), user.getActive(), user.getRoles());
    }
}
