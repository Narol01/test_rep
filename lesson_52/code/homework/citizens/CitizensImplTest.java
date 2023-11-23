package homework.citizens;

import homework.citizens.dao.Citizens;
import homework.citizens.dao.CitizensImpl;
import homework.citizens.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CitizensImplTest {
    Citizens citizen;

    static final LocalDate now=LocalDate.now();

    @BeforeEach
    void SetUp(){
        citizen=new CitizensImpl(List.of(
                new Person(1,"Peter","Jackson",now.minusYears(23)),
                new Person(2,"John","Smith",now.minusYears(20)),
                new Person(3,"Mary","Jackson",now.minusYears(23)),
                new Person(4,"Bruce","Wills",now.minusYears(25))
        ));
    }
    @Test
    void add() {
        assertFalse(citizen.add(null));
        assertFalse(citizen.add(new Person(2,"John","Smith",now.minusYears(20))));
        assertEquals(4,citizen.size());
        assertTrue(citizen.add(new Person(5,"Jack","Willis",now.minusYears(25))));
        assertEquals(4,citizen.size());
    }

    @Test
    void remove() {
        assertFalse(citizen.remove(5));
        assertEquals(4,citizen.size());
        assertTrue(citizen.remove(4));


    }

    @Test
    void find() {
        Person person=citizen.find(1);
        assertEquals(1,person.getId());
        assertEquals("Peter",person.getFirstName());
        assertEquals("Jackson",person.getLastName());
        assertEquals(23,person.getAge());
        assertNull(citizen.find(5));
    }

    @Test
    void testFindByLastName() {
        Iterable<Person> person=citizen.find("Jackson");
        List<Person> actual=new ArrayList<>();
        for(Person p:person){
            actual.add(p);
        }
        Collections.sort(actual);//сортируем в порядке возрастания по ид
        List<Person> expected=List.of(
                new Person(1,"Peter","Jackson",now.minusYears(23)),
                new Person(3,"Mary","Jackson",now.minusYears(23)));
        assertIterableEquals(expected,actual);
    }

    @Test
    void testFindByAge() {
        Iterable<Person> person=citizen.find(19,23);
        List<Person> actual=new ArrayList<>();
        for(Person p:person){
            actual.add(p);
        }
        Collections.sort(actual);//сортируем в порядке возрастания по ид
        List<Person> expected=List.of(
                new Person(1,"Peter","Jackson",now.minusYears(23)),
                new Person(2,"John","Smith",now.minusYears(20)),
                new Person(3,"Mary","Jackson",now.minusYears(23)));
        assertIterableEquals(expected,actual);
    }


    @Test
    void getAllPersonSortedById() {
        //что отберутся все персоны,что все они отсортированы по айди,
        // то есть айди текущего он должен быть меньше чем айди следующего.
        Iterable<Person> person=citizen.getAllPersonSortedById();
        int id=-1;
        int count=0;
        for (Person p:person){
            count++;
            assertTrue(p.getId()>id);
            id=p.getId();

        }
        assertEquals(citizen.size(),count);
        Iterable<Person> expected=List.of(
                new Person(1,"Peter","Jackson",now.minusYears(23)),
                new Person(2,"John","Smith",now.minusYears(20)),
                new Person(3,"Mary","Jackson",now.minusYears(23)),
                new Person(4,"Bruce","Wills",now.minusYears(25))
        );
        assertIterableEquals(expected,person);

    }

    @Test
    void getAllPersonSortedByAge() {
        Iterable<Person> person=citizen.getAllPersonSortedByAge();
        int age=-1;
        int count=0;
        for (Person p:person){
            count++;
            assertTrue(p.getAge()>=age);
            age=p.getAge();

        }
        assertEquals(citizen.size(),count);
    }

    @Test
    void getAllPersonSortedByLastName() {
        Iterable<Person> person=citizen.getAllPersonSortedByAge();
        String lastName="";
        int count=0;
        for (Person p:person){
            count++;
            assertTrue(p.getLastName().compareTo(lastName)>=0);
            lastName=p.getLastName();

        }
        assertEquals(citizen.size(),count);

    }

    @Test
    void size() {
        assertEquals(4,citizen.size());
    }
}