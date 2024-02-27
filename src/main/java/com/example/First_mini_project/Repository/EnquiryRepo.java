package com.example.First_mini_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.First_mini_project.Model.StudentEnq;

@Repository
public interface EnquiryRepo extends JpaRepository<StudentEnq, Integer> {

}
