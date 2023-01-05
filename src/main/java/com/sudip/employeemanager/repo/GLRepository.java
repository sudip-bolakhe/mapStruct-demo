package com.sudip.employeemanager.repo;

import com.sudip.employeemanager.entity.GLAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GLRepository extends MongoRepository<GLAccount, String> {

}
