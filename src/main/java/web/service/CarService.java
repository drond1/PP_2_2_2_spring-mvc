package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> getCarsList (List<Car> carList, int number) {

        return carList.stream().limit(number).collect(Collectors.toList());
    }
}
