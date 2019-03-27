package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "cid")
	private int custId;
	private String custCode;
	private String custName;
	private double custTime;
	private double percent;
	private String custMode;
	private String custEmail;
	private String custType;
	private String custAddr;
	private String description;

}
