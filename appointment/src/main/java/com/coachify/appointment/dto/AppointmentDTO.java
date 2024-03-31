package com.coachify.appointment.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;



public class AppointmentDTO {

	
	private Long id;

	
	private Integer customerId;

	
	private Integer coachId;

	
	private LocalDateTime createdAt;
	
	
    private LocalDateTime appointmentDate;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public Integer getCoachId() {
		return coachId;
	}


	public void setCoachId(Integer coachId) {
		this.coachId = coachId;
	}


	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}


	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}


	


	


	
}
