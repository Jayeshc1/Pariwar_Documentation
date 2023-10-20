package com.example.demo.ServiceIImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.ZoneDetails;
import com.example.demo.repository.ZoneDetailsRepository;
import com.example.demo.service.ZoneDetailsService;

public class ZoneDetailsServiceImpl implements ZoneDetailsService {
	
	@Autowired
	ZoneDetailsRepository zoneDetailsRepository;

	@Override
	public ZoneDetails save(ZoneDetails zoneDetails) {
		
		return zoneDetailsRepository.save(zoneDetails);
		
	}

}
