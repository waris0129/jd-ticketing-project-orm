package com.cybertek.service;

import com.cybertek.dto.UserDTO;

import java.util.List;

public interface UserService {

        List<UserDTO> findAllUsers();
        UserDTO findByUserName(String username);
        void update(String username);
        void update(UserDTO userDTO);
        void delete(String username);
        UserDTO save(String username);
        UserDTO save(UserDTO dto);

        List<UserDTO> findAllUsersByRole(String roleDescription);

}
