package com.boot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)

public class Coodinate {
	
	@Id
	private int id;  //3
	
	
	//@CreatedBy
	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name="id")
	//private User id;	
	
	
	private int logitude;
	private int latitute;
	
	
//	
//	public User getId() {
//		return id;
//	}
//
//	public void setId(User id) {
//		this.id = id;
//	}
//
//	
	
//	private Location id;	
	
	  


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLogitude() {
		return logitude;
	}

	public void setLogitude(int logitude) {
		this.logitude = logitude;
	}

	public int getLatitute() {
		return latitute;
	}

	public void setLatitute(int latitute) {
		this.latitute = latitute;
	}
	
	
	
}
	
	
