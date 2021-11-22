package com.sms.packages.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.packages.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
