package com.coachify.appointment.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.coachify.appointment.entity.Appointment;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{

	@Query("SELECT a FROM Appointment a WHERE a.customerId = :customerId")
    List<Appointment> findByCustomerId(Integer customerId);
	
	@Query("SELECT a FROM Appointment a WHERE a.coachId = :coachId")
    List<Appointment> findByCoachId(Integer coachId);
	
	@Transactional
    @Modifying
	@Query("UPDATE Appointment a SET a.appointmentDate = :newDateTime WHERE a.customerId = :id AND a.appointmentDate= :oldDateTime")
	public Integer rescheduleAppointment(int id,LocalDateTime oldDateTime,LocalDateTime newDateTime);
	
}
