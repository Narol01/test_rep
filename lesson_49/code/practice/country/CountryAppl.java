package practice.country;

import java.util.LinkedList;
import java.util.List;

public class CountryAppl {
    public static void main(String[] args) {
        List<Country> country=new LinkedList<>();

        country.add(new Country("Россия",145912025,"Евразия"));
        country.add(new Country("Бразилия",212559417,"Южная Америка"));
        country.add(new Country("США",331002651,"Северная Америка"));
        country.add(new Country("Китай",1444216107,"Азия"));
        country.add(new Country("ЮАР",59308690,"Африка"));
        country.add(new Country("Австралия",25499884,"Австралия"));
        country.add(new Country("Франция",65273511,"Европа"));
        country.add(new Country("Индия",1380004385,"Азия"));
        country.add(new Country("Аргентина",45195777,"Южная Америка"));
        country.add(new Country("Нигерия",206139587,"Африка"));
        country.add(new Country("Новая Зеландия",4822233,"Австралия"));
        System.out.println("-----------Sort by Alphabet----------");
        country.sort(Country::compareTo);
        System.out.println(country);
        System.out.println("-----------Sort by continent----------");
        country.sort(Country::compareToCont);
        System.out.println(country);
        System.out.println("-----------Sort by population----------");
        country.sort(Country::compareToPop);
        System.out.println(country);
    }
}
