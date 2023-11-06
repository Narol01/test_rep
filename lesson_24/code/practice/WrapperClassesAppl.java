package practice;

public class WrapperClassesAppl {
    public static void main(String[] args) {
        //количевство цифр в числе, метод 2(делим на 1 до получения 0,цикл вайл)
        Integer x =1542345; // обьект типа Integer
        String st= x.toString();// преобразование в строку
        int l= st.length();// узнал длину строки
        System.out.println("Number of digits "+x+" = "+ l);
        System.out.println(x.MAX_VALUE);
        Double y=32456.00;
        String st1=y.toString();
        System.out.println("Number of digits "+y+" = "+ st.length());

        //присвоение и вычесление
        int n = 20;
        Integer m= 10;
        System.out.println("n = "+ n);
        System.out.println("m = "+ m);
        m = m + n;
        System.out.println("m + n = "+ m);
        Double pi = 3.14;
        double circleLength=2*pi*10;
        System.out.printf("circle length = %.2f", circleLength);
        System.out.println();

        //константы классов - оберток
        System.out.println("Integer Max " +Integer.MAX_VALUE);
        System.out.println("Integer Min " +Integer.MIN_VALUE);
        System.out.println("Long Max " +Long.MAX_VALUE);
        System.out.println("Long Min " +Long.MIN_VALUE);
        System.out.println("Double Max " +Double.MAX_VALUE);
        System.out.println("Double Min " +Double.MIN_VALUE);

        //обработка деления на ноль
        System.out.println("----------Not-a-Number (NaN)-------------");
        double a = 20.0 / 2;
        if(Double.isInfinite(a) || Double.isNaN(a)){// получилась бесконечность или не существующее число
            System.out.println("Wrong operation or wrong result.");
        }
        else {
            System.out.println(a);
        }

        //Перевод  String to number
        System.out.println("Parsing String to number");
        String str = "0987654321";
        int num = Integer.parseInt(str);
        System.out.println("String " + str +" = " + num);

        String str1 = "2.76543";
        double exp = Double.parseDouble(str1);
        System.out.println("Exp = " + exp);
    }

}
