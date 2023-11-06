package practic;

import java.util.Scanner;

public class Garbage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input The object you want to throw away");
        String object = scanner.next();

        switch (object){
            case "Package","Plastic","Bag" ->System.out.println("Throw in the yellow container");
            case "Paper","Carton" ->System.out.println("Throw in the green container");
            case "rest","waste" ->System.out.println("Throw in the black container");
            case "Food" ->System.out.println("Throw in the brown container");
        }
        if(object.equals("Package") | object.equals("Plastic") | object.equals("Bag") ){
            System.out.println("Throw in the yellow container");}
        else if(object.equals("Paper") | object.equals("Carton") ){
            System.out.println("Throw in the green container");}
        else if(object.equals("Organic")) {
            System.out.println("Throw in the brown container");}
        else{System.out.println("Throw in the black container");}

   }

}
