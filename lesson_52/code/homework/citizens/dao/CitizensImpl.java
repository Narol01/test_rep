package homework.citizens.dao;

import homework.citizens.model.Person;
import practice.company_v3.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;

public class CitizensImpl implements Citizens{
    List<Person> idList;
    List<Person> lastNameLIst;
    List<Person> ageList;

    public CitizensImpl(){
        lastNameLIst=new ArrayList<>();
        idList=new ArrayList<>();
        ageList=new ArrayList<>();
    }
    public CitizensImpl(List<Person> citizens) {
    }
    @Override
    public boolean add(Person person) {
        if(person == null || find(person.getId()) != null) {
            return false;
        }
        idList.add(person); // добавили в список сотрудника (элемент списка)
        return true;
    }

    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if (victim != null) { // а надо ли это проверять?
            idList.remove(victim);
            return true;
        }
        return false;
    }

    @Override
    public Person find(int id) {

        for (Person e : idList) { // e - это employee из списка employees
            if (e.getId() == id) {
                return e; // вернули найденный элемент
            }
        }
        return null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        return findByPredicate(p->p.getAge()>minAge && p.getAge()<maxAge );
    }

    @Override
    public Iterable<Person> find(String lastName) {
        return findByPredicate(p->p.getLastName().equals(lastName));
    }
    private Iterable<Person> findByPredicate(Predicate<Person> predicate) {
        List<Person> res = new ArrayList<>();
        //перебираем вектор списков продуктов, находим то, что подходит по условию
        for (Person p : idList) {
            if (predicate.test(p)) {
                res.add(p);
            }
        }
        return res;
    }
    static Comparator<Person> lastNameComparator(){
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (o1.getLastName().compareTo(o2.getLastName()));
            }
        };
        return comparator;
    }
    static Comparator<Person> ageComparator(){
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        return comparator;
    }

    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return null;
    }

    @Override
    public int size() {
        return idList.size();
    }
}
