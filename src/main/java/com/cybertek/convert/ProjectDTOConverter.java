package com.cybertek.convert;

import com.cybertek.dto.ProjectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class ProjectDTOConverter implements Converter<String, ProjectDTO> {
//
//    @Autowired
//    ProjectService projectService;
//
//    @Override
//    public ProjectDTO convert(String projectCode) {
//        return projectService.findByID(projectCode);
//    }


    @Override
    public ProjectDTO convert(String s) {
        return null;
    }
}