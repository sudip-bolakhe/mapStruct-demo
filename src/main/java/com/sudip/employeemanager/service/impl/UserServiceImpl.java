package com.sudip.employeemanager.service.impl;

import com.sudip.employeemanager.entity.User;
import com.sudip.employeemanager.repo.UserRepository;
import com.sudip.employeemanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public User addUser(User user) {
    return userRepository.save(user);
  }

  @Override
  public User getUser(String id) {
    return userRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("error"));
  }
}
