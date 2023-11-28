package practice_com.company2.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_com.company2.dao.Company;
import practice_com.company2.dao.CompanyArrayListAppl;
import practice_com.company2.model.Employee;
import practice_com.company2.model.Manager;
import practice_com.company2.model.SalesManager;
import practice_com.company2.model.Worker;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] e;

    @BeforeEach
    void setUp() {
        company = new CompanyArrayListAppl(5);
        e = new Employee[4];
        e[0] = new Manager(100,"Jhon","Smith",35,160,2,"'2'-Bakalavr",5000,5);
        e[1] = new SalesManager(101,"Anna","Black",46,160,7,"'3'-Magistrate",25000,0.1);
        e[2] = new SalesManager(102,"Thomas","White",21,160,1,"'1'-School",30000,0.1);
        e[3] = new Worker(103,"Hans","Bauer",30,160,5,"'0'- without",5);

        // dobavim element massiva v kompani
        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);
        }
    }

    @Test
    void addEmployee() {
        // не можем добавить null
        assertFalse(company.addEmployee(null));
        // не можем добавить второй раз, уже существующий
        assertFalse(company.addEmployee(e[1]));
        Employee employee1 = new Manager(105, "Ivan", "Dubin", 55, 160,5,"'0'- without", 6000, 6); // создали нового сотрудника
        assertTrue(company.addEmployee(employee1)); // добавили нового сотрудника
        assertEquals(5, company.quantity()); // теперь в компании 5 сотрудников
        // создаем еще одного нового
        Employee employee2 = new Manager(106, "Peter", "Dubin", 55, 160,5,"'0'- without", 6000, 6); // создали нового сотрудника
        assertFalse(company.addEmployee(employee2)); // не можем превысить capacity
        assertEquals(5, company.quantity());
    }

    @Test
    void removeEmployee() {
        // удаляем сотрудника
        assertEquals(e[2] ,company.removeEmployee(102));
        assertEquals(3, company.quantity()); // сотрудников стало на 1 меньше (4 - 1)
        assertNull(company.removeEmployee(102)); // дважды не можем удалить
        assertNull(company.findEmployee(102)); // не можем найти после удаления
    }

    @Test
    void findEmployee() {
        // ищем сотрудника по id
        assertEquals( e[2], company.findEmployee(102));
        // ищем несуществующего сотрудника
        assertNull(company.findEmployee(105));
    }

    @Test
    void quantityTest() {
        assertEquals(4,company.quantity());
    }

    @Test
    void totalSalaryTest() {
        assertEquals(12100,company.totalSalary());
    }

    @Test
    void avgSalaryTest() {
        assertEquals(3025,company.avgSalary(),0.01);
    }

    @Test
    void totalSales() {
        assertEquals(55000,company.totalSales());
    }

    @Test
    void printEmployees() {
        company.printEmployee();
    }

    @Test
    void findEmployeesHoursGreaterThan() {
        Employee[] actual = company.findEmployeesHoursGreaterThan(100);
        Employee[] expexted ={e[0],e[1],e[2],e[3]};
        assertArrayEquals(expexted,actual);
    }

    @Test
    void findEmployeesSalaryRange() {
        company.printEmployee();
        Employee[] actual = company.findEmployeesSalaryRange(2900,6000);
        Employee[] expexted ={e[0],e[2]};
        assertArrayEquals(expexted,actual);
    }
}