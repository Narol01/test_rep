package practice.pets.dao;

import practice.pets.modul.Pets;

public class HotelImpl implements Hotel {
    private int size;

    private Pets[] pet;

    public HotelImpl(int capacity){
        pet=new Pets[capacity];
    }
    @Override
    public boolean addPet(Pets pets) {
        if(pets == null || size == pet.length || findPets(pets.getBreed()) != null){
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
    public Pets findPets(String breed) {
        for (int i = 0; i < size; i++) {
            if (pet[i].getBreed() == breed) {
                return  pet[i];
            }
        }
        return null;
    }

    @Override
    public void printPets() {
        for (int i = 0; i < size; i++) {
            System.out.println(pet[i]);
        }
    }
}
