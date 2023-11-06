package practice.product.model;

import practice.products.model.Products;

public class Food extends Products {
    private String exData;

    private boolean organic;

    public Food(long barcode, String name, double price, String exData, boolean organic) {
        super(barcode, name, price);
        this.exData = exData;
        this.organic = organic;
    }

    public String getExData() {
        return exData;
    }

    public boolean isOrganic() {
        return organic;
    }

    @Override
    public String toString() {
        return "Food{" +
                "exData='" + exData + '\'' +
                ", organic=" + organic +
                "} " + super.toString();
    }
}
