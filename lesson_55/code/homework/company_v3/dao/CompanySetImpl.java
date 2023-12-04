package homework.company_v3.dao;

import homework.company_v3.model.Employee;
import homework.company_v3.model.Manager;
import homework.company_v3.model.SalesManager;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CompanySetImpl implements Company{
    HashSet<Employee> employees;
    public CompanySetImpl(){
        employees =new HashSet<>();
    }
    public CompanySetImpl(List<Employee> empl){
        employees =new HashSet<>();
        for(Employee empld:empl){
            addEmployee(empld);
        }
    }
    @Override
    public boolean addEmployee(Employee employee) {
        return employee != null && employees.add(employee);
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee victim=findEmployee(id);
        if(victim!=null){
            employees.remove(victim);
            return victim;
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (Employee m : employees) {
            if(m.getId() == id) {
                return m;
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
            if (e instanceof SalesManager salesManager) {
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
    public Iterable<Employee> findEmployeesHoursGreaterThan(int hours) {
        return employees.stream()
                .filter(m -> m.getHours() > hours)
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Employee> findEmployeesSalaryRange(int minSalary, int maxSalary) {
        for (Employee e : employees) {
            if (e instanceof Manager | e instanceof SalesManager) {
                return employees.stream()
                        .filter(m -> m.calcSalary() > minSalary && m.calcSalary() < maxSalary)
                        .collect(Collectors.toList());
            }
        }
        return null;
    }
}
