package com.cybertek.controller;

import com.cybertek.dto.UserDTO;
import com.cybertek.service.RoleService;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    RoleService roleService;
    @Autowired
    UserService userService;

    @GetMapping("/create")
    public String createUser(Model model){

        model.addAttribute("user", new UserDTO());
        model.addAttribute("roles",roleService.listAllRoles());
        model.addAttribute("users", userService.listAllUser());

        return "/user/create";
    }


    @PostMapping("/create")
    public String saveUser(@ModelAttribute("user") UserDTO userDTO, Model model){
        userService.save(userDTO);
        return "redirect:/user/create";
    }


    @GetMapping("/update/{username}")
    public String editUser(@PathVariable("username") String username,Model model){

        model.addAttribute("user",userService.findByUserName(username));
        model.addAttribute("roles",roleService.listAllRoles());
        model.addAttribute("users", userService.listAllUser());

        return "/user/update";
    }


    @PostMapping("/update/{username}")
    public String update(@PathVariable("username") String username, @ModelAttribute("user") UserDTO userDTO){

        userService.update(userDTO);

        return "redirect:/user/create";
    }


    @GetMapping("/delete/{username}")
    public String deleteUser(@PathVariable("username") String username){

        userService.delete(username);

        return "redirect:/user/create";
    }


}




























