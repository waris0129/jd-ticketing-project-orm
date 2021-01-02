package com.cybertek.dto;

import com.cybertek.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class ProjectDTO {

    private String projectName;
    private String projectCode;
    private UserDTO assignedManager;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate projectStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate projectEndDate;

    private String projectDetail;
    private Status status;


    private int unfinishedProject;
    private int completedProject;

    public ProjectDTO(String projectName, String projectCode, UserDTO assignedManager, LocalDate projectStartDate, LocalDate projectEndDate, String projectDetail, Status status) {
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.assignedManager = assignedManager;
        this.projectStartDate = projectStartDate;
        this.projectEndDate = projectEndDate;
        this.projectDetail = projectDetail;
        this.status = status;
    }
}
