package practice.citizens_v2.dao;

import practice.citizens_v2.model.Person;
import practice.movie.model.Movie;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class CitizensHashSetImpl implements Citizens {

    HashSet<Person> idList;
    HashSet<Person> lastNameList;
    HashSet<Person> ageList;
    static Comparator<Person> lastNameComparator = (p1, p2) -> {
        return p1.getLastName().compareTo(p2.getLastName());
    };

    static Comparator<Person> ageComparator = (p1, p2) -> {
        return Integer.compare(p1.getAge(), p2.getAge());
    };
    public CitizensHashSetImpl(List<Person> citizens) {
        idList = new HashSet<>(); // создаем пустой лист
        lastNameList = new HashSet<>();
        ageList = new HashSet<>();
        for (Person person : citizens) {
            citizens.forEach(this::add);
        }
    }

    @Override
    public boolean add(Person person) {
        return person != null && idList.add(person) && lastNameList.add(person) && ageList.add(person) ;
    }

    @Override
    public boolean remove(int id) {
        Person person=find(id);
        return person!=null && idList.remove(person) && lastNameList.remove(person) && ageList.remove(person);
    }

    @Override
    public Person find(int id) {
        for (Person p : idList) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
//        List<Person> foundByAge = new ArrayList<>();
//        for (Person p : idList) {
//            if(p.getAge()>=minAge  && p.getAge()<=maxAge) {
//                foundByAge.add(p);
//            }
//        }
//        return foundByAge;
        return idList.stream().filter(p->p.getAge()>=minAge  && p.getAge()<=maxAge).collect(Collectors.toList());
    }

    @Override
    public Iterable<Person> find(String lastName) {
        return idList.stream().filter(p->p.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList());

    }

    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        idList.stream().sorted(Person::compareTo);
        return idList;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        List<Person> sortedList = new ArrayList<>(ageList);
        //for(Person p:ageList){
        //sortedList.add(p);
        // }
        sortedList.sort(ageComparator);
        return sortedList;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        List<Person> sortedList=new ArrayList<>(lastNameList);
        sortedList.sort(lastNameComparator);
        return sortedList;
    }

    @Override
    public int size() {
        return idList.size();
    }
}
