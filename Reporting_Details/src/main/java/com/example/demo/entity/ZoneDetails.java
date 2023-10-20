package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class ZoneDetails implements Serializable {

	@Id
	private Integer zoneId;

	@NotEmpty(message = "Zone Name can not be a null or empty")
	private String zoneName;
	
	private String zoneState;
	private String zoneCountry;
	
	public ZoneDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ZoneDetails(Integer zoneId, String zoneName, String zoneState, String zoneCountry) {
		super();
		this.zoneId = zoneId;
		this.zoneName = zoneName;
		this.zoneState = zoneState;
		this.zoneCountry = zoneCountry;
	}
	
	public Integer getZoneId() {
		return zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

	public String getZoneName() {
		return zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	public String getZoneState() {
		return zoneState;
	}

	public void setZoneState(String zoneState) {
		this.zoneState = zoneState;
	}

	public String getZoneCountry() {
		return zoneCountry;
	}

	public void setZoneCountry(String zoneCountry) {
		this.zoneCountry = zoneCountry;
	}

	@Override
	public String toString() {
		return "ZoneDetails [zoneId=" + zoneId + ", zoneName=" + zoneName + ", zoneState=" + zoneState
				+ ", zoneCountry=" + zoneCountry + "]";
	}
	
}
