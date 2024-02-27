package com.example.First_mini_project.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.First_mini_project.Model.StudentEnq;
import com.example.First_mini_project.binding.SearchCriteria;

@Service
public class EnquiryServiceimp implements EnquiryService {

	@Override
	public boolean addEnq(StudentEnq se) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<StudentEnq> getEnquiries(Integer cid, SearchCriteria s) {
		// TODO Auto-generated method stub
		return null;
	}

}
