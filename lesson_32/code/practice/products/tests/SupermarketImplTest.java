package practice.products.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.supermarket.dao.Supermarket;
import practice.supermarket.dao.SupermarketImpl;
import practice.supermarket.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {

    Supermarket supermarket;
    LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        supermarket=new SupermarketImpl();
        supermarket.addProduct(new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5)));
        supermarket.addProduct(new Product(222222, "ChokoMilk", "Dairy", "MilkLand", 13, now.minusDays(3)));
        supermarket.addProduct(new Product(333333, "Cheese Gauda", "Dairy", "Farmer", 22.5, now.plusDays(50)));
        supermarket.addProduct(new Product(444444, "Cheese Chedder", "Dairy", "MilkLand", 30, now.plusDays(85)));
        supermarket.addProduct(new Product(555555, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25)));
    }

    @Test
    void addProduct() {
        assertFalse(supermarket.addProduct(null));
        assertFalse(supermarket.addProduct(new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5))));
        assertTrue(supermarket.addProduct(new Product(111112, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5))));
        assertEquals(6, supermarket.skuQuantity());
    }

    @Test
    void removeProduct() {
        assertEquals(new Product(555555, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25)),supermarket.remove(555555));
        assertEquals(4, supermarket.skuQuantity());
        assertNull(supermarket.remove(555555));
    }

    @Test
    void findProduct() {
        assertEquals(new Product(222222, "ChokoMilk", "Dairy", "MilkLand", 13, now.minusDays(3)),supermarket.findByBarCode(222222));
        assertNull(supermarket.findByBarCode(2001L));
    }

    @Test
    void quantity() {
        assertEquals(5,supermarket.skuQuantity());
    }
    @Test
    void findProductsExp() {
        Iterable<Product> res= supermarket.findByCategory("bread");

    }
}