package com.example.First_mini_project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class StudentEnq {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		Integer enqId;
		String name;
		String mob;
		String courseMode;
		String courseName;
		public StudentEnq(Integer enqId, String name, String mob, String courseMode, String courseName, String enqStatus,
				LocalDate createdDate, Integer cid) {
			super();
			this.enqId = enqId;
			this.name = name;
			this.mob = mob;
			this.courseMode = courseMode;
			this.courseName = courseName;
			this.enqStatus = enqStatus;
			this.createdDate = createdDate;
			this.cid = cid;
		}
		public StudentEnq() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Integer getEnqId() {
			return enqId;
		}
		public void setEnqId(Integer enqId) {
			this.enqId = enqId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMob() {
			return mob;
		}
		public void setMob(String mob) {
			this.mob = mob;
		}
		public String getCourseMode() {
			return courseMode;
		}
		public void setCourseMode(String courseMode) {
			this.courseMode = courseMode;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public String getEnqStatus() {
			return enqStatus;
		}
		public void setEnqStatus(String enqStatus) {
			this.enqStatus = enqStatus;
		}
		public LocalDate getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(LocalDate createdDate) {
			this.createdDate = createdDate;
		}
		public Integer getCid() {
			return cid;
		}
		public void setCid(Integer cid) {
			this.cid = cid;
		}
		String enqStatus;
		LocalDate createdDate;
		Integer cid;
		

	}


