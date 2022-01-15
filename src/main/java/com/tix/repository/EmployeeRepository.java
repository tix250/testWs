package com.tix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tix.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
