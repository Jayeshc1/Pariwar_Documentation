package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ZoneDetails;
import com.example.demo.exception.ResourceNotFoundException;
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

	@Override
	public ZoneDetails getZoneDetailsById(int id) {
		Optional<ZoneDetails> checkDetails = zoneDetailsRepository.findById(id);
		if(checkDetails.isPresent()) {
			 return zoneDetailsRepository.findById(id).get();
		 }else {
			 throw new ResourceNotFoundException();
		 }
	}

	@Override
	public List<ZoneDetails> getAllZoneDetailsInfo() {
		return zoneDetailsRepository.findAll();
	}

	@Override
	public void deleteByZoneId(int id) {
		 Optional<ZoneDetails> checkDetails = zoneDetailsRepository.findById(id);
		 if(checkDetails.isPresent()) {
			 zoneDetailsRepository.deleteById(id);
		 }else {
			 throw new ResourceNotFoundException();
		 }	
	}

	@Override
	public void deleteAllZoneDetails() {
		zoneDetailsRepository.deleteAll();
	}

	@Override
	public ZoneDetails updateZOneDetailsById(ZoneDetails zoneDetails, int id) {

		Optional<ZoneDetails> existingRecord = zoneDetailsRepository.findById(id);
		if (existingRecord.isPresent()) {
			if (zoneDetails.getZoneName() != null) {
				existingRecord.get().setZoneName(zoneDetails.getZoneName());
			}
			if (zoneDetails.getZoneState() != null) {
				existingRecord.get().setZoneState(zoneDetails.getZoneState());
			}
			if (zoneDetails.getZoneCountry() != null) {
				existingRecord.get().setZoneCountry(zoneDetails.getZoneCountry());
			}
			return zoneDetailsRepository.save(existingRecord.get());
		} else {
			throw new ResourceNotFoundException();
		}
	}
}
