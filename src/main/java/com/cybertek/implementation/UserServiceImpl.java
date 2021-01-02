package com.cybertek.implementation;

import com.cybertek.dto.UserDTO;
import com.cybertek.entity.User;
import com.cybertek.mapper.UserMapper;
import com.cybertek.repository.UserRepository;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDTO> listAllUser() {

        List<User>entityList= userRepository.findAll();

        return entityList.stream().map(e->userMapper.convertToUserDto(e)).collect(Collectors.toList());
    }

    @Override
    public UserDTO findByUserName(String username) {
        return null;
    }

    @Override
    public void save(UserDTO user) {
        User obj = userMapper.convertToUserEntity(user);
        userRepository.save(obj);
    }

    @Override
    public UserDTO update(UserDTO dto) {
        return null;
    }

    @Override
    public void delete(String username) {

    }
}
