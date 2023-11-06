package practice.products.dao;

import practice.products.model.Products;

public interface Supermarket {

    boolean addProduct(Products products);
    Products removeProduct(long barCode);
    Products findProduct(long barCode);
    int quantity();
    void printProduct();
    Products[] findProductsExp(String minExpDate ,String maxExpDate);
}
