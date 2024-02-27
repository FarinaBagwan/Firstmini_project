package com.example.First_mini_project.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.First_mini_project.Model.Counseller;

public interface CounsellerRepo extends JpaRepository <Counseller, Integer>{

}
