package com.sudip.employeemanager.v1.model;

import java.util.List;

public class AddressModel {
  private String countryName;
  private String stateName;
  private String streetName;

  private List<PostalCodeModel> postalCodeModelList;

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public List<PostalCodeModel> getPostalCodeModelList() {
    return postalCodeModelList;
  }

  public void setPostalCodeModelList(
      List<PostalCodeModel> postalCodeModelList) {
    this.postalCodeModelList = postalCodeModelList;
  }
}
