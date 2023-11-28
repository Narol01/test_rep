package homework.company_v3.dao;

import homework.company_v3.model.Employee;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CompanySetImpl implements Company{
    TreeSet<Employee> employees;
    public CompanySetImpl(){
        employees =new TreeSet<>();
    }
    public CompanySetImpl(List<Employee> empl){
        this();
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
        Employee pattern = new Employee(id, null, null, 0,0,0,null,0,0);
        Employee employee = employees.ceiling(pattern);
        return pattern.equals(employee) ? employee : null;
    }

    @Override
    public int quantity() {
        return employees.size();
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
        return employees.stream()
                .filter(m -> m.getBaseSalary()>minSalary && m.getBaseSalary()<maxSalary)
                .collect(Collectors.toList());
    }
}
