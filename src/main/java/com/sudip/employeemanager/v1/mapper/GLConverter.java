package com.sudip.employeemanager.v1.mapper;

import com.sudip.employeemanager.entity.GLAccount;
import com.sudip.employeemanager.service.GLAccountService;
import com.sudip.employeemanager.v1.model.ReferenceModel;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GLConverter {

  @Autowired
  private GLAccountService glAccountService;

  public String convertFrom(ReferenceModel referenceModel, Map<String, String> myMap) {
    return glAccountService.findById(referenceModel.getId()).getId();
  }

  public ReferenceModel convertTo(String id) {
    GLAccount glAccount = glAccountService.findById(id);
    ReferenceModel referenceModel = new ReferenceModel();
    referenceModel.setDescription(glAccount.getDescription());
    referenceModel.setExternalId(glAccount.getExternalId());
    referenceModel.setDocNo(glAccount.getName());
    referenceModel.setId(id);
    return referenceModel;
  }
}
