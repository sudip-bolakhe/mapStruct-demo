package com.sudip.employeemanager.v1.mapper;

import com.sudip.employeemanager.entity.Address;
import com.sudip.employeemanager.v1.model.AddressModel;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-04T10:52:34+0545",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Autowired
    private PostalMapper postalMapper;

    @Override
    public Address addressModelToAddress(AddressModel addressModel) {
        if ( addressModel == null ) {
            return null;
        }

        Address address = new Address();

        address.setCountry( addressModel.getCountryName() );
        address.setState( addressModel.getStateName() );
        address.setStreet( addressModel.getStreetName() );
        address.setPostalCodes( postalMapper.convertPostalCodesTo( addressModel.getPostalCodeModelList() ) );

        return address;
    }

    @Override
    public AddressModel addressModelToAddress(Address addressModel) {
        if ( addressModel == null ) {
            return null;
        }

        AddressModel addressModel1 = new AddressModel();

        addressModel1.setCountryName( addressModel.getCountry() );
        addressModel1.setStateName( addressModel.getState() );
        addressModel1.setStreetName( addressModel.getStreet() );
        addressModel1.setPostalCodeModelList( postalMapper.convertFrom( addressModel.getPostalCodes() ) );

        return addressModel1;
    }
}
