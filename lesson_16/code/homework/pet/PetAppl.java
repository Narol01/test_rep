package homework.pet;

import homework.pet.model.Pet;

public class PetAppl {
    public static void main(String[] args) {
        Pet pet1=new Pet(1,"dog",4,"Barsick");
        Pet pet2=new Pet(2,"mouse",1,"Boris");
        Pet pet3=new Pet(3,"cat",6,"Simka");

        pet1.display();
        Pet.split();
        pet2.display();
        Pet.split();
        pet3.display();
        Pet.split();

        pet1.walk();
        pet1.eating();
        pet1.sleep();
        Pet.split();
        pet2.eating();
        pet2.sleep();
        Pet.split();
        pet3.sleep();
        pet3.play();
        pet3.eating();
        pet3.sleep();
    }
}
