package practice.products.model;

public abstract class Products {
    private String name;
    private long barCode;
    private double price;

    private String expDate;

    public Products(String name, long barCode, double price,String expDate) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", barCode=" + barCode +
                ", price=" + price +
                ", expDate='" + expDate + '\'' +
                '}';
    }

}
