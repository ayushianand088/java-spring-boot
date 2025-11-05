package com.practicecoding.learncoding.repository;

import com.practicecoding.learncoding.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
