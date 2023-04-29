package com.example.redisspringexample.controller;

import com.example.redisspringexample.model.Cars;
import com.example.redisspringexample.repository.carsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class carsController {
    private final com.example.redisspringexample.repository.carsRepository carsRepository;

    public carsController(carsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }
    @GetMapping("/list")
    public List<Cars> GetCars (){
        return carsRepository.findAll();
    }
    @PostMapping("/save")
    public ResponseEntity saveCars(@RequestBody Cars cars){
        return ResponseEntity.ok(carsRepository.save(cars));
    }
}
