package practice1.time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class TimeAppl {
    public static void main(String[] args) {
        //        **Работа с датами:**
        //        - узнать текущую дату и время
        //        - есть дата, какой это был день недели? день месяца? день года?
        //        - есть дата, как узнать, это было раньше? или позже?
        //
        //          **Путешествие во времени**
        //        - в будущее currentDay.plus
        //        - в прошлое currentDay.minus
        //        - использование ChronoUnit
        //
        //          **Получение интервала времени**
        //
        //          **Сортировка массива по времени**
        //
        //         **Date Formatter**
        //
        //          **Парсинг даты из строки**
        LocalDate currentDay=LocalDate.now();
        System.out.println(currentDay);
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);
        LocalDateTime curentDayTime=LocalDateTime.now();
        System.out.println(curentDayTime);

        LocalDate gagarin= LocalDate.of(1961,4,12);
        LocalDate m= LocalDate.of(2004,11,30);
        System.out.println(gagarin.getYear());
        System.out.println(gagarin.getDayOfWeek()+" "+" "+gagarin.getDayOfYear());
        System.out.println(m.getDayOfWeek()+" "+" "+m.getDayOfYear());
        System.out.println(gagarin.isBefore(m));
        System.out.println(gagarin.isAfter(m));

        System.out.println("=========Traveling in Time ===========");
        LocalDate newDay=currentDay.plusDays(50);
        LocalDate newDay1=currentDay.plusWeeks(12);
        System.out.println(newDay);
        System.out.println(newDay1);

        //2 month ago
        newDay=currentDay.minusMonths(2);
        System.out.println("Two month ago"+newDay);

        //operations with chronounits
        System.out.println((curentDayTime.plus(9, ChronoUnit.HALF_DAYS)));
        //Centure
        newDay =currentDay.plus(2,ChronoUnit.CENTURIES);
        System.out.println("In 2 centures:"+ newDay);
        System.out.println("It will be day of week:"+ newDay.getDayOfWeek());

        // получение интервала времени (сколько лет прошло? сколько лет персоне?)
        LocalDate einstain = LocalDate.of(1879, 3, 14);
        long res = ChronoUnit.YEARS.between(gagarin, einstain);
        System.out.println(res);

        System.out.println("Compare dates");
        System.out.println(einstain.compareTo(gagarin)); // сравнение дат
        LocalDate yesterday = LocalDate.of(2023, 10, 30);
        System.out.println(currentDay.compareTo(yesterday));

        // sorting time
        LocalDate[] dates = {yesterday, einstain, gagarin, currentDay};
        System.out.println(Arrays.toString(dates)); // неотсортированные даты
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates)); // отсортированные даты в массиве

    }
}
