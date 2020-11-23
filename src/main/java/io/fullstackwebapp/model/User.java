package io.fullstackwebapp.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="User_table")
@EntityListeners(AuditingEntityListener.class)

public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private long userId;
	private String userName;
	private String mobile;
	private String city;
    @CreatedDate
    private LocalDateTime createdDate;
    private String picpath;
    
	public String getPicpath() {
		return picpath;
	}
	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	public User(long userId, String userName, String mobile, String city, LocalDateTime createdDate, String picpath) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.mobile = mobile;
		this.city = city;
		this.createdDate = createdDate;
		this.picpath = picpath;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public User() {
		
	}
}
