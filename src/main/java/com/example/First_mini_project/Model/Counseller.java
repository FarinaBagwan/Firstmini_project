package com.example.First_mini_project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Counseller {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		Integer  cid;
		String name;
		String email;
		String pwd;
		String phon;
		public Integer getCid() {
			return cid;
		}
		public void setCid(Integer cid) {
			this.cid = cid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getPhon() {
			return phon;
		}
		public void setPhon(String phon) {
			this.phon = phon;
		}
		public Counseller(Integer cid, String name, String email, String pwd, String phon) {
			super();
			this.cid = cid;
			this.name = name;
			this.email = email;
			this.pwd = pwd;
			this.phon = phon;
		}
		public Counseller() {
			super();
			// TODO Auto-generated constructor stub
		}
		

	}


