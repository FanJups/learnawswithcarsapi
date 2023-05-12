package com.example.learnawswithcarsapi.repository;

import com.example.learnawswithcarsapi.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarRepository extends JpaRepository<Car, UUID> {
}
