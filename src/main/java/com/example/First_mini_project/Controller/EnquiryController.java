package com.example.First_mini_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.First_mini_project.Model.StudentEnq;
import com.example.First_mini_project.Service.EnquiryService;
import com.example.First_mini_project.binding.SearchCriteria;

@Controller
public class EnquiryController {
	
		@Autowired
		EnquiryService enqservice;
		
		@GetMapping("/enquiry")
		public String enqPage(Model model) {
			model.addAttribute("enquiry" , new StudentEnq());
			return "addenquirypage";
		}

		@PostMapping("/enquiry")
		public String addEnquiry(StudentEnq se, Model model) {
			boolean status= enqservice.addEnq(se);
			if(status) {
				model.addAttribute("msg" , "enquiry added");
				return "addenquirypage";
			}else
				model.addAttribute("msg" , "invalid data");
			return "addenquirypage";
		}

		@GetMapping("/viewenquiry")
		public String viewEnquiries(Model model) {
			List<StudentEnq> enq= enqservice.getEnquiries(null, null);
			model.addAttribute("msg", enq);
			return "endviewenquiry";
		}
		
		@PostMapping("/filter_enquiry")
		public String filterEnquiries(SearchCriteria sc, Model model) {
				List<StudentEnq> enq1= enqservice.getEnquiries(null, null);
				model.addAttribute("msg", enq1);
				return "endviewenquiry";
			
		}
		
		
		
		

	


}
