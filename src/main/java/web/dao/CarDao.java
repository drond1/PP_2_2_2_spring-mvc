package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    public final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 1980, "Black"));
        cars.add(new Car("AUDI", 1990, "Yellow"));
        cars.add(new Car("FORD", 1969, "Green"));
        cars.add(new Car("OPEL", 1979, "Blue"));
        cars.add(new Car("VW", 2000, "White"));
    }
}
