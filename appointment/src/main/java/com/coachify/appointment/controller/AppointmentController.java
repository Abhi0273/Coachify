package com.coachify.appointment.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coachify.appointment.dto.AppointmentDTO;
import com.coachify.appointment.dto.AppointmentRescheduleDTO;
import com.coachify.appointment.service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("/bookAppointment")
	public ResponseEntity<String> bookAppointment(@RequestBody AppointmentDTO appointmentDTO){
		return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.bookAppointment(appointmentDTO));
	}
	
	@GetMapping("/getAppointmentByCustomerId/{CustomerId}")
	public ResponseEntity<List<AppointmentDTO>> getAppointmentByCustomerId(@PathVariable("CustomerId") Integer id){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.getAppointmentsByCustomerId(id));
	}
	
	@GetMapping("/getAppointmentByCoachId/{CoachId}")
	public ResponseEntity<List<AppointmentDTO>> getAppointmentByCoachId(@PathVariable("CoachId") Integer id){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.getAppointmentsBycoachId(id));
	}
	
	@PostMapping("/{CoachId}/updateAppointment")
	public ResponseEntity<Integer> updateAppointment(@PathVariable("CoachId") Integer id,@RequestBody AppointmentRescheduleDTO appointmentRescheduleDTO){
		return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.updateAppointment(id,appointmentRescheduleDTO));
	}
}
