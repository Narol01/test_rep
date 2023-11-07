package practice.pets.dao;

import practice.pets.modul.Pets;

import java.util.Arrays;
import java.util.function.Predicate;

public class HotelImpl implements Hotel {
    private int size;

    private Pets[] pet;

    public HotelImpl(int capacity){
        pet=new Pets[capacity];
    }
    @Override
    public boolean addPet(Pets pets) {
        if(pets == null || size == pet.length || findPet(pets.getId()) != null){
            return false;
        }
        pet[size]=pets;
        size++;
        return true;
    }

    @Override
    public Pets removePet(int id) {
        for (int i = 0; i < size; i++) {
            if(pet[i].getId()==id){
                Pets victim =pet[i];
                pet[i]=pet[size-1];// на место найденного поставили последнего кто естi in
                pet[size-1]=null;// ОБНУЛИЛИ ПОСЛЕДНЕГО
                size --;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Pets findPet(int id) {
        for (int i = 0; i < size; i++) {
            if (pet[i].getId() == id ) {
                return pet[i];
            }
        }
        return null;
    }

    @Override
    public double price(int id) {
        double price=0;
        for (int i = 0; i < size; i++) {
            if(pet[i].getId() == id){
                price= pet[i].prices();
            }
        }
        return price;
    }

    @Override
    public double earnings() {
        double sum=0;
        for (int i = 0; i < size; i++) {
            sum+=pet[i].prices();
        }
        return sum;
    }

    @Override
    public Pets[] findPets(String breed) {
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (pet[i].getBreed() == breed) {
                c++;
            }
        }
        Pets[] doc = new Pets[c];
        for (int i = 0, j = 0; j <c; i++) {
            if (pet[i].getBreed() == breed) {
                doc[j++]=pet[i];
            }
        }
        return doc;
    }


    @Override
    public void printPets() {
        for (int i = 0; i < size; i++) {
            System.out.println(pet[i]);
        }
    }
}
