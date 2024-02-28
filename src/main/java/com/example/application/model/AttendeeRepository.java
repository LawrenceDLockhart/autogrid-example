package com.example.application.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AttendeeRepository extends JpaRepository<Attendee, Long>, JpaSpecificationExecutor<Attendee> {

}
