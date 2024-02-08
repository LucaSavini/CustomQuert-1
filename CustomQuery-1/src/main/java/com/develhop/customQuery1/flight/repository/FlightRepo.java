package com.develhop.customQuery1.flight.repository;


import com.develhop.customQuery1.flight.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@EnableJpaRepositories
@Repository
public interface FlightRepo extends JpaRepository<Flight, Long> {
}