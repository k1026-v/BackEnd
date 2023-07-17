package de.ait.rentacar.repositories.impl;

import de.ait.rentacar.models.Car;
import de.ait.rentacar.repositories.CarsRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarRepositoryListImpl implements CarsRepository {

    private List<Car> cars = new ArrayList<>();

    public CarRepositoryListImpl(){
        Car car1 = new Car(1L, "BMW", "Black");
        Car car2 = new Car(2L, "Audi", "Red");
        Car car3 = new Car(3L, "Mercedes", "Silver");
        Car car4 = new Car(4L, "Ford", "Blue");

        this.cars = Arrays.asList(car1,car2,car3,car4);
    }
    @Override
    public List<Car> findAll() {
        return cars;
    }
}
