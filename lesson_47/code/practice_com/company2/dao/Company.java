package practice_com.company2.dao;

import practice_com.company2.model.Employee;

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
    double totalSalary();
    double avgSalary();
    double totalSales();
    void printEmployee();
    Employee[ ] findEmployeesHoursGreaterThan(int hours);
    Employee[ ] findEmployeesSalaryRange(int minSalary, int maxSalary);

}
