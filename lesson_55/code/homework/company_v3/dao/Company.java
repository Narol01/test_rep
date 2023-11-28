package homework.company_v3.dao;

import homework.company_v3.model.Employee;

//    - добавить сотрудника
//    - удалить сотрудника
//    - найти сотрудника
//    - кол-во сотрудников
//    - ФОТ
//    - средняя з/п
//    - объем продаж
//    - напечатать список сотрудников
public interface Company {
    //methods , only signature without body of methods
    boolean addEmployee(Employee employee);
    Employee removeEmployee(int id);
    Employee findEmployee(int id);
    int quantity();
    void printEmployee();
    Iterable<Employee> findEmployeesHoursGreaterThan(int hours);
    Iterable<Employee> findEmployeesSalaryRange(int minSalary, int maxSalary);

}
