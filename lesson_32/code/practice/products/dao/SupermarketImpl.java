package practice.products.dao;

import practice.products.model.Products;

public class SupermarketImpl implements Supermarket{

    private Products[] products;

    private int size;
    public SupermarketImpl(int capacity) {
        products=new Products[capacity];
    }
    @Override
    public boolean addProduct(Products computer) {
        if(computer == null || size == products.length || findProduct(computer.getBarCode()) != null){
            return false;
        }
        products[size]=computer;
        size++;
        return true;
    }


    @Override
    public Products removeProduct(long barcode) {
        for (int i = 0; i < size; i++) {
            if(products[i].getBarCode()==barcode){
                Products victim =products[i];
                products[i]=products[size-1];
                products[size-1]=null;
                size --;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Products findProduct(long barcode) {
        for (int i = 0; i < size; i++) {
            if(products[i].getBarCode() ==  barcode){
                return products[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printProduct() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }
    @Override
    public Products[] findProductsExp(String minExpDate ,String maxExpDate) {
        int count=0;
        int a=minExpDate.charAt(0);
        int c=minExpDate.charAt(1);
        int b=maxExpDate.charAt(0);
        int d=maxExpDate.charAt(1);
        for (int i = 0; i < size; i++) {
            if ((products[i].getExpDate()).charAt(0)==a && (products[i].getExpDate()).charAt(0)==b){
                if ((products[i].getExpDate()).charAt(1)>c && (products[i].getExpDate()).charAt(1)<d){
                     count++;
                 }
            }
            else if((products[i].getExpDate()).charAt(0)>a && (products[i].getExpDate()).charAt(0)<b){
                count++;
            }
        }
        Products[] res=new Products[count];
        for (int i = 0, j=0; j < count; i++) {
            if ((products[i].getExpDate()).charAt(0)==a && (products[i].getExpDate()).charAt(0)==b){
                if ((products[i].getExpDate()).charAt(1)>c && (products[i].getExpDate()).charAt(1)<d){
                    res[j++]=products[i];
                }
            }
            else if((products[i].getExpDate()).charAt(0)>a && (products[i].getExpDate()).charAt(0)<b){
                res[j++]=products[i];
            }
        }
        return res;
    }
}