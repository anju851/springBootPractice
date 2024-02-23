package com.demo.first.controller;

import com.demo.first.entity.Department;
import com.demo.first.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Department saveDepartment(@Valid @RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);
    }

    //it is important to give the query param properly, when query param is a string
    //setting url as /departments/{name} to retrieve department by name gives java.lang.IllegalStateException: Ambiguous handler methods mapped for '/departments/CE': error
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }

}
