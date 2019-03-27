package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vendor")
public class Vendor {
	@Id
	@Column(name = "venId")
	private int venId;
	@Column(name = "venName")
	private String venName;
	@Column(name = "venCode")
	private String venCode;
	@Column(name = "venType")
	private String venType;
	@Column(name = "venEmail")
	private String venEmail;
	@Column(name = "venContact")
	private String venContact;
	@Column(name = "venAddr")
	private String venAddr;

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getVenCode() {
		return venCode;
	}

	public void setVenCode(String venCode) {
		this.venCode = venCode;
	}

	public String getVenType() {
		return venType;
	}

	public void setVenType(String venType) {
		this.venType = venType;
	}

	public String getVenEmail() {
		return venEmail;
	}

	public void setVenEmail(String venEmail) {
		this.venEmail = venEmail;
	}

	public String getVenContact() {
		return venContact;
	}

	public void setVenContact(String venContact) {
		this.venContact = venContact;
	}

	public String getVenAddr() {
		return venAddr;
	}

	public void setVenAddr(String venAddr) {
		this.venAddr = venAddr;
	}

	public Vendor() {
		super();
	}

	public Vendor(int venId) {
		super();
		this.venId = venId;
	}

	@Override
	public String toString() {
		return "Vendor [venId=" + venId + ", venName=" + venName + ", venCode=" + venCode + ", venType=" + venType
				+ ", venEmail=" + venEmail + ", venContact=" + venContact + ", venAddr=" + venAddr + "]";
	}

}
