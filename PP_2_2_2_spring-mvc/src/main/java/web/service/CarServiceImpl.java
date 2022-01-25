package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl {

    public static List<Car> listCars(List<Car> list, int countCar) {
        if (countCar == 0 || countCar >= 5) {
            return list;
        }
        return list.stream().limit(countCar).collect(Collectors.toList());
    }
}
