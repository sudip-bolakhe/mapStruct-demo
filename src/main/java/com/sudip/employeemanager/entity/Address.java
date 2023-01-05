package com.sudip.employeemanager.entity;

import java.util.List;

public class Address {
  private String country;
  private String state;
  private String street;

  private List<PostalCode> postalCodes;

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public List<PostalCode> getPostalCodes() {
    return postalCodes;
  }

  public void setPostalCodes(List<PostalCode> postalCodes) {
    this.postalCodes = postalCodes;
  }
}
