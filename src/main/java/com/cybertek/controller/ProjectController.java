package com.cybertek.controller;

import com.cybertek.dto.ProjectDTO;
import com.cybertek.enums.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("project")
public class ProjectController {
//
//    @Autowired
//    UserService userService;
//
//    @Autowired
//    private ProjectService projectService;
//
//    @GetMapping("/create")
//    public String projectList(Model model){
//
//
//        model.addAttribute("projects",projectService.findAll());
//        model.addAttribute("managers",userService.findAllManagers());
//        model.addAttribute("project", new ProjectDTO());
//
//
//
//
//        return "project/create";
//    }
//
//
//    @PostMapping("/create")
//    public String addProject(@ModelAttribute("project") ProjectDTO projectDTO){
//
//        projectDTO.setStatus(Status.OPEN);
//
//        projectService.save(projectDTO);
//
//        return "redirect:/project/create";
//    }
//
//
//    @GetMapping("/update/{projectCode}")
//    public String updateProject(@PathVariable("projectCode") String projectCode, Model model){
//
//
//        model.addAttribute("project", projectService.findByID(projectCode));
//        model.addAttribute("projects",projectService.findAll());
//        model.addAttribute("managers",userService.findAllManagers());
//
//
//        return "project/update";
//    }
//
//
//
//    @PostMapping("/update/{projectCode}")
//    public String updateSave(@PathVariable("projectCode") String projectCode,@ModelAttribute("project") ProjectDTO projectDTO){
//
//        projectDTO.setStatus(projectService.findByID(projectCode).getStatus());
//
//
//        projectService.update(projectDTO);
//
//
//        return "redirect:/project/create";
//    }
//
//
//    @GetMapping("/delete/{projectCode}")
//    public String deleteProject(@PathVariable("projectCode") String projectCode){
//
//        projectService.deleteByID(projectCode);
//
//
//        return "redirect:/project/create";
//    }
//
//    @GetMapping("complete/{projectCode}")
//    public String projectComplete(@PathVariable("projectCode") String projectCode){
//
//        var project = projectService.findByID(projectCode);
//
//        project.setStatus(Status.COMPLETE);
//
//        projectService.update(project);
//
//        return "redirect:/project/create";
//    }
//
//
//    @GetMapping("manager/status")
//    public String projectStatus(Model model){
//        String username = "john@cybertek.com";
//        List<ProjectDTO> projects = projectService.findProjectsByManager(username);
//
//        model.addAttribute("projects",projects);
//
//
//
//        return "manager/project-status";
//    }
//




}
