package com.sudip.employeemanager.service;

import com.sudip.employeemanager.entity.User;

public interface UserService {

  User addUser(User user);

  User getUser(String id);

}
