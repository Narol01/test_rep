package practice.products.model;

import practice.products.model.Food;

public class MilkFood extends Food {

    private String milkType;
    private double fat;

    public MilkFood(String name, long barCode, double price, String expDate, String milkType, double fat) {
        super(name, barCode, price, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMilk food:"+"\nType of milk= " + milkType +
                "\nFat= " + fat ;
    }
}
