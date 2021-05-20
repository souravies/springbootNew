package com.example.saurav.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.saurav.it.entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
