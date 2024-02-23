package com.demo.first.repository;

import com.demo.first.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//this layer is responsible for making interaction of entities with the database.JPA repository
// itself contains a lot of implementation of the commonly used methods, so we will extend it
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
