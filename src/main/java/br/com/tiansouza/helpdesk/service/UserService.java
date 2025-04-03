package br.com.tiansouza.helpdesk.service;

import br.com.tiansouza.helpdesk.domain.User;
import br.com.tiansouza.helpdesk.entity.UserEntity;
import br.com.tiansouza.helpdesk.repository.UserRepository;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserService {
  private final UserRepository userRepository;

  public void createUser(User newUser) {
   // BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    UserEntity entity = new UserEntity();
    entity.setId(newUser.id());
    entity.setName(newUser.name());
    entity.setActive(true);
    entity.setEmail(newUser.email());
    entity.setUsername(newUser.username());
    //entity.setPassword(passwordEncoder.encode(newUser.password()));
    entity.setPassword(newUser.password());
    entity.setCreatedAt(new java.util.Date());
    entity.setUpdatedAt(new java.util.Date());
    userRepository.save(entity);
  }
}
