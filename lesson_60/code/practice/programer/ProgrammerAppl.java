package practice.programer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProgrammerAppl {

    //Кто из программистов знает больше всего языков
    //Ф И - кол-вл языков
    // Какие языки пользуются популярностью среди наших программистов
    //Язык программирования - сколько программистов его знают

    public static void main(String[] args) {
        List<Programmer> programmers=getProgrammers();
        System.out.println("Most skilled programmers");
        printSkilledProgrammers(programmers);
        System.out.println("Most popular technologies");
        printMostPopularTechnologies(programmers);
    }//end of main

    private static void printMostPopularTechnologies(List<Programmer> programmers) {
        System.out.println("----------Print all technologies-----------");
        Iterable<String> technologies=programmers.stream()
                .map(p->p.getLanguage())//Преобразование объекта програмер в одно поле с массивом языков.
                .flatMap(t-> Arrays.stream(t))//каждый из массивов преобразуем в отдельный стрим
                .collect(Collectors.toList());

        System.out.println("--------------List of technologies-----------------");
        StreamSupport.stream(technologies.spliterator(),false)
                .distinct()
                .forEach(System.out::println);

        System.out.println("-------------Grouping By programmers----------------");
        Map<String,Long> techFrequency=programmers.stream()
                .map(Programmer::getLanguage)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(t->t ,Collectors.counting()));
        System.out.println(techFrequency);

        Long max=techFrequency.values().stream()
                .max(Long::compareTo).orElse(0L);
        techFrequency.entrySet().stream()
                .filter(e->max.equals(e.getValue()))//Взяли только тех у кого равно максимум
                .forEach(e->System.out.println(e.getKey()));
    }

    private static void printSkilledProgrammers(List<Programmer> programmers) {

        Map<Integer, List<Programmer>> skilledProgrammers=programmers.stream()
                .collect(Collectors.groupingBy(p->p.getLanguage().length));

        Integer max= skilledProgrammers.keySet().stream()
                .max(Integer::compareTo).orElse(0);

        skilledProgrammers.get(max).forEach(System.out::println);

        /* Map<Integer, List<Programmer>> skilledProgrammers= new HashMap<>();
        int max=0;
        for(Programmer programmer:programmers){
            int key = programmer.getLanguage().length;// это ключ для мапы, то кол-во языков, которое он знает
            max = key > max ? key : max;// обновили max, если он стал больше в ходе выполнения цикла
            skilledProgrammers.putIfAbsent(key,new ArrayList<>());// если такой key встретился 1-й раз, то создаем пустой лист
            List<Programmer> programmerList=skilledProgrammers.get(key);
            programmerList.add(programmer);
        }*/


    }

    private static List<Programmer> getProgrammers() {
    return List.of(
            new Programmer("Peter", "C++", "Python", "Java", "Kotlin"),
            new Programmer("John", "Python", "Java"),
            new Programmer("Helen", "Kotlin", "Scala", "Java", "JavaScript"),
            new Programmer("Jacob", "Python", "Go"),
            new Programmer("Mikhail", "Fortran", "Algol", "PL-1")
    );
    }

}//end of class
