package com.exercicio.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.cars.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}
