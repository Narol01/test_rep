package homework.company_v3.model;

import homework.company_v3.model.Employee;

public class Worker extends Employee  {

    private double grade;

    public Worker(int id, String firstName, String lastName, int age, double hours,int experience,String education, double grade) {
        super(id, firstName, lastName, age, hours,experience,education);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    @Override
    public double calcSalary(){
        double salary= grade*hours;
        return salary;
    }

    public int compareTo(Worker o) {
        int res = this.experience - o.experience;
        return res != 0 ? res : this.education.compareTo(o.education);
    }
}
