package com.cybertek.service;

import com.cybertek.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserService {

    List<UserDTO> listAllUser();
    UserDTO findByUserName(String username);
    void save(UserDTO user);
    UserDTO update(UserDTO dto);
    void delete(String username);

}
