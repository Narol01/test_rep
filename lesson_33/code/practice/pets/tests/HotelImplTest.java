package practice.pets.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.pets.dao.Hotel;
import practice.pets.dao.HotelImpl;
import practice.pets.modul.Cat;
import practice.pets.modul.Dog;
import practice.pets.modul.Pets;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HotelImplTest {

    Hotel hotel;
    Pets[] pets;

    @BeforeEach
    void setUp() {
        hotel= new HotelImpl(4);
        pets=new Pets[3];
        pets[0]=new Dog(101,"Barsik","alabai",7,26,4,20);
        pets[1]=new Dog(102,"Jek","labrador",3,13,9,10);
        pets[2]=new Cat(103,"tom","alabai",7 ,12,15,10);

        for (int i = 0; i < pets.length; i++) {
            hotel.addPet(pets[i]);
        }
    }

    @Test
    void addPet() {
        assertFalse(hotel.addPet(null));
        assertFalse(hotel.addPet(pets[2]));
        Pets hotel1 = new Cat(104,"nima","veslouch",1,10,14,10);
        assertTrue(hotel.addPet(hotel1));
        Pets hotel2 =new Cat (105,"Simka", "kot", 5, 18,14, 15);
        assertFalse(hotel.addPet(hotel2));
    }

    @Test
    void removePet() {
        assertEquals(pets[1],hotel.removePet(102));
        assertNull(hotel.removePet(102));
        assertNull(hotel.findPet(102));
    }

    @Test
    void price() {
        assertEquals(150,hotel.price(103));
    }

    @Test
    void earnings() {
        assertEquals(320,hotel.earnings());
    }

    @Test
    void findPets() {
        Pets[] expected={pets[0],pets[2]};
        assertArrayEquals(expected,hotel.findPets("alabai"));
        System.out.println(Arrays.toString(hotel.findPets("alabai")));
        assertNull(hotel.findPet(7));
    }

    @Test
    void printPets() {
        hotel.printPets();
    }
}