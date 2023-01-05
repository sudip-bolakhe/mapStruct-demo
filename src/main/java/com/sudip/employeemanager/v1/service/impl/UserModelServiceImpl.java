package com.sudip.employeemanager.v1.service.impl;

import com.sudip.employeemanager.entity.User;
import com.sudip.employeemanager.service.UserService;
import com.sudip.employeemanager.v1.mapper.UserMapper;
import com.sudip.employeemanager.v1.model.UserModel;
import com.sudip.employeemanager.v1.service.UserModelService;
import java.util.HashMap;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserModelServiceImpl implements UserModelService {

  @Autowired
  private UserMapper userMapper;

  @Autowired
  private UserService userService;

  @Override
  public UserModel create(UserModel userModel) {
    User user = userMapper.userModelToUser(userModel, new TreeMap<>());

    return userMapper.userToUserModel(userService.addUser(user), new HashMap<>());
  }

  @Override
  public UserModel update(String userId, UserModel userModel) {
    User existingUser = userService.getUser(userId);
    userMapper.mergeUser(userModel, existingUser, new TreeMap<>());
    return userMapper.userToUserModel(userService.addUser(existingUser), new TreeMap<>());
  }

  @Override
  public UserModel getById(String id) {
    return userMapper.userToUserModel(userService.getUser(id), new TreeMap<>());
  }
}
