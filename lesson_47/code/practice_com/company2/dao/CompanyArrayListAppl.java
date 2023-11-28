package practice_com.company2.dao;

import practice_com.company2.model.Employee;
import practice_com.company2.model.SalesManager;

import java.util.ArrayList;
import java.util.List;

public class CompanyArrayListAppl implements Company {
    List<Employee> employees;

    int capacity;

    public CompanyArrayListAppl(int capacity) {
        employees = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public boolean addEmployee(Employee employee) {
//        if(employee == null || size == employees.length || findEmployee(employee.getId()) != null){
//            return false;
//        }
//        employees[size]=employee;
//        size++;
//        return true;
        if (employee == null || employees.size() == capacity || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees.add(employee);
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee victim = findEmployee(id);
        if (victim != null) {
            employees.remove(victim);
            return victim;
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return employees.size();
    }

    @Override
    public double totalSalary() {
        double res = 0;
        for (Employee e : employees) {
            res += e.calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / employees.size();
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (Employee e : employees) {
            if (e instanceof SalesManager) {
                SalesManager salesManager = (SalesManager) e;
                res += salesManager.getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployee() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        int count = 0;
        for (Employee e : employees) {
            if (e.getHours() > hours) {
                count++;
            }
        }
        Employee[] res = new Employee[count];
        count = 0;
        for (Employee e : employees) {
            if (e.getHours() > hours) {
                res[count++] = e;
                //count++;
            }
        }
        return res;
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
//        int count=0;
//        for (int i = 0; i < size; i++) {
//            if (employees[i].calcSalary()>minSalary && employees[i].calcSalary()<maxSalary){
//                count++;
//            }
//        }
//        Employee[] res=new Employee[count];
//        for (int i = 0, j=0; j < count; i++) {
//            if (employees[i].calcSalary()>minSalary && employees[i].calcSalary()<maxSalary){
//                res[j++]=employees[i];
//            }
//        }
//        return res;
//    }
        int count = 0;
        for (Employee e : employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                count++;
            }
        }
        Employee[] res = new Employee[count];
        count=0;
        for (Employee e : employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                res[count++] = e;
            }
        }
        return res;
    }
}