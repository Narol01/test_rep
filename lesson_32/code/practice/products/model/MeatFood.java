package practice.products.model;

public class MeatFood extends Food {

    private String meatType;

    public MeatFood(String name, long barCode, double price, String expDate, String meatType) {
        super(name, barCode, price, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return super.toString()+"Meet Food:"+"\nType of meat= " + meatType;
    }
}
