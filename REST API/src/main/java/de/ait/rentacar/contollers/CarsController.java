package de.ait.rentacar.contollers;

import de.ait.rentacar.models.Car;
import de.ait.rentacar.servises.CarService;
import de.ait.rentacar.servises.impl.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CarsController {

    private final CarService carsService;

    public CarsController(CarServiceImpl service){
        this.carsService = service;
    }
    @GetMapping("/cars")
    @ResponseBody
    public List<Car> getAllCars(){
        return carsService.getAllCars();

    }
}
