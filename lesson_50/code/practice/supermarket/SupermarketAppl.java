package practice.supermarket;

import practice.supermarket.dao.Supermarket;
import practice.supermarket.dao.SupermarketImpl;
import practice.supermarket.model.Product;

import java.time.LocalDate;

public class SupermarketAppl {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        Supermarket myMarket = new SupermarketImpl();
        myMarket.addProduct(new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5)));
        myMarket.addProduct(new Product(222222, "ChokoMilk", "Dairy", "MilkLand", 13, now.minusDays(3)));
        myMarket.addProduct(new Product(333333, "Cheese Gauda", "Dairy", "Farmer", 22.5, now.plusDays(50)));
        myMarket.addProduct(new Product(444444, "Cheese Chedder", "Dairy", "MilkLand", 30, now.plusDays(85)));
        myMarket.addProduct(new Product(555555, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25)));
        for (Product p : myMarket) {
            System.out.println(p);
        }
        System.out.println();
        System.out.println("=============================");
        System.out.println("Products by Brand: " );
        System.out.println(myMarket.findByBrand("MilkLand"));
        System.out.println();
        System.out.println("=============================");
        System.out.println("Products by Category: " );
        Iterable<Product> res= myMarket.findByCategory("bread");
        for (Product p:res){
            System.out.println(p);
        }
        System.out.println();
        System.out.println("=============================");
        System.out.println("Products by Products With Expired Date: " );
        res=myMarket.findByProductsWithExpiredDate();
        for (Product p:res){
            System.out.println(p);
        }

    }
}
