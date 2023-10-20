package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.demo.entity.ZoneDetails;
import com.example.demo.service.ZoneDetailsService;

@RestController
@RequestMapping("/api")
public class ZoneDetailsController {

	@Autowired
	ZoneDetailsService zoneDetailsService;
	
	@PostMapping("/save")
	public ResponseEntity<ZoneDetails> saveZoneDetails(@RequestBody ZoneDetails zoneDetails){
		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(zoneDetailsService.saveZoneDetails(zoneDetails));
				
	}
	
}
