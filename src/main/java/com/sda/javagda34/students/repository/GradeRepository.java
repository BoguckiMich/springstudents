package com.sda.javagda34.students.repository;

import com.sda.javagda34.students.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Long> {
}
