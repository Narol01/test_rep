package Mini_Marafon.supermarket.dao;

import Mini_Marafon.supermarket.dao.Supermarket;
import Mini_Marafon.supermarket.model.Product;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SupermarketHashImpl implements Supermarket {
    HashSet<Product> products;

    public SupermarketHashImpl(){
        products=new HashSet<>();
    }

    public SupermarketHashImpl(List<Product> product) {

    }
    @Override
    public boolean addProduct(Product product) {
        return product != null && products.add(product);
    }

    @Override
    public Product remove(long barCode) {
        Product removed=findByBarCode(barCode);
        if(removed !=null){
            products.remove(removed);
            return removed;
        }
        return null;
    }
    //O(log n)- Этот способ поиска является самым быстрым при поиске среди большого количества элементов
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
        return products.stream().filter(p->p.getCategory().equalsIgnoreCase(category)).collect(Collectors.toList());
    }
    //O(n)
    @Override
    public Iterable<Product> findByBrand(String brand) {
        return products.stream().filter(p->p.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList());
    }

    //O(n), где "n" - количество продуктов.
    @Override
    public Iterable<Product> findByProductsWithExpiredDate() {
        LocalDate currentDate=LocalDate.now();
        return products.stream().filter(p->currentDate.isAfter(p.getExDate())).collect(Collectors.toList());


    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
