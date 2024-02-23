package com.demo.first.controller;

import com.demo.first.entity.Department;
import com.demo.first.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//Controllers are resource/routes to establish the interactions to DB
@RestController
public class DepartmentController {
    //Auto wiring can be done in two ways:
    // a. Constructor based
    // b. Setter based
    // below is property based autowiring
    @Autowired //wires the reference created below to the DepartmentService bean/object created in springboot container
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
    return departmentService.saveDepartment(department);
    }
}
