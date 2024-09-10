package com.sone.util;

import com.sone.entity.User;
import com.sone.entityDto.UserDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto toDto(User user);
    @InheritInverseConfiguration
    User toUser(UserDto dto);

    List<UserDto> listToDto(List<User> userList);
    @InheritInverseConfiguration
    List<User> listToDomain(List<UserDto> userList);
}