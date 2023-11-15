package practice_com.company2;

import practice.bus.Bus;
import practice_com.company2.model.Manager;
import practice_com.company2.model.SalesManager;
import practice_com.company2.model.Employee;
import practice_com.company2.model.Worker;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAppl {
    public static void main(String[] args) {
        Employee[] empl = new Employee[6];
        empl[0] = new Manager(100,"Jhon","Smith",35,160,2,"'2'-Bakalavr",5000,5);
        empl[1] = new SalesManager(101,"Anna","Black",46,160,5,"'3'-Magistrate",25000,0.1);
        empl[2] = new SalesManager(102,"Thomas","White",21,160,1,"'1'-School",30000,0.1);
        empl[3] = new Worker(103,"Hans","Bauer",30,160,5,"'0'- without",5);

        double total = totalSalary(empl);
        System.out.println("Total salary: " + total);
        double average= averageAge(empl);
        System.out.println("Average Age = " + average);
        List<Employee> e = new ArrayList<>();
        e.add(empl[0]);
        e.add(empl[1]);
        e.add(empl[2]);
        e.add(empl[3]);
        e.sort(Employee ::compareTo);
        System.out.println("--------------Sorted List-----------");
        System.out.println(e);

    }
    private static double averageAge(Employee[] empl){
        double averageAge = 0;
        double count=0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i]!= null){
                averageAge += empl[i].getAge();
            }
            if (empl[i]!=null) {
                count++;
            }
        }
        return averageAge/count;
    }
    private static double totalSalary(Employee[] empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] != null){
                sum += empl[i].calcSalary();
            }
        }
        return sum;
    }
}
