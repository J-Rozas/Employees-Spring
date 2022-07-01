package com.example.codeclan.employees.repositories;

import com.example.codeclan.employees.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository<Project, Long> {

}
