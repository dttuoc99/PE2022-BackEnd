package com.javatechie.jpa.repository;

import com.javatechie.jpa.entity.DrugStore;
import com.javatechie.jpa.entity.DrugSupplier;
import com.javatechie.jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByid(Long id);
}
