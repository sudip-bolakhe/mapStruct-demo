package com.sudip.employeemanager.v1.mapper;

import com.sudip.employeemanager.entity.PostalCode;
import com.sudip.employeemanager.v1.model.PostalCodeModel;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostalMapper {

  @Mapping(source = "name", target = "code")
  PostalCode convertTo(PostalCodeModel postalCodeModel);

  List<PostalCode> convertPostalCodesTo(List<PostalCodeModel> postalCodeModels);

  @Mapping(target = "name", source = "code")
  PostalCodeModel convertFrom(PostalCode postalCode);

  List<PostalCodeModel> convertFrom(List<PostalCode> postalCodeModels);
}
