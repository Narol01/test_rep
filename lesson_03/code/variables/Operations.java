package variables;

public class Operations {
    public static void main(String[] args) {

        //Operations with integer numbers
        int x = 20; //обьявили переменную
        int y = 10;
        int z = x + y; // выполнили сложения
        System.out.println("Пример №1");
        System.out.println("Sum: X:" + x + " + Y:" + y + " = " + z);
        skip();

        System.out.println("Пример №2");
        z = x * y;
        System.out.println("z+x=" + (z+x));
        skip();

        System.out.println("Пример №3");
        y = 44;
        x = 36;
        System.out.println("x=" + x + " y=" + y + " x+y=" + (x+y));
        skip();

    }
    public static void skip(){
        System.out.println("");
    }
}
