package practic;

import java.util.Scanner;

public class Oleg {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Hi, What is your name?");
        String name = scanner.next();
        switch (name){
            case "Oleg" -> System.out.println("That's my name too");
            default -> System.out.println("My name is Oleg.");
        }
        System.out.println("Nice to meet you \n How old are you?");
        int age = scanner.nextInt();
        if(age < 25){
            System.out.println("Oh you're so young \n let's study together");}
        if(age >=25){
            System.out.println("You are older then me \n I hope I can learn something from you ");}
        System.out.println("What kind of sport do you like?");
        String sport = scanner.next();
        switch (sport){
            case "volleyball"-> System.out.println("You must be jumping height,\n it's a wonderful kind of sport");
            case "basketball"-> System.out.println("Wow this is amazing");
            case "football"->{
                System.out.println("This is a popular sport \n How many years have you been doing it?");
            int num = scanner.nextInt();}
            case "gym"-> System.out.println("You probably have a very athletic and strong build.");
            case "tennis"-> System.out.println("Oh i like tennis it's an active sport");
            default -> System.out.println("Amazing ,How many years have you been doing it?");
        }
        System.out.println("What is your height?");
        int height = scanner.nextInt();
        if(height<170){
            System.out.println("I think active sport would suit you");}
        else{System.out.println("I'M sure you would feel confident playing basketball or volleyball");}
        System.out.println("What genre of films do you like?");
        String genre = scanner.next();
        switch (genre){
            case "Comedy"-> System.out.println("I recommend you watch 'Home Alone','Rush Hour',''The Mask");
            case "Drama"-> System.out.println("I recommend you watch 'Intouchables','The Green Mile','Joker'");
            case "Horror"-> System.out.println("I recommend you watch 'Mirrors','The Ring','The Babadook'");
            case "Detective"-> System.out.println("I recommend you watch 'Sherlock','Knives Out','Luther'");
            case "Action"-> System.out.println("I recommend you watch 'Deadpool','Leon','Taxi'");
        }
    }
}
