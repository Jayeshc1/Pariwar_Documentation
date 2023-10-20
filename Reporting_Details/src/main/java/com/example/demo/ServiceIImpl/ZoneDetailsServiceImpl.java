package com.example.demo.ServiceIImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ZoneDetails;
import com.example.demo.repository.ZoneDetailsRepository;
import com.example.demo.service.ZoneDetailsService;

@Service
public class ZoneDetailsServiceImpl implements ZoneDetailsService {
	
	@Autowired
	ZoneDetailsRepository zoneDetailsRepository;

	
	@Override
	public ZoneDetails saveZoneDetails(ZoneDetails zoneDetails) {
		return zoneDetailsRepository.save(zoneDetails);
	}

}
