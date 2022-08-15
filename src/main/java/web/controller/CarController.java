package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService = new CarService();
    @GetMapping(value = "/cars")
    public String showCarsList(ModelMap model, @RequestParam(required = false) Integer count) {

        if (count == null || count >= 5) {
            model.addAttribute("cars", carService.getCarsList(5));
        } else if (count > 0) {
            model.addAttribute("cars", carService.getCarsList(count));
        }
        return "cars";
    }
}
