package com.coachify.customer.service.external;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coachify.customer.dto.AppointmentDTO;

@FeignClient(name="APPOINTMENT")
public interface AppointmentService {

	@GetMapping("/Coachify/appointment/getAppointmentByCustomerId/{customerId}")
	public ResponseEntity<List<AppointmentDTO>> getAppointments(@PathVariable int customerId);
}
