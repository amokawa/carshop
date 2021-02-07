package com.example.carshop.controller;

import com.example.carshop.entity.Car;
import com.example.carshop.repository.CarRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CarController {

    private final CarRepository repository;

    public CarController(CarRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "cadastroAutomoveis")
    @ResponseStatus(value = HttpStatus.CREATED)
    Car createCar(@Valid @RequestBody Car aCar) {
        return repository.save(aCar);
    }

    @GetMapping(value = "automoveis")
    @ResponseStatus(value = HttpStatus.OK)
    List<Car> getCarList() {
        return (List<Car>) repository.findAll();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String field = ((FieldError) error).getField();
            String message = error.getDefaultMessage();
            errors.put(field, message);
        });
        return errors;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public String handleException(HttpMessageNotReadableException ex) {
        return ex.getLocalizedMessage();
    }
}
