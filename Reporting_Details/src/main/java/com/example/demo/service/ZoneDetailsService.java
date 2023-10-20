package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ZoneDetails;

public interface ZoneDetailsService {

	//save
	ZoneDetails saveZoneDetails(ZoneDetails zoneDetails);
	
	//getbyId
	ZoneDetails getZoneDetailsById(int id);
	
	//get All
	List<ZoneDetails> getAllZoneDetailsInfo();
	
	//deleteByZoneId
	void deleteByZoneId(int id);
	
	//deleteAll
	void deleteAllZoneDetails();
	
	//updateById
	ZoneDetails updateZOneDetailsById(ZoneDetails zoneDetails, int id);
}
