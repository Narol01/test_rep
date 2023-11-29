package Mini_Marafon.supermarket.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product implements Comparable<Product>{

    private long barCode;
    private String name;
    private String category;
    private String brand;
    private double price;
    private LocalDate exDate;

    public Product(long barCode, String name, String category, String brand, double price, LocalDate exDate) {
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.exDate = exDate;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getExDate() {
        return exDate;
    }

    public void setExDate(LocalDate date) {
        this.exDate = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barCode=" + barCode +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", date=" + exDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode);
    }

    @Override
    public int compareTo(Product o) {
        return Long.compare(this.barCode,o.barCode);
    }
}
