package de.ait.rentacar.servises.impl;

import de.ait.rentacar.models.Car;
import de.ait.rentacar.repositories.CarsRepository;
import de.ait.rentacar.servises.CarService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    private final CarsRepository carsRepository;

    public CarServiceImpl(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    @Override
    public List<Car> getAllCars(){
        return carsRepository.findAll();
    }


}
