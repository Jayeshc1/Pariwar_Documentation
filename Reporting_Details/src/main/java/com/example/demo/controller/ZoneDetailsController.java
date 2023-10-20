package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ZoneDetails;
import com.example.demo.exception.ResponseDto;
import com.example.demo.service.ZoneDetailsService;
import com.example.demo.util.ProjectConstants;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class ZoneDetailsController {

	@Autowired
	ZoneDetailsService zoneDetailsService;

	@PostMapping("/save")
	public ResponseEntity<ZoneDetails> saveZoneDetails(@Valid @RequestBody ZoneDetails zoneDetails) {

		return ResponseEntity.status(HttpStatus.CREATED).body(zoneDetailsService.saveZoneDetails(zoneDetails));
	}

	@GetMapping("/getById/{id}")
	public ResponseEntity<ZoneDetails> getZoneDetailsById(@PathVariable int id) {
		return ResponseEntity.status(HttpStatus.OK).body(zoneDetailsService.getZoneDetailsById(id));

	}

	@GetMapping("/getAll")
	public ResponseEntity<List<ZoneDetails>> getAllZoneDetailsInfo() {
		return ResponseEntity.status(HttpStatus.OK).body(zoneDetailsService.getAllZoneDetailsInfo());
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDto> deleteByZoneId(@PathVariable int id) {
		zoneDetailsService.deleteByZoneId(id);
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseDto(ProjectConstants.Status_200 , ProjectConstants.Del_message));
	}

	@DeleteMapping("/deleteAll")
	public void deleteAllZoneDetails() {
		zoneDetailsService.deleteAllZoneDetails();

	}

	@PutMapping("/updateById/{id}")
	public ResponseEntity<ZoneDetails> updateZOneDetailsById(@RequestBody ZoneDetails zoneDetails, @PathVariable int id) {

		return ResponseEntity.status(HttpStatus.OK)
				.body(zoneDetailsService.updateZOneDetailsById(zoneDetails, id));

	}
}
