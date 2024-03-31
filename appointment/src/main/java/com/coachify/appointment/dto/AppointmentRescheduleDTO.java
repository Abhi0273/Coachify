package com.coachify.appointment.dto;

import java.time.LocalDateTime;



public class AppointmentRescheduleDTO {

	private LocalDateTime newDateAndTime;
	
	private LocalDateTime oldDateAndTime;

	public LocalDateTime getNewDateAndTime() {
		return newDateAndTime;
	}

	public void setNewDateAndTime(LocalDateTime newDateAndTime) {
		this.newDateAndTime = newDateAndTime;
	}

	public LocalDateTime getOldDateAndTime() {
		return oldDateAndTime;
	}

	public void setOldDateAndTime(LocalDateTime oldDateAndTime) {
		this.oldDateAndTime = oldDateAndTime;
	}
}

