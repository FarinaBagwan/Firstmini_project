package com.example.First_mini_project.Service;

import org.springframework.stereotype.Service;

import com.example.First_mini_project.Model.Counseller;
import com.example.First_mini_project.binding.DashboardResponse;


@Service
public class CounsellerServiceimp implements CounsellerService {

	@Override
	public String saveCounseller(Counseller c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Counseller loginCheck(String email, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean recoverPwd(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DashboardResponse getDashboardInfo(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
