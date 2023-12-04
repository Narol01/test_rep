package homework.car.tests;



import homework.car.dao.Garage;
import homework.car.dao.GarageImpl;
import homework.car.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {
    Garage garage;
    Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl();
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model3", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");
        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }
    }

    @Test
    void addCar() {
        assertFalse(garage.addCar(cars[0]));
        Car car = new Car("Number5", "Model4", "Company2", 2.0, "Green");
        assertTrue(garage.addCar(car));
        car = new Car("Number6", "Model4", "Company2", 2.0, "Green");
        assertTrue(garage.addCar(car));
    }

    @Test
    void removeCar() {
        assertTrue(garage.removeCar("Number1"));
    }

    @Test
    void findCarByRegNumber() {
        Car car = garage.findCarByRegNumber("Number4");
        assertEquals(cars[3], car);
        assertEquals(cars[3].getColor(), car.getColor());
        assertEquals(cars[3].getEngine(), car.getEngine());
        assertEquals(cars[3], garage.findCarByRegNumber(("Number4")));
    }

    @Test
    void findCarsByModel() {
        Iterable<Car> person=garage.findCarsByModel("Model1");
        List<Car> actual=new ArrayList<>();
        for(Car p:person){
            actual.add(p);
        }
        Collections.sort(actual);//сортируем в порядке возрастания по ид
        List<Car> expected=List.of(
                cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red"));
        assertIterableEquals(expected,actual);
    }

    @Test
    void findCarsByCompany() {
        Iterable<Car> person=garage.findCarsByCompany("Company2");
        List<Car> actual=new ArrayList<>();
        for(Car p:person){
            actual.add(p);
        }
        Collections.sort(actual);//сортируем в порядке возрастания по ид
        List<Car> expected=List.of(
                cars[2] = new Car("Number3", "Model3", "Company2", 1.5, "Red"),
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green"));
        assertIterableEquals(expected,actual);
    }

    @Test
    void findCarsByEngine() {
        Iterable<Car> person=garage.findCarsByEngine(1.5,1.9);
        List<Car> actual=new ArrayList<>();
        for(Car p:person){
            actual.add(p);
        }
        Collections.sort(actual);//сортируем в порядке возрастания по ид
        List<Car> expected=List.of(
                cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red"),
                cars[2] = new Car("Number3", "Model3", "Company2", 1.5, "Red"));
        assertIterableEquals(expected,actual);
    }

    @Test
    void findCarsByColor() {
        Iterable<Car> person=garage.findCarsByColor("Red");
        List<Car> actual=new ArrayList<>();
        for(Car p:person){
            actual.add(p);
        }
        Collections.sort(actual);//сортируем в порядке возрастания по ид
        List<Car> expected=List.of(
                cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red"),
                cars[2] = new Car("Number3", "Model3", "Company2", 1.5, "Red"));
        assertIterableEquals(expected,actual);
    }
}