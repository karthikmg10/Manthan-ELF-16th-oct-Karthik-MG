package com.manthan.resumefinder.bean;

import java.awt.List;

public class SearchDataBean {

	String Email;
	String Mobile;
	String Experience;
	String Filename;
	java.util.List<String> skill;

	public java.util.List<String> getSkill() {
		return skill;
	}
	public void setSkill(java.util.List<String> skilllist) {
		this.skill = skilllist;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
	public String getFilename() {
		return Filename;
	}
	public void setFilename(String filename) {
		Filename = filename;
	}

}
