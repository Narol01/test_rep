package practic;

public class Conditions {
    public static void main(String[] args) {

        int x =0;

        if (x > 0){
            System.out.println("x - положительное");}

        else if(x == 0) {
            System.out.println("x - 0");}

        else  {
            System.out.println("x - отрицательное");}
//
//
//
        int y = 15;

        if (y % 2 == 0){
            System.out.println("Число " + y + " - Четное");
        }
        else {
            System.out.println("Число " + y +" - Не четное");
        }
//
//
//
        int age = 18;

        if (age >= 18){
            System.out.println("Вам разрешено действовать самостоятельно");
        }
        else {
            System.out.println("Вам надо прийти вместе с вашим опекуном");
        }

    }
}
