package com.sudip.employeemanager.v1.mapper;

import com.sudip.employeemanager.entity.Address;
import com.sudip.employeemanager.v1.model.AddressModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PostalMapper.class})
public interface AddressMapper {

  @Mapping(target = "country", source = "countryName")
  @Mapping(target = "state", source = "stateName")
  @Mapping(target = "street", source = "streetName")
  @Mapping(target = "postalCodes", source = "postalCodeModelList")
  Address addressModelToAddress(AddressModel addressModel);

  @Mapping(source = "country", target = "countryName")
  @Mapping(source = "state", target = "stateName")
  @Mapping(source = "street", target = "streetName")
  @Mapping(source = "postalCodes", target = "postalCodeModelList")
  AddressModel addressModelToAddress(Address addressModel);
}
