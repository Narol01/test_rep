package practice.programer;

import java.util.Arrays;

public class Programmer {
    // В этом классе нужно учесть состав и количество языков программирования, которые знает программист (technology).
    private String name;
    private String[] language;

    public Programmer(String name, String... language) {
        //массивы разной длины
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String[] getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "\n---------" +
                "\nname='" + name + '\'' +
                ", \nlanguage=" + Arrays.toString(language) +
                '}';
    }
}