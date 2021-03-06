package com.niit.shoppingcart.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//whenever it scans all the classes under a particular package, creates instance of this class

@Component 										//to create instance, same as class name but first letter small
@Entity 										//to specify it is not normal class- it is database entry
@Table(name="user") 							//to specify to which database table we need to map this class
public class User {

	@Id 										//to specify that it is a primary key
	private String emailID;
	private String name;
	@Column(name="password") 					//to specify to map to a certain column in database table
	private String pwd;
	private String mobile;
	private Character role;
	private Date registeredDate;
	
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Character getRole() {
		return role;
	}
	public void setRole(Character role) {
		this.role = role;
	}
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(Date date) {
		this.registeredDate = date;
	}
	
}
