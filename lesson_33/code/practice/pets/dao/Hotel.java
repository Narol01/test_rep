package practice.pets.dao;

import practice.pets.modul.Pets;

public interface Hotel {

    boolean addPet(Pets pets);
    Pets removePet(int id);
    Pets findPet(int id);
    double price(int id);
    double earnings();
    Pets[] findPets(String breed);
    void printPets();

}
