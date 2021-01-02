package com.cybertek.mapper;

import com.cybertek.dto.UserDTO;
import com.cybertek.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO convertToUserDto(User entity){
        return modelMapper.map(entity,UserDTO.class);
    }

    public User convertToUserEntity(UserDTO dto){
        return modelMapper.map(dto,User.class);
    }

}
