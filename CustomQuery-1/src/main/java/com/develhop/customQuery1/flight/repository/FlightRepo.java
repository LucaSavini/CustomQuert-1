package com.develhop.customQuery1.flight.repository;


import com.develhop.customQuery1.flight.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;


@EnableJpaRepositories
@Repository
public interface FlightRepo extends JpaRepository<Flight, Long> {
    @Query(value = "SELECT * FROM Flight", nativeQuery = true)
    List<Flight> findFlights();

    @Modifying
    @Query(value = "INSERT INTO Flight (description, from_airport, to_airport, status) " +
            "VALUES (:description, :fromAirport, :toAirport, :status)", nativeQuery = true)
    void saveAllCustom(List<Flight> flights);

}