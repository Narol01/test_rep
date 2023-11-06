package practice.products.model;

import practice.products.model.Products;

public class Food extends Products {

    private String expDate;

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public Food(String name, long barCode, double price, String expDate) {
        super(name, barCode, price,expDate);
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return super.toString()+"\nExpiration date= "+expDate;
    }

}
