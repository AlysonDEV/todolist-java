package com.github.alysondev.todolistjava.users;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  @PostMapping("/")
  public void create(@RequestBody UserModel UserModel) {
    System.out.println(UserModel.name);
  }
}
