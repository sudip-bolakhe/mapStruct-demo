package com.sudip.employeemanager.v1.model;

public class UserModel {

  private String id;

  private String fName;

  private String lName;

  private ReferenceModel glAccountRef;

  private AddressModel address;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public String getlName() {
    return lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  public ReferenceModel getGlAccountRef() {
    return glAccountRef;
  }

  public void setGlAccountRef(ReferenceModel glAccountRef) {
    this.glAccountRef = glAccountRef;
  }

  public AddressModel getAddress() {
    return address;
  }

  public void setAddress(AddressModel address) {
    this.address = address;
  }
}
