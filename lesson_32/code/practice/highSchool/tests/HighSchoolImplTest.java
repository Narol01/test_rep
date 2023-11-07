package practice.highSchool.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.highSchool.dao.HighSchoolImpl;
import practice.highSchool.model.Aspirant;
import practice.highSchool.model.Member;
import practice.highSchool.model.Professor;
import practice.highSchool.model.Student;

import static org.junit.jupiter.api.Assertions.*;

class HighSchoolImplTest {

    HighSchoolImpl highSchool;

    Member[] members;

    @BeforeEach
    void setUp() {
        highSchool=new HighSchoolImpl(4);
        members=new Member[3];
        members[0]=new Student(1,"Oleg","Pyt",4.3,true);
        members[1]=new Aspirant(2,"liza","Sin","IT");
        members[2]=new Professor(3,"Roman","Riks","Fisik",3000);

        for (int i = 0; i < members.length; i++) {
            highSchool.addMember(members[i]);
        }
    }

    @Test
    void addMember() {
        assertFalse(highSchool.addMember(null));
        assertFalse(highSchool.addMember(members[2]));
        Member member1 = new Aspirant(4,"Katya","Sin","IT");
        assertTrue(highSchool.addMember(member1));
        assertEquals(4, highSchool.quantity());
        Member member2 = new Student(5,"Эдгар","Allan",3.1,false);
        assertFalse(highSchool.addMember(member2));
    }

    @Test
    void removeMember() {
        assertEquals(members[1] ,highSchool.removeMember(2));
        assertEquals(2, highSchool.quantity());
        assertNull(highSchool.removeMember(2));
        assertNull(highSchool.findMember(2));
    }

    @Test
    void findMember() {
        assertEquals( members[1], highSchool.findMember(2));
        assertNull(highSchool.findMember(7));
    }

    @Test
    void quantity() {assertEquals(3,highSchool.quantity());
    }

    @Test
    void printMembers() {
        highSchool.printMembers();
    }
}