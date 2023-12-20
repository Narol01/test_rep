package project.check24.model;

import java.util.Objects;

public class Product {
    String product;
    double price;
    double rating;
    String quality;
    String store;

    public Product(String product, double price, double rating, String quality,String store) {
        this.product = product;
        this.price = price;
        this.rating = rating;
        this.quality = quality;
        this.store=store;
    }

    public String getProduct() {
        return product;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Objects.equals(product, product1.product) && Objects.equals(store, product1.store);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, store);
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", quality='" + quality + '\'' +
                ", store='" + store + '\'' +
                '}';
    }
}
