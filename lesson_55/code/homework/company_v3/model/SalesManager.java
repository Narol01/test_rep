package homework.company_v3.model;

import homework.company_v3.model.Employee;

public class SalesManager extends Employee  {

    private double salesValue;
    private double percent;

    public SalesManager(int id, String firstName, String lastName, int age, double hours,int experience,String education, double salesValue, double percent) {
        super(id, firstName, lastName, age, hours,experience,education);
        this.salesValue = salesValue;
        this.percent = percent;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double calcSalary(){
        double salary= salesValue * percent;
        return salary;
    }
    public int compareTo(SalesManager o) {
        int res = this.experience - o.experience;
        return res != 0 ? res : this.education.compareTo(o.education);
    }
}

