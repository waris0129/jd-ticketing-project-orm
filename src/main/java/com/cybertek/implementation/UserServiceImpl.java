package com.cybertek.implementation;

import com.cybertek.dto.UserDTO;
import com.cybertek.entity.UserEntity;
import com.cybertek.mapper.UserMapper;
import com.cybertek.repository.RoleRepository;
import com.cybertek.repository.UserRepository;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO save(String username) {



        return null;
    }

    @Override
    public UserDTO save(UserDTO dto) {

        UserEntity userEntity = userMapper.convertToUserEntity(dto);

        int countDuplicate = userRepository.isDuplicate(dto.getUsername());

        if(countDuplicate==0)
            userRepository.save(userEntity);


        return null;
    }

    @Override
    public List<UserDTO> findAllUsers() {

        // get data from db then convert from persist data to dto
        // Mapper
        List<UserEntity> userEntity = userRepository.findAll();

        return userEntity.stream().map(userMapper::convertToUserDto).collect(Collectors.toList());
    }

    @Override
    public UserDTO findByUserName(String username) {

        UserEntity entity = userRepository.findByUsername(username);

        return userMapper.convertToUserDto(entity);
    }

    @Override
    public void update(String username) {

    }

    @Override
    public void update(UserDTO userDTO) {
        String username = userDTO.getUsername();

        long id = userRepository.findByUsername(username).getId();

        UserEntity entity = userMapper.convertToUserEntity(userDTO);
        entity.setId(id);

        userRepository.save(entity);

    }

    @Override
    public void delete(String username) {

        UserEntity userEntity = userRepository.findByUsername(username);

        userEntity.setIsDeleted(true);
        long id = userEntity.getId();

        userRepository.save(userEntity);
    }

    @Override
    public List<UserDTO> findAllUsersByRole(String roleDescription) {

        List<UserEntity> entities = userRepository.findAllByRoleDescriptionIgnoreCase(roleDescription);

        return entities.stream().map(userMapper::convertToUserDto).collect(Collectors.toList());
    }
}
