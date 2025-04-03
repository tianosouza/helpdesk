package br.com.tiansouza.helpdesk.service;

import br.com.tiansouza.helpdesk.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
  private final UserRepository userRepository;

  public void createUser(User newUser) {
  }
}
