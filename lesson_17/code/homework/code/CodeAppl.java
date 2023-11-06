package homework.code;

import homework.code.model.Code;

public class CodeAppl {
    public static void main(String[] args) {
        Code cod1=new Code(42790734);

        System.out.println("Number of digits: "+cod1.lengthCode(cod1.getCode()));//Вывод количевства цифр
        // посчитаного математическим путём
        System.out.println("Number of digits: "+cod1.lengthCode1());//Вывод количевства цифр используя метод
        // который переводит число в стринг и считает количевство символов
        // ПАРАМЕТР ДОБАВЛЯТЬ НЕ ОБЯЗАТЕЛЬ ИБО ДЕЙСТВИЙ НАД ЧИСЛОМ/КОДОМ НЕ ВЫПОЛНЯЕТСЯ
        System.out.println("Sum of all digits of a number/code: "+cod1.controlSum(cod1.getCode()));//Сумма всех чисел кода
        System.out.println("Is the number of digits in the code true? - "+cod1.isValid(cod1.lengthCode1()));
        //Вывод правильное или не правильное количевство символов


        // **Примечание** считать количевство цифр кода можно только один раз для одного кода
        // при повтором подсчёте количевство цифр равно единице ПРИ УСЛОВИИ ЧТО НЕ БЫЛ ЗАДАН ПАРАМЕТР,
        // ИБО БЕЗ ПАРАМЕТРА ЗНАЧЕНИЕ МЕНЯЕТСЯ

    }
}
