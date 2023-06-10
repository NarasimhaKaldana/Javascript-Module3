package com.process.reposirory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.process.entity.StudentDetails;

public interface Respository extends JpaRepository<StudentDetails,Integer> {

}
