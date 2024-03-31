package com.coachify.customer.repository;
import com.coachify.customer.entity.Customer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	Optional<Customer> findByEmail(String email);
}
