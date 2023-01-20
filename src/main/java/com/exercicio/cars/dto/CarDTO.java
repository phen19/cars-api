package com.exercicio.cars.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

public record CarDTO(
    
@NotBlank String modelo, 
@NotBlank String fabricante, 
@Past Date dataFabricacao, 
double valor,
int anoModelo) {
    

}
