package com.sudip.employeemanager.v1.mapper;

import com.sudip.employeemanager.entity.User;
import com.sudip.employeemanager.v1.model.UserModel;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-04T11:15:36+0545",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl extends UserMapper {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public User userModelToUser(UserModel userModel, Map<String, String> myMap) {
        if ( userModel == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( userModel.getfName() );
        user.setLastName( userModel.getlName() );
        user.setId( userModel.getId() );
        user.setAddress( addressMapper.addressModelToAddress( userModel.getAddress() ) );

        user.setGlAccountId( glConverter.convertFrom(userModel.getGlAccountRef(), myMap) );

        return user;
    }

    @Override
    public UserModel userToUserModel(User user, Map<String, String> myMap) {
        if ( user == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setfName( user.getFirstName() );
        userModel.setlName( user.getLastName() );
        userModel.setId( user.getId() );
        userModel.setAddress( addressMapper.addressModelToAddress( user.getAddress() ) );

        userModel.setGlAccountRef( glConverter.convertTo(user.getGlAccountId()) );

        return userModel;
    }

    @Override
    public void mergeUser(UserModel userModel, User user, Map<String, String> myMap) {
        if ( userModel == null ) {
            return;
        }

        if ( userModel.getfName() != null ) {
            user.setFirstName( userModel.getfName() );
        }
        if ( userModel.getlName() != null ) {
            user.setLastName( userModel.getlName() );
        }
        if ( userModel.getId() != null ) {
            user.setId( userModel.getId() );
        }
        if ( userModel.getAddress() != null ) {
            user.setAddress( addressMapper.addressModelToAddress( userModel.getAddress() ) );
        }

        user.setGlAccountId( glConverter.convertFrom(userModel.getGlAccountRef(), myMap) );
    }
}
