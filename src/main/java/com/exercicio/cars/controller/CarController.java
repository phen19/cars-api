package com.exercicio.cars.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio.cars.dto.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @PostMapping
    public void create(@RequestBody CarDTO req){
        System.out.println(req.modelo());
        System.out.println(req.anoModelo());
        System.out.println(req.dataFabricacao());
    }
}
