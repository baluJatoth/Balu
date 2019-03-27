package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Location")
public class Location implements Comparable<Location> {
	@Id
	@Column(name = "locId")
	private int locId;
	@Column(name = "locCode")
	private String locCode;
	@Column(name = "locName")
	private String locName;
	@Column(name = "locType")
	private String locType;

	public int getLocId() {
		return locId;
	}

	public void setLocId(int locId) {
		this.locId = locId;
	}

	public String getLocCode() {
		return locCode;
	}

	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}

	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public String getLocType() {
		return locType;
	}

	public void setLocType(String locType) {
		this.locType = locType;
	}

	@Override
	public String toString() {
		return "Location [locId=" + locId + ", locCode=" + locCode + ", locName=" + locName + ", locType=" + locType
				+ "]";
	}

	public Location() {
		super();
	}

	public Location(int locId) {
		super();
		this.locId = locId;
	}

	@Override
	public int compareTo(Location l) {

		return this.getLocId() - l.getLocId();
	}

}
