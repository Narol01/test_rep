package practice.products.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.products.dao.Supermarket;
import practice.products.dao.SupermarketImpl;
import practice.products.model.Food;
import practice.products.model.MeatFood;
import practice.products.model.MilkFood;
import practice.products.model.Products;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {

    Supermarket supermarket;

    Products[] products;



    @BeforeEach
    void setUp() {
        supermarket=new SupermarketImpl(5);
        products= new Products[3];
        products[0]=new Food( "Sausages",2000, 5, "02.10");
        products[1]=new MeatFood("Chicken fillet",35453L,9.90,"03.10","Chicken");
        products[2]=new MilkFood("Milk",4353664L,2,"15.10","Whole",0.3);
        for (int i = 0; i < products.length; i++) {
            supermarket.addProduct(products[i]);
        }

    }

    @Test
    void addProduct() {
        assertFalse(supermarket.addProduct(null));
        assertFalse(supermarket.addProduct(products[2]));
        Products products1 =new Food("Yogurt", 941845L,1.39,"10.10");
        assertTrue(supermarket.addProduct(products1));
        assertEquals(4, supermarket.quantity());
        Products products2 =new Food( "Goat cheese",3000, 13, "31.12");
        assertFalse(supermarket.addProduct(products1));
    }

    @Test
    void removeProduct() {
        assertEquals(products[0],supermarket.removeProduct(2000L));
        assertEquals(2, supermarket.quantity());
        assertNull(supermarket.removeProduct(2000L));
        assertNull(supermarket.removeProduct(2000L));
    }

    @Test
    void findProduct() {
        assertEquals(products[0],supermarket.findProduct(2000L));
        assertNull(supermarket.findProduct(2001L));
    }

    @Test
    void quantity() {
        assertEquals(3,supermarket.quantity());
    }

    @Test
    void printProduct() {
        supermarket.printProduct();
    }
    @Test
    void findProductsExp() {
        Products[] actual = supermarket.findProductsExp("01.10","09.10");
        Products[] expexted ={products[0],products[1]};
        assertArrayEquals(expexted,actual);
    }
}