package com.softserveinc.geocitizen.dto.mapper;

import com.softserveinc.geocitizen.dto.RegisteredUserDTO;
import com.softserveinc.geocitizen.entity.User;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-10T03:37:16+0000",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 17.0.14 (Ubuntu)"
)
@Component
public class RegisteredUserMapperImpl implements RegisteredUserMapper {

    @Override
    public RegisteredUserDTO userToRegisteredUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        RegisteredUserDTO registeredUserDTO = new RegisteredUserDTO();

        registeredUserDTO.setLogin( user.getLogin() );
        if ( user.getId() != null ) {
            registeredUserDTO.setId( user.getId() );
        }

        return registeredUserDTO;
    }
}
