package com.coachify.coaches.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coachify.coaches.dto.AppointmentDTO;
import com.coachify.coaches.dto.CoachDTO;
import com.coachify.coaches.services.CoachService;



@RestController
public class RegisterController {
	
	@Autowired
	private CoachService coachService;

	@GetMapping("/get")
	public String Get() {
		return "get";
	}
	
	@PostMapping("/coach")
	public ResponseEntity<String> createCustomer(@RequestBody CoachDTO coachDTO){
//		byte[] imageBytes = FileUploadUtils.convertToByteArray(customerDTO.getImage());
//		customerDTO.setPassword(passwordEncryptAndDecrypt.hashPassword(customerDTO.getPassword()));
		return ResponseEntity.status(HttpStatus.CREATED).body(coachService.registerCoach(coachDTO));
	}
	
	@GetMapping("/getAppointment/{CustomerId}")
	public ResponseEntity<List<AppointmentDTO>> getAppointmentByCustomerId(@PathVariable("CustomerId") Integer id){
		
		return coachService.getAppointmentsById(id);
	}
}

