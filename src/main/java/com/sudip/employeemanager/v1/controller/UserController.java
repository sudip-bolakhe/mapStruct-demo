package com.sudip.employeemanager.v1.controller;

import com.sudip.employeemanager.entity.User;
import com.sudip.employeemanager.service.UserService;
import com.sudip.employeemanager.v1.mapper.UserMapper;
import com.sudip.employeemanager.v1.model.UserModel;
import com.sudip.employeemanager.v1.service.UserModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserModelService userModelService;

  @Autowired
  private UserService userService;

  @PostMapping("")
  public UserModel create(@RequestBody UserModel userModel) {
    return userModelService.create(userModel);
  }

  @PutMapping("/{id}")
  public UserModel update(@PathVariable String id, @RequestBody UserModel userModel) {
    userService.getUser(id);
    return userModelService.update(id, userModel);
  }

  @PostMapping("/{id}")
  public UserModel convertFrom(@PathVariable String id) {
   return userModelService.getById(id);
  }
}
