package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", required = false, defaultValue = "5") int countCar, Model model) {
        model.addAttribute("list", carService.listCars(countCar));
        return "cars";
    }

}
