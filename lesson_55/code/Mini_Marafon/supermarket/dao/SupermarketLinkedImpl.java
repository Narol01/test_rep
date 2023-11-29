package Mini_Marafon.supermarket.dao;

import Mini_Marafon.supermarket.model.Product;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SupermarketLinkedImpl implements Supermarket{

    List<Product> products;

    public SupermarketLinkedImpl(){
        products=new LinkedList<>();
    }
    @Override
    public boolean addProduct(Product product) {
        if(product==null || products.contains(product)){
            return false;}
        return products.add(product);
    }

    @Override
    public Product remove(long barCode) {
        Product removed=findByBarCode(barCode);
        products.remove(removed);
        return removed;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for(Product p:products){
            if(p.getBarCode()==barCode){
                return p;
            }
        }
        return null;
    }
    //O(n)
    @Override
    public Iterable<Product> findByCategory(String category) {
        return  products.stream().filter(p ->p.getCategory().equalsIgnoreCase(category)).collect(Collectors.toList());
    }
    //O(n)
    @Override
    public Iterable<Product> findByBrand(String brand) {
        return  products.stream().filter(p ->p.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList());
    }
    //O(n)
    @Override
    public Iterable<Product> findByProductsWithExpiredDate() {
        LocalDate currentDate=LocalDate.now();
        return products.stream().filter(p->currentDate.isAfter(p.getExDate())).collect(Collectors.toList());
    }
    //O(1)
    @Override
    public int skuQuantity() {
        return products.size();
    }
    //O(1)
    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
