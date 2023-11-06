package practice.cite.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.cite.model.City;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CityTest {
    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600000);
        cities[1] = new City("Boston", 670000);
        cities[2] = new City("Chicago", 2700000);
        cities[3] = new City("Atlanta", 470000);
        cities[4] = new City("New York", 8500000);
        cities[5] = new City("Dallas", 1300000);
    }

    private void printArray(Object[] arr, String title) {
        System.out.println("=======" + title + "========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    void testIntegerDesc() {
        Integer[] actual = {-1, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Integer[] expected = {Integer.MAX_VALUE, -1, Integer.MIN_VALUE};
        Arrays.sort(actual, (n1, n2) -> Integer.compare(n2, n1));
//        Arrays.sort(actual,(n1,n2)-> {
//            if(n1<n2){
//                return 1;
//            }
//            if(n2<n1){
//                return -1;
//            }
//            return 0;
//        });

        assertArrayEquals(expected, actual);
    }

    @Test
    void testCityNameComporator() {
        Comparator<City> comporator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(cities, comporator);
        printArray(cities, "Sort by name");
        City[] citiesCopy = Arrays.copyOf(cities, cities.length * 2);
        printArray(citiesCopy, "citiesCopy befor Sort");
        Arrays.sort(citiesCopy, 0, cities.length, comporator);
        printArray(citiesCopy, "citiesCopy after Sort");
        City pattern = new City("Yalta", 0);
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length, pattern, comporator);
        System.out.println("index =" + index);
    }

    @Test
    void testCopy0fRange() {
        City[] citiesCopy = Arrays.copyOfRange(cities, 1, cities.length - 1);
        printArray(citiesCopy, "ojo");
    }


    @Test
    void testSystemArrayCopy() {
        City[] citiesCopy = new City[cities.length * 2];
        System.arraycopy(cities, 1, citiesCopy, 4, 4);
        printArray(citiesCopy, "System.arrayCopy");
    }

    @Test
    void testKeepSorted() {
        Arrays.sort(cities);
        printArray(cities, "Natural order");
        City city = new City("Salem", 690_000);
        City[] citiesCopy = Arrays.copyOf(cities, cities.length + 1);
        int index = Arrays.binarySearch(citiesCopy, 0, citiesCopy.length - 1, city);
        index = index >= 0 ? index : -index - 1;
        System.arraycopy(citiesCopy, index, citiesCopy, index + 1, citiesCopy.length - index - 1);
        citiesCopy[index] = city;
        //Wrong way
//        citiesCopy[citiesCopy.length - 1] = city;
//        Arrays.sort((citiesCopy));
        cities = citiesCopy;
        printArray(cities, "Natural order after add city");

    }
}