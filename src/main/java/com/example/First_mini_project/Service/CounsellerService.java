package com.example.First_mini_project.Service;

import com.example.First_mini_project.Model.Counseller;
import com.example.First_mini_project.binding.DashboardResponse;

public interface CounsellerService {
	

		public String saveCounseller(Counseller c);
		public Counseller loginCheck(String email, String pwd);
		public boolean recoverPwd(String email);
		public DashboardResponse getDashboardInfo(Integer cid);
	}


