package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "Gaon_Details")
public class GaonDetails implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer gaonId;

	@NotEmpty(message = "Gaon Name can not be a null or empty")
	private String gaonName;
	

	public GaonDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GaonDetails(Integer gaonId, @NotEmpty(message = "Zone Name can not be a null or empty") String gaonName) {
		super();
		this.gaonId = gaonId;
		this.gaonName = gaonName;
	}

	public Integer getGaonId() {
		return gaonId;
	}

	public void setGaonId(Integer gaonId) {
		this.gaonId = gaonId;
	}

	public String getGaonName() {
		return gaonName;
	}

	public void setGaonName(String gaonName) {
		this.gaonName = gaonName;
	}

	@Override
	public String toString() {
		return "GaonDetails [gaonId=" + gaonId + ", gaonName=" + gaonName + "]";
	}
	

}
