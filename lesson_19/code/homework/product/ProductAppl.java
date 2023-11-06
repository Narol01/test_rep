package homework.product;

import homework.product.model.Food;
import homework.product.model.MeatFood;
import homework.product.model.MilkFood;
import homework.product.model.Product;

public class ProductAppl {
    public static void main(String[] args) {

        Product[] prod=new Product[4];
        prod[0]=new Food("Yogurt", 941845L,1.39,"10.10");
        prod[1]=new MeatFood("Chicken fillet",35453L,9.90,"3.10","Chicken");
        prod[2]=new MilkFood("Milk",4353664L,2,"5.10","Whole",0.3);
        prod[3]=new Product("Dress",345464L,54.99);
        for (int i = 0; i < prod.length; i++) {
            System.out.println(prod[i]);
            System.out.println("_________________________________");
        }
        double sumpreis = 0;
        for (int i = 0; i < prod.length; i++) {
            sumpreis+=prod[i].getPrice();
        }
        System.out.println("Total Price= "+sumpreis);
    }
}
