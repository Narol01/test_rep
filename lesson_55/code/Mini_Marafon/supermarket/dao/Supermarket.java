package Mini_Marafon.supermarket.dao;

import Mini_Marafon.supermarket.model.Product;

public interface Supermarket extends Iterable<Product> {
    boolean addProduct(Product product);
    Product remove(long barCode);
    Product findByBarCode(long barCode);
    Iterable<Product> findByCategory(String category);
    Iterable<Product> findByBrand(String brand);
    Iterable<Product> findByProductsWithExpiredDate();
    int skuQuantity();




}
