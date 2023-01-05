package com.sudip.employeemanager.service.impl;

import com.sudip.employeemanager.entity.GLAccount;
import com.sudip.employeemanager.repo.GLRepository;
import com.sudip.employeemanager.service.GLAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GLAccountServiceImpl implements GLAccountService {

  @Autowired
  private GLRepository glRepository;

  @Override
  public GLAccount findById(String id) {
    return glRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Error"));
  }
}
