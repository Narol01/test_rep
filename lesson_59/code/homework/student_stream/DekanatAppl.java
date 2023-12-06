package homework.student_stream;

import practice.users.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DekanatAppl {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        Student[] students=new Student[6];

        students[0]=new Student(1,"Alex","T",now.minusYears(20),"IT",4,"Italy",false);
        students[1]=new Student(2,"Roman","M",now.minusYears(24),"IT",4,"Ukraine",false);
        students[2]=new Student(3,"Roxi","Smith",now.minusYears(22),"Marketing",2,"Germany",true);
        students[3]=new Student(4,"Sini","Fox",now.minusYears(23),"Media",2,"France",true);
        students[4]=new Student(5,"Jon","Wein",now.minusYears(24),"Design",3,"Spain",true);
        students[5]=new Student(6,"Saner","Jein",now.minusYears(20),"Design",5,"Spain",true);

        List<Student> student = new ArrayList<>(); // создали ArrayList
        for (int i = 0; i < students.length; i++) {
            student.add(students[i]); // положили пользователей в список типа ArrayList
        }

        printCourseSortN(student,"IT");
        printCourseSortA(student,"Design");
        printGroupSortN(student,4);
        printGroupSortA(student,2);
        countMan(student,false);
        countWoman(student,true);
        averageCourse(student,"IT");
        averageStudents(student);
    }

    private static void printCourseSortN(List<Student> studList,String course) {
        System.out.println("----------------------------------------");
        studList.stream()
                .filter(p->p.getCourse().equalsIgnoreCase(course))
                .sorted(Comparator.comparing(Student::getLastName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void printCourseSortA(List<Student> studList,String course) {
        System.out.println("----------------------------------------");
        studList.stream()
                .filter(p->p.getCourse().equalsIgnoreCase(course))
                .sorted(Comparator.comparing(Student::getBirtDay))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void printGroupSortN(List<Student> studList,int groupNum) {
        System.out.println("----------------------------------------");
        studList.stream()
                .filter(p->p.getGroupNum()==groupNum)
                .sorted(Comparator.comparing(Student::getLastName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void printGroupSortA(List<Student> studList,int groupNum) {
        System.out.println("----------------------------------------");
        studList.stream()
                .filter(p->p.getGroupNum()==groupNum)
                .sorted(Comparator.comparing(Student::getBirtDay))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void countMan(List<Student> studList,boolean gender){
        System.out.println("----------------------------------------");
        studList.stream()
                .filter(p->p.isGender()==gender)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        long countDifferentCountries = studList.stream()
                .filter(p->p.isGender()==gender)
                .map(Student::getCountry)
                .distinct() // исключение дубликатов
                .count(); // кол-во
        System.out.println("Number of Country: " + countDifferentCountries);
    }

    private static void countWoman(List<Student> studList,boolean gender){
        System.out.println("----------------------------------------");
        studList.stream()
                .filter(p->p.isGender()==gender)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        long countDifferentCountries = studList.stream()
                .filter(p->p.isGender()==gender)
                .map(Student::getCountry)
                .distinct() // исключение дубликатов
                .count(); // кол-во
        System.out.println("Number of Country: " + countDifferentCountries);
    }

    private static void averageCourse(List<Student> studList,String course){
        System.out.println("----------------------------------------");
        double averageAge = studList.stream()
                .filter(p->p.getCourse().equalsIgnoreCase(course))
                .mapToInt(Student::getAge)
                .summaryStatistics()
                .getAverage();
        System.out.println("Average age is: " + averageAge);
        System.out.println();
    }

    private static void averageStudents(List<Student> studList){
        System.out.println("----------------------------------------");
        double averageAge = studList.stream()
                .mapToInt(Student::getAge)
                .summaryStatistics()
                .getAverage();
        System.out.println("Average age is: " + averageAge);
        System.out.println();
    }

}
