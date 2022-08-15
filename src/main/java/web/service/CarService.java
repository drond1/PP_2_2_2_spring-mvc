package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
        private final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 1980, "Black"));
        cars.add(new Car("AUDI", 1990, "Yellow"));
        cars.add(new Car("FORD", 1969, "Green"));
        cars.add(new Car("OPEL", 1979, "Blue"));
        cars.add(new Car("VW", 2000, "White"));
    }

    public List<Car> getCarsList(int number) {
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}
