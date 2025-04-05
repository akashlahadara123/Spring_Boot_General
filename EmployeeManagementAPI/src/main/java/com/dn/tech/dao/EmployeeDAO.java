package com.dn.tech.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dn.tech.model.Employee;
@Repository
public interface EmployeeDAO extends JpaRepository<Employee,Integer> {

}
