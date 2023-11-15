package practice_com.company2.dao;

import practice_com.company2.model.Employee;
import practice_com.company2.model.SalesManager;

public class CompanyImpl implements Company {

    private Employee[] employees;

    private int size;// текущее количевство сотрудников

    //конструктор
    public  CompanyImpl(int capacity){
        employees=new Employee[capacity];//capacity - количевство сотрудников которое может быть в компании
    }
    @Override
    public boolean addEmployee(Employee employee) {
        if(employee == null || size == employees.length || findEmployee(employee.getId()) != null){
            return false;
        }
        employees[size]=employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId()==id){
               Employee victim=employees[i];
               employees[i]=employees[size-1];// на место найденного поставили последнего кто естi in array
               employees[size-1]=null;// ОБНУЛИЛИ ПОСЛЕДНЕГО
               size --;
               return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId()==id){
            return employees[i];//вернули найденый элемент масива типа Employee
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        double res=0;
        for (int i = 0; i < size; i++) {
            res+= employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return  totalSalary()/size;
    }

    @Override
    public double totalSales() {
        double res=0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager){
                SalesManager salesManager= (SalesManager) employees[i];
                res +=salesManager.getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        int count=0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours()>hours){
                count++;
            }
        }
        Employee[] res=new Employee[count];
        for (int i = 0, j=0; j < count; i++) {
            if (employees[i].getHours() > hours) {
                res[j++] = employees[i];
            }
        }
        return res;
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        int count=0;
        for (int i = 0; i < size; i++) {
            if (employees[i].calcSalary()>minSalary && employees[i].calcSalary()<maxSalary){
                count++;
            }
        }
        Employee[] res=new Employee[count];
        for (int i = 0, j=0; j < count; i++) {
            if (employees[i].calcSalary()>minSalary && employees[i].calcSalary()<maxSalary){
            res[j++]=employees[i];
            }
        }
        return res;
    }
}
