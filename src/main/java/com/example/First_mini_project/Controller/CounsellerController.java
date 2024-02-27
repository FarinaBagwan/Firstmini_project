package com.example.First_mini_project.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.First_mini_project.Model.Counseller;
import com.example.First_mini_project.Service.CounsellerService;



@Controller
public class CounsellerController {

	
		
		@Autowired
		private CounsellerService consellerSvc;
		
		@GetMapping("/") //// display Login page
		public String index(Model model) {
		model.addAttribute("counseller", new Counseller());
			return "login";
		}
		
		@PostMapping("/")
		public String handleLogin(Counseller c, Model model) {
			Counseller obj = consellerSvc.loginCheck(c.getEmail(), c.getPwd());
			
			if(obj==null) {
				model.addAttribute(	"err_msg", "invalid_Credential");
				return "login";
			}
			
			return "dashboard";
			
		}
		
		@GetMapping("/dashboard")
		public String buildDashboard(Model model)
		{
			return "dashboard";
		}
		
		

		@GetMapping("/register")
		public String regPage(Model model)
		{
			model.addAttribute("counseller" , new Counseller());
			
			return "register";// display signup page
		}
		
		  @PostMapping("/register")
			public String handleRegistration(Counseller c, Model model)
			{
				String msg = consellerSvc.saveCounseller(c);
				model.addAttribute("msg" , msg);
				return "register";
			}

		@GetMapping("/forgot_pwd")
		public String recoverPwdPage(Model model) // display fpwd page
		{
			return "forgotpwd_view";
		}
		
		
		@GetMapping("/recoverpwd")
		public String handleForgotPwd(@RequestParam String email, Model model)
		{
			boolean status= consellerSvc.recoverPwd(email);
			if(status) {
				model.addAttribute("smsg",  "Please check your mail");
				}
			else {
				model.addAttribute("invalid" , "invalid mail");
				
			}
			
			return "forgotpwd_view";
		}

	   

		

		
		


	


}
