package com.example.web2.configs;

import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.web2.repository.UserRepository;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

  final UserRepository userRepository;

  public UserDetailsServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    com.example.web2.model.UserModel userModel = userRepository.findByUsername(username)
        .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
    if (userModel.getUsername() == null) {
      throw new UsernameNotFoundException("Usuario não encontrado!");
    }
    return new User(userModel.getUsername(), userModel.getPassword(), true, true, true, true,
        userModel.getAuthorities());
  }

}

// System.out.println("///////////" + userModel.getUsername());
// System.out.println("///////////" + userModel.getPassword());
// System.out.println("///////////" + userModel.getAuthorities());