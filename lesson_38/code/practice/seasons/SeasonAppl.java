package practice.seasons;

public class SeasonAppl {
    public static void main(String[] args) {


        Season[] seasons = Season.values();
        System.out.println(seasons.length);
        System.out.println("=======values 1=========");
        //for loop
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i].getName());
        }
        //for each
        System.out.println("=======values 2=========");
        for (Season season : seasons) {
            System.out.println(season.getNumber());
        }

        System.out.println("=======toString=========");
        String str = Season.WINTER.toString();
        System.out.println(str);

        System.out.println("=======ordinal()=========");
        int n = Season.AUTUMN.ordinal();
        System.out.println(n);

        System.out.println("=======valueOf()=========");

        //        Для обратного преобразования (строки в объект `Day`) можно воспользоваться статическим методом `valueOf()`:
        //```java
        //        Day day = Day.valueOf("MONDAY"); // day = Day.MONDAY
        //```
        Season s=Season.valueOf("SUMMER");
        System.out.println(s.getName()+ "- is the best time of the year!");
    }
}
