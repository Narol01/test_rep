package homework.company_v3.tests;

import homework.company_v3.dao.CompanySetImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import homework.company_v3.dao.Company;
import homework.company_v3.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] e;

    @BeforeEach
    void setUp() {
        company = new CompanySetImpl();
        e = new Employee[4];
        e[0] = new Employee(100,"Jhon","Smith",35,160,2,"'2'-Bakalavr",5000,5);
        e[1] = new Employee(101,"Anna","Black",46,160,7,"'3'-Magistrate",25000,5);
        e[2] = new Employee(102,"Thomas","White",21,160,1,"'1'-School",30000,5);
        e[3] = new Employee(103,"Hans","Bauer",30,160,5,"'0'- without",5,5);

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
        assertTrue(company.addEmployee(new Employee(105, "Ivan", "Dubin", 55, 160,5,"'0'- without", 6000, 6))); // добавили нового сотрудника
        assertEquals(5, company.quantity()); // теперь в компании 5 сотрудников

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
    void printEmployees() {
        company.printEmployee();
    }

    @Test
    void findEmployeesHoursGreaterThan() {
        Iterable<Employee> persons = company.findEmployeesHoursGreaterThan(10);
        // перенесем полученных в рез-те поиска в ArrayList
        List<Employee> actual = new ArrayList<>();
        for (Employee person : persons) {
            actual.add(person);
        }
        Collections.sort(actual); // сортируем по id
        List<Employee> expected = List.of (
                e[0] = new Employee(100,"Jhon","Smith",35,160,2,"'2'-Bakalavr",5000,5),
        e[1] = new Employee(101,"Anna","Black",46,160,7,"'3'-Magistrate",25000,5),
        e[2] = new Employee(102,"Thomas","White",21,160,1,"'1'-School",30000,5),
        e[3] = new Employee(103,"Hans","Bauer",30,160,5,"'0'- without",1000,6)
        );
        assertIterableEquals(expected, actual);
    }

    @Test
    void findEmployeesSalaryRange() {
        Iterable<Employee> persons = company.findEmployeesSalaryRange(2000, 29000);
        // перенесем полученных в рез-те поиска в ArrayList
        List<Employee> actual = new ArrayList<>();
        for (Employee person : persons) {
            actual.add(person);
        }
        Collections.sort(actual); // сортируем по id
        List<Employee> expected = List.of (
                new Employee(100,"Jhon","Smith",35,160,2,"'2'-Bakalavr",5000,5),
                new Employee(101,"Anna","Black",46,160,7,"'3'-Magistrate",25000,5)
        );
        assertIterableEquals(expected, actual);
    }
}