package com.example.redisspringexample.repository;

import com.example.redisspringexample.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface carsRepository extends JpaRepository<Cars,Integer> {

}
