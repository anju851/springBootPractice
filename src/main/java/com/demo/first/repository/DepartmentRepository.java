package com.demo.first.repository;

import com.demo.first.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//this layer is responsible for making interaction of entities with the database.JPA repository
// itself contains a lot of implementation of the commonly used methods, so we will extend it
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    //since JPA dont have any method named findByName, so we need to create one
    //for creating custom methods, the naming convention is very important
    //we just need to define the method with proper naming convention, implementaion is taken care by jpa itself
    //and we will be able to get the data back from the db
    public Department findByDepartmentName(String departmentName);
    public Department findByDepartmentNameIgnoreCase(String departmentName);

    //Reference for more naming conventions for custom methods: https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#reference
}
