package com.example.First_mini_project.binding;

public class DashboardResponse {

	 Integer totalEnq;
	 Integer enrolledeqn;
	 Integer lostEnq;
	public DashboardResponse(Integer totalEnq, Integer enrolledeqn, Integer lostEnq) {
		super();
		this.totalEnq = totalEnq;
		this.enrolledeqn = enrolledeqn;
		this.lostEnq = lostEnq;
	}
	public Integer getTotalEnq() {
		return totalEnq;
	}
	public void setTotalEnq(Integer totalEnq) {
		this.totalEnq = totalEnq;
	}
	public Integer getEnrolledeqn() {
		return enrolledeqn;
	}
	public void setEnrolledeqn(Integer enrolledeqn) {
		this.enrolledeqn = enrolledeqn;
	}
	public Integer getLostEnq() {
		return lostEnq;
	}
	public void setLostEnq(Integer lostEnq) {
		this.lostEnq = lostEnq;
	}
	


}
