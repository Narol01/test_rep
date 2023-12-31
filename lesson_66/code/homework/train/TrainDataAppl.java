package homework.train;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
Задание 1. Подсчитайте общую стоимость проезда (выручка от рейса).

Задание 2. Посчитайте средний тариф для 1,2,3 классов путешествия.

Задание 3. Подсчитайте общее количество выживших и погибших пассажиров.

Задание 4. Подсчитайте общее количество выживших и погибших мужчин, женщин и детей (до 18 лет).*/
public class TrainDataAppl {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("train.csv"));
        String str=br.readLine();
        String[] cells=str.split(",");
        printCells(cells);
        double sum=0;
        int counter=0;
        int counterMale=0;
        int counterDeatherMale=0;
        int counterFemale=0;
        int counterDeathFemale=0;
        int counterYounger18=0;
        int counterDeathYounger18=0;
        double priceFirst=0;
        int countFirst=0;
        double priceSecond=0;
        int count2=0;
        double price3=0;
        int count3=0;
        str= br.readLine();
        while (str!=null){
            cells=str.split(",");
                        //СКолько было пассажиров младше 18
            if(!(cells[6].isEmpty())){if (Double.parseDouble(cells[6])<=18){counterYounger18++;}}
                        //количество выживших мужчин и женщин
            if (cells[5].equalsIgnoreCase("male") && Integer.parseInt(cells[1])==0){
                counterMale++;}
            if (cells[5].equalsIgnoreCase("female") && Integer.parseInt(cells[1])==0){
                counterFemale++;
            }
                        //количество умерших мужчин и женщин
            if (cells[5].equalsIgnoreCase("male") && Integer.parseInt(cells[1])==1){
                counterDeatherMale++;}
            if (cells[5].equalsIgnoreCase("female") && Integer.parseInt(cells[1])==1){
                counterDeathFemale++;
            }
                        //количество умерших детей
            if(!(cells[6].isEmpty())){if (Double.parseDouble(cells[6])<=18 && Integer.parseInt(cells[1])==1){counterDeathYounger18++;}}
                        //средняя цена по классах
            switch (Integer.parseInt(cells[2])){
                case 1 ->{
                    priceFirst+=  Double.parseDouble(cells[10]);
                    countFirst++;
                }
                case 2 ->{
                    priceSecond+=  Double.parseDouble(cells[10]);
                    count2++;
                }
                case 3 ->{
                    price3+=  Double.parseDouble(cells[10]);
                count3++;
                }
            }
                        //количество людей
            counter++;
                        //Выручка
            sum +=Double.parseDouble(cells[10]);
                        //Печать всего листа
            //printCells(cells);
                        //Продолжаем цикл и выводим новую строку
            str= br.readLine();
        }
        System.out.println("Sum total price: "+sum);
        System.out.println("All passenger: "+counter);
        System.out.println("All Survived: "+ (counterMale+counterFemale));
        System.out.println("All Death: "+ (counter-(counterMale+counterFemale)));
        System.out.println("Death Male: "+ counterMale);
        System.out.println("Survived Male: "+ counterDeatherMale);
        System.out.println("Death Female: "+ counterDeathFemale);
        System.out.println("Survived Female: "+ counterFemale);
        System.out.println("All passenger younger 18: "+counterYounger18);
        System.out.println("All Death passenger younger 18: "+counterDeathYounger18);
        System.out.println("All Survived passenger younger 18: "+(counterYounger18-counterDeathYounger18));
        System.out.println("Avg first: "+priceFirst/countFirst);
        System.out.println("Avg second: "+priceSecond/count2);
        System.out.println("Avg three: "+price3/count3);

    }

    private static void printCells(String[] sells) {
        for (String s:sells){
            System.out.print(s+"\t");
        }
        System.out.println();
    }
}
