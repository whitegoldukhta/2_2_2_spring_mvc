package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", required = false, defaultValue = "5") int countCar, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "X5M", 450));
        list.add(new Car("Nissan", "S15", 280));
        list.add(new Car("Subaru", "Forester", 250));
        list.add(new Car("Bugatti", "Chiron", 1500));
        list.add(new Car("Nissan", "350z", 320));
        List<Car> carList = CarServiceImpl.listCars(list, countCar);
        model.addAttribute("list", carList);
        return "cars";
    }

}
