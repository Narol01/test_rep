package project.check24.model;

import java.util.List;
import java.util.Objects;
public class Basket {
    int id;

    List<Product> productList;

    double sumBasket;

    public Basket(int id, List<Product> productList, double sumBasket) {
        this.id = id;
        this.productList = productList;
        this.sumBasket = sumBasket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getSumBasket() {
        return productList.stream().mapToDouble(r->r.price).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return id == basket.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", productList=" + productList +
                ", sumBasket=" + sumBasket +
                '}';
    }
}
