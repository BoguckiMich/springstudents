package com.sda.javagda34.students.repository;

import com.sda.javagda34.students.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
