package practis;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input number 1");
        int numb1= scanner.nextInt();
        System.out.println("Choice your symbol when 1 = + ; 2 = - ; 3 = * ; 4 = /; 5 = %");
        int symb= scanner.nextInt();
        System.out.println("Input number 2");
        int numb2= scanner.nextInt();

        switch (symb){
            case 1 ->{
                System.out.println(""+ numb1 +" + "+ numb2 +" = "+(numb1+numb2));
            }
            case 2 ->{
                System.out.println(""+ numb1 +" - "+ numb2 +" = "+(numb1-numb2));
            }
            case 3 ->{
                System.out.println(""+ numb1 +" * "+ numb2 +" = "+(numb1*numb2));
            }
            case 4 ->{
                System.out.println(""+ numb1 +" / "+ numb2 +" = "+(numb1/numb2));
            }
            case 5 ->{
                System.out.println(""+ numb1 +" % "+ numb2 +" = "+(numb1%numb2));
            }
            default -> System.out.println("Wrong operation");
        }
    }
}
