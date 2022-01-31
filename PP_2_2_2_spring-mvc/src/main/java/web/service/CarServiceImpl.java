package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    @Override
    public List<Car> listCars(int countCar) {

        if (countCar == 0 || countCar >= 5) {
            return cars;
        }
        return cars.stream().limit(countCar).collect(Collectors.toList());
    }

    @Override
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public CarServiceImpl() {
        this.cars = new ArrayList<>();
        cars.add(new Car("BMW", "X5M", 450));
        cars.add(new Car("Nissan", "S15", 280));
        cars.add(new Car("Subaru", "Forester", 250));
        cars.add(new Car("Bugatti", "Chiron", 1500));
        cars.add(new Car("Nissan", "350z", 320));
    }
}
