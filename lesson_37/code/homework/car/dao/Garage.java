package homework.car.dao;

import homework.car.model.Car;
import homework.company_v3.model.Employee;

public interface Garage {
    boolean addCar(Car car);

    boolean removeCar(String regNumber);

    Car findCarByRegNumber(String regNumber);

    Iterable<Car> findCarsByModel(String model);

    Iterable<Car> findCarsByCompany(String company);

    Iterable<Car> findCarsByEngine(double min, double max);

    Iterable<Car> findCarsByColor(String color);
}
