package practice.computer.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.computer.dao.Shop;
import practice.computer.dao.ShopImpl;
import practice.computer.model.Computer;
import practice.computer.model.Handy;
import practice.computer.model.Laptop;

import static org.junit.jupiter.api.Assertions.*;

class ShopImplTest {
    Shop shop;

    Computer[] c;

    @BeforeEach
    void setUp() {
         shop=new ShopImpl(4);
         c = new Computer[3];
         c[0]=new Laptop("102","M2", 16, 512, "MacBook", "22", 5000,2);
         c[1]=new Handy("101","A15", 4, 128, "iPhone","11", 3000,2.4);
         c[2]=new Laptop("103", "i9", 16, 512, "ASUS","14", 5000,2);

        for (int i = 0; i < c.length; i++) {
            shop.addComputer(c[i]);
        }
    }

    @Test
    void addComputer() {
        assertFalse(shop.addComputer(null));
        assertFalse(shop.addComputer(c[2]));
        Computer computer1 =new Laptop ("104","intel i5", 16, 512, "Asus","14", 5000,2);
        assertTrue(shop.addComputer(computer1));
        assertEquals(4, shop.quantity());
        Computer computer2 =new Laptop ("105","intel i7", 16, 512, "Asus","14", 5000,2);
        assertFalse(shop.addComputer(computer2));

    }

    @Test
    void removeComputerTest(){
        assertEquals(c[1],shop.removeComputer("101"));
        assertEquals(2, shop.quantity());
        assertNull(shop.removeComputer("101"));
        assertNull(shop.findComputer("101"));
    }

    @Test
    void findComputer() {
        assertEquals(c[0],shop.findComputer("102"));
        assertNull(shop.findComputer("1101"));

    }

    @Test
    void quantity() {
        assertEquals(3,shop.quantity());
    }

    @Test
    void printComputer() {
        shop.printComputer();
    }
}