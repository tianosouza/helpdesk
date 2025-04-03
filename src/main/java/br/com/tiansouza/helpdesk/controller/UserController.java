package br.com.tiansouza.helpdesk.controller;

import br.com.tiansouza.helpdesk.dto.CreateUserDto;
import br.com.tiansouza.helpdesk.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping(path = "/users")
public class UserController {

 private final UserService userService;

  @PostMapping
  public ResponseEntity create(CreateUserDto request) {
    System.out.println("Criando usuario");
    return ResponseEntity.noContent().build();
  }
}
