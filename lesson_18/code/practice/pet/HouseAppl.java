package practice.pet;

import homework.pet.model.Pet;
import practice.pet.model.Cat;
import practice.pet.model.Dog;

public class HouseAppl {
    public static void main(String[] args) {
        Pet pet1=new Pet(1,"cat",2,"Tom");
        Pet pet2=new Pet(2,"cat",6,"Simka");
        Pet pet3=new Pet(3,"dog",10,"Jack");
        Pet pet4=new Pet(4,"dog",4,"Barsick");
        Pet pet5=new Pet(4,"cat",4,"Mursik");
        Dog dog1=new Dog("dog",10,"Jack","Labrador",55,23);
        Dog dog2=new Dog("dog",4,"Barsick","Mongrel",37,14);
        Cat cat1 = new Cat("cat",2,"Tom","siamese",23,7);
        Cat cat2 = new Cat("cat",6,"Simka","Folder-eared",17,4);
        Cat cat3 = new Cat("cat",4,"Mursik","Maine Coon",35,17);

        pet1.display();
        cat1.display();
        cat1.walk();
        cat1.eating();
        cat1.sleep();
        cat1.voice();
        Pet.split();
        pet2.display();
        cat2.display();
        cat2.sleep();
        cat2.eating();
        cat2.sleep();
        cat2.voice();
        Pet.split();
        pet3.display();
        dog1.display();
        dog1.walk();
        dog1.toTrain();
        dog1.voice();
        dog1.eating();
        dog1.sleep();
        Pet.split();
        pet4.display();
        dog2.display();
        dog2.sleep();
        dog2.eating();
        dog2.voice();
        dog2.walk();
        dog2.bathed();
        Pet.split();
        pet5.display();
        cat3.display();
        cat3.sleep();
        cat3.voice();
        cat3.eating();
        cat3.walk();
        cat3.sleep();
        Pet.split();

    }
}
