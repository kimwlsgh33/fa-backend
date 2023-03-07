package com.fabackend.fabackend.repository;

import com.fabackend.fabackend.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
}
