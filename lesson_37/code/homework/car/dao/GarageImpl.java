package homework.car.dao;

import homework.car.model.Car;
import homework.company_v3.model.Employee;
import practice.citizens_v2.model.Person;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class GarageImpl implements Garage {
    HashSet<Car> cars = new HashSet<>();

    public GarageImpl() {
        cars=new HashSet<>();
    }
    public GarageImpl(List<Car> car) {
        for(Car car1:cars){
            addCar(car1);
        }
    }

    @Override
    public boolean addCar(Car car) {
        return car != null && cars.add(car);
    }

    @Override
    public boolean removeCar(String regNumber) {
        Car carByRegNumber=findCarByRegNumber(regNumber);
        return carByRegNumber!=null && cars.remove(carByRegNumber);
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (Car m : cars) {
            if(m.getRegNumber() == regNumber) {
                return m;
            }
        }
        return null;
    }

    @Override
    public  Iterable<Car> findCarsByModel(String model) {
        return cars.stream()
                .filter(m -> m.getModel().equalsIgnoreCase(model))
                .collect(Collectors.toList());
    }

    @Override
    public  Iterable<Car> findCarsByCompany(String company) {
        return cars.stream()
                .filter(m -> company.equals(m.getCompany()))
                .collect(Collectors.toList());
    }

    @Override
    public  Iterable<Car> findCarsByEngine(double min, double max) {
        return cars.stream()
                .filter(m -> m.getEngine() >= min && m.getEngine() < max)
                .collect(Collectors.toList());
    }

    @Override
    public  Iterable<Car> findCarsByColor(String color) {
        return cars.stream()
                .filter(m ->m.getColor().equals(color) )
                .collect(Collectors.toList());
    }


}
