package com.sudip.employeemanager.v1.mapper;

import com.sudip.employeemanager.entity.PostalCode;
import com.sudip.employeemanager.v1.model.PostalCodeModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-04T10:52:34+0545",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class PostalMapperImpl implements PostalMapper {

    @Override
    public PostalCode convertTo(PostalCodeModel postalCodeModel) {
        if ( postalCodeModel == null ) {
            return null;
        }

        PostalCode postalCode = new PostalCode();

        postalCode.setCode( postalCodeModel.getName() );
        postalCode.setDescription( postalCodeModel.getDescription() );

        return postalCode;
    }

    @Override
    public List<PostalCode> convertPostalCodesTo(List<PostalCodeModel> postalCodeModels) {
        if ( postalCodeModels == null ) {
            return null;
        }

        List<PostalCode> list = new ArrayList<PostalCode>( postalCodeModels.size() );
        for ( PostalCodeModel postalCodeModel : postalCodeModels ) {
            list.add( convertTo( postalCodeModel ) );
        }

        return list;
    }

    @Override
    public PostalCodeModel convertFrom(PostalCode postalCode) {
        if ( postalCode == null ) {
            return null;
        }

        PostalCodeModel postalCodeModel = new PostalCodeModel();

        postalCodeModel.setName( postalCode.getCode() );
        postalCodeModel.setDescription( postalCode.getDescription() );

        return postalCodeModel;
    }

    @Override
    public List<PostalCodeModel> convertFrom(List<PostalCode> postalCodeModels) {
        if ( postalCodeModels == null ) {
            return null;
        }

        List<PostalCodeModel> list = new ArrayList<PostalCodeModel>( postalCodeModels.size() );
        for ( PostalCode postalCode : postalCodeModels ) {
            list.add( convertFrom( postalCode ) );
        }

        return list;
    }
}
