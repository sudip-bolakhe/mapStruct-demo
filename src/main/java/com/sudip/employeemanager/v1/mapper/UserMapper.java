package com.sudip.employeemanager.v1.mapper;

import com.sudip.employeemanager.entity.User;
import com.sudip.employeemanager.v1.model.UserModel;
import java.util.Map;
import org.mapstruct.BeanMapping;
import org.mapstruct.Context;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {AddressMapper.class})
public abstract class UserMapper {

  @Autowired
  GLConverter glConverter;

  @Mapping(target = "firstName", source = "fName")
  @Mapping(target = "lastName", source = "lName")
  @Mapping(target = "glAccountId", expression = "java(glConverter.convertFrom(userModel.getGlAccountRef(), myMap))")
  public abstract User userModelToUser(UserModel userModel, @Context Map<String, String> myMap);

  @Mapping(target = "fName", source = "firstName")
  @Mapping(target = "lName", source = "lastName")
  @Mapping(target = "glAccountRef", expression = "java(glConverter.convertTo(user.getGlAccountId()))")
  public abstract UserModel userToUserModel(User user, @Context Map<String, String> myMap);

  @InheritConfiguration
  @BeanMapping(nullValuePropertyMappingStrategy =  NullValuePropertyMappingStrategy.IGNORE)
  public abstract void mergeUser(UserModel userModel, @MappingTarget User user, @Context Map<String, String> myMap);
}
