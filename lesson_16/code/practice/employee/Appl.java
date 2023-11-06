package practice.employee;

import practice.employee.model.Employee;

public class Appl {
    public static void main(String[] args) {
        Employee num1=new Employee(1,"Anton","Polykov",24,5000,true);
        Employee num2=new Employee(2,"Katerina","Su",25,3300,false);
        Employee num3=new Employee(3,"Danil","Kinov",31,2500,true);

        num1.display();
        Employee.split();
        num2.display();
        Employee.split();
        num3.display();
        Employee.split();


        double totalSalary = num1.getSalary() +num2.getSalary()+num3.getSalary();
        System.out.println("Total Salary " + totalSalary);
    }
}
