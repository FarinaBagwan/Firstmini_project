package com.example.First_mini_project.Service;

import java.util.List;

import com.example.First_mini_project.Model.StudentEnq;
import com.example.First_mini_project.binding.SearchCriteria;

public interface EnquiryService {
	
	public boolean addEnq(StudentEnq se);
	public List<StudentEnq> getEnquiries(Integer cid, SearchCriteria s);
	}



