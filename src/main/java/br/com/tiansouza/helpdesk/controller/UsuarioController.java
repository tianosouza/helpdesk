package br.com.tiansouza.helpdesk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/usuarios")
public class UsuarioController {

  @PostMapping
  public ResponseEntity create() {
    System.out.println("Criando usuario");
    return ResponseEntity.noContent().build();
  }
}
