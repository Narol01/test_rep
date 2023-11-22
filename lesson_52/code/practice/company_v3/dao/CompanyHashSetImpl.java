package practice.company_v3.dao;

import practice.company_v3.model.Employee;
import practice.company_v3.model.SalesManager;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class CompanyHashSetImpl implements Company {

    Set<Employee> employees; // вместо List делаем HashSet
    int capacity; // вместимость компании

    public CompanyHashSetImpl(int capacity) {
        this.capacity = capacity; // это ограничение по кол-ву сотрудников в компании
        employees = new HashSet<>(); // длину (размер) указывать не надо
    }


    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || employees.size() == capacity) {
            return false;
        }
        return employees.add(employee); // добавили в список сотрудника (элемент списка)

    }

    @Override
    public Employee removeEmployee(int id) {
        Employee victim = findEmployee(id);
//        if (victim != null) { // а надо ли это проверять?
        employees.remove(victim);
        return victim;
//        }
//        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (Employee e : employees) { // e - это employee из списка employees
            if (e.getId() == id) {
                return e; // вернули найденный элемент
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
                //    SalesManager salesManager = (SalesManager) e;
                res += ((SalesManager) e).getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        employees.forEach(e -> System.out.println(e));
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return findByPredicate(p->hours<=p.getHours());
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return findByPredicate(p->p.calcSalary()<maxSalary && p.calcSalary() >=minSalary );
    }

    private Employee[] findByPredicate(Predicate<Employee> predicate) {
        List<Employee> res = new ArrayList<>();
        //перебираем вектор списков продуктов, находим то, что подходит по условию
        for (Employee p : employees) {
            if (predicate.test(p)) {
                res.add(p);
            }
        }
        return res.toArray(new Employee[0]);
    }
}
