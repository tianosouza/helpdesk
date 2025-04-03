package br.com.tiansouza.helpdesk.controller;

import br.com.tiansouza.helpdesk.domain.User;
import br.com.tiansouza.helpdesk.dto.CreateUserDto;
import br.com.tiansouza.helpdesk.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping(path = "/users")
public class UserController {

 private final UserService userService;

  @PostMapping
  public ResponseEntity create(@RequestBody CreateUserDto request) {
    User domain = new User(
        UUID.randomUUID(),
        request.username(),
        request.email(),
        request.password(),
        request.name(),
        request.active()
    );
    userService.createUser(domain);
    return ResponseEntity.noContent().build();
  }
}
