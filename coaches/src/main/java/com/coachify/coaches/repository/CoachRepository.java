package com.coachify.coaches.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coachify.coaches.entity.Coach;


@Repository
public interface CoachRepository extends JpaRepository<Coach, Integer>{

}
