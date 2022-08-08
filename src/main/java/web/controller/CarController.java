package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String showCarsList(ModelMap model, @RequestParam(required = false) Integer count) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 1980, "Black"));
        cars.add(new Car("AUDI", 1990, "Yellow"));
        cars.add(new Car("FORD", 1969, "Green"));
        cars.add(new Car("OPEL", 1979, "Blue"));
        cars.add(new Car("VW", 2000, "White"));
        if (count == null || count >= 5) {
            model.addAttribute("cars", CarService.getCarsList(cars, 5));
        } else if (count > 0) {
            model.addAttribute("cars", CarService.getCarsList(cars, count));
        }
        return "cars";
    }
}
