package com.ust.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.crud.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
