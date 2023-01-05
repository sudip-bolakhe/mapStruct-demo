package com.sudip.employeemanager.v1.service;

import com.sudip.employeemanager.v1.model.UserModel;

public interface UserModelService {

  UserModel create(UserModel userModel);
  UserModel update(String userId, UserModel userModel);
  UserModel getById(String id);

}
