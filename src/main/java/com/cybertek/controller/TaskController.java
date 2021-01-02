package com.cybertek.controller;

import com.cybertek.dto.TaskDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.enums.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Controller
@RequestMapping("task")
public class TaskController {
//
//    @Autowired
//    ProjectService projectService;
//    @Autowired
//    UserService userService;
//    @Autowired
//    TaskService taskService;
//
//    @GetMapping("/create")
//    public String create(Model model){
//
//
//        model.addAttribute("task", new TaskDTO());
//        model.addAttribute("projects",projectService.findAll());
//        model.addAttribute("employees", userService.findAllEmployees());
//        model.addAttribute("taskList",taskService.findAll());
//
//        return "task/create";
//    }
//
//
//    @PostMapping("/create")
//    public String addTask(TaskDTO task){
//
//
//        task.setAssignDate(LocalDate.now());
//        task.setStatus(Status.OPEN);
//        task.setId(UUID.randomUUID().getMostSignificantBits());
//        taskService.save(task);
//
//        return "redirect:/task/create";
//    }
//
//
//    @GetMapping("/delete/{id}")
//    public String deleteTask(@PathVariable("id")String id){
//        taskService.deleteByID(Long.parseLong(id));
//        return "redirect:/task/create";
//    }
//
//    @GetMapping("/update/{id}")
//    public String updateTask(@PathVariable("id") String id,Model model){
//
//        model.addAttribute("task", taskService.findByID(Long.parseLong(id)));
//        model.addAttribute("projects",projectService.findAll());
//        model.addAttribute("employees", userService.findAllEmployees());
//        model.addAttribute("taskList",taskService.findAll());
//
//        return "task/update";
//    }
//
//
//    @PostMapping("/update/{id}")
//    public String saveUpdate(@PathVariable("id") String id, TaskDTO task){
//
//        var pre = taskService.findByID(Long.parseLong(id));
//
//        task.setStatus(pre.getStatus());
//        task.setAssignDate(pre.getAssignDate());
//        taskService.update(task);
//
//        return "redirect:/task/create";
//    }
//
//
//    @GetMapping("employee/pending-tasks")
//    public String pendingTasks(Model model){
//
//        model.addAttribute("test",new TaskDTO());
//
//        UserDTO billy =userService.findByID("maria99@cybertek.com");
//
//        List<TaskDTO> tasks = taskService.findAll().stream()
//                .filter(task->task.getEmployee()==billy)
//                .filter(status->status.getStatus() != Status.COMPLETE)
//                .collect(Collectors.toList());
//
//        model.addAttribute("tasks",tasks);
//
//
//
//        return "task/pending-tasks";
//    }
//
//
//    @GetMapping("employee/pending-tasks/{id}")
//    public String updatePendingTaskStatus(@PathVariable("id")Long id, Model model){
//
//        TaskDTO taskDTO = taskService.findByID(id);
//
//        model.addAttribute("test",taskDTO);
//
//        UserDTO billy =userService.findByID("maria99@cybertek.com");
//
//        List<TaskDTO> tasks = taskService.findAll().stream()
//                .filter(task->task.getEmployee()==billy)
//                .filter(status->status.getStatus() != Status.COMPLETE)
//                .collect(Collectors.toList());
//
//        model.addAttribute("tasks",tasks);
//
//        return "/task/update-pending-tasks";
//
//    }
//
//
//
//    @PostMapping("employee/pending-tasks/{id}")
//    public String savePendingTaskStatus(@PathVariable("id") Long id,  TaskDTO taskDTO){
//
//        var test = taskService.findByID(id);
//
//        test.setStatus(taskDTO.getStatus());
//
//        return "redirect:/task/employee/pending-tasks";
//    }
//
//
//
//    @GetMapping("/employee/archive")
//    public String archive(Model model){
//
//        UserDTO billy =userService.findByID("maria99@cybertek.com");
//
//        List<TaskDTO> tasks = taskService.findAll().stream()
//                .filter(task->task.getEmployee()==billy)
//                .filter(status->status.getStatus() == Status.COMPLETE)
//                .collect(Collectors.toList());
//
//        model.addAttribute("tasks",tasks);
//
//
//
//        return "task/archive";
//    }








}





















