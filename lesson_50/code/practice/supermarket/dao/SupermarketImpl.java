package practice.supermarket.dao;

import practice.supermarket.model.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class SupermarketImpl implements Supermarket{
    private Collection<Product> products=new ArrayList<>();
    //O(1)
    @Override
    public boolean addProduct(Product product) {
       if(product==null || products.contains(product)){
           return false;}
        return products.add(product);
    }
    //O(1)
    @Override
    public Product remove(long barCode) {
        Product removed=findByBarCode(barCode);
        products.remove(removed);
        return removed;
    }
    //O(n)
    @Override
    public Product findByBarCode(long barCode) {
        for(Product p:products){
            if(p.getBarCode()==barCode){
                return p;
            }
        }
        return null;
    }
    //O(1)
    @Override
    public Iterable<Product> findByCategory(String category) {
        return findByPredicate(p->category.equalsIgnoreCase(p.getCategory()));
    }
    //O(1)
    @Override
    public Iterable<Product> findByBrand(String brand) {
        return findByPredicate(p->brand.equalsIgnoreCase(p.getBrand()));
    }
    //O(1)
    @Override
    public Iterable<Product> findByProductsWithExpiredDate() {
        LocalDate currentDate=LocalDate.now();
        return findByPredicate(p->currentDate.isAfter(p.getExDate()));
    }
    //O(n)
    private Iterable<Product> findByPredicate(Predicate<Product> predicate){
        List<Product> res= new ArrayList<>();
        //перебираем вектор списков продуктов, находим то, что подходит по условию
        for (Product p:products){
            if(predicate.test(p)){
                res.add(p);
            }
        }
        return res;
    }
    //O(1)
    @Override
    public int skuQuantity() {
        return products.size();
    }
    //O(1)
    @Override
    public Iterator<Product> iterator() {
        return products.iterator();//Берём итератор от эрей листа
    }
}
