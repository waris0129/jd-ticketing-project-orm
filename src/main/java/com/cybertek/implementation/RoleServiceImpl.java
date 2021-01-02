package com.cybertek.implementation;

import com.cybertek.dto.RoleDTO;
import com.cybertek.entity.Role;
import com.cybertek.mapper.RoleMapper;
import com.cybertek.repository.RoleRepository;
import com.cybertek.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<RoleDTO> listAllRoles() {

        List<Role> entityList = roleRepository.findAll();

        // convert role entity to role dto, and return it
        // we will use mapper to complete conversion
        //MODEL Mapper

        return entityList.stream().map(entity->roleMapper.convertToDto(entity)).collect(Collectors.toList());
    }

    @Override
    public RoleDTO findById(long id) {

        Role role = roleRepository.findById(id).get();

        return roleMapper.convertToDto(role);
    }



}
