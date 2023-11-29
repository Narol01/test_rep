package Mini_Marafon.highSchool.tests;

import Mini_Marafon.highSchool.dao.HighSchool;
import Mini_Marafon.highSchool.dao.HighSchoolHashImpl;
import Mini_Marafon.highSchool.model.Aspirant;
import Mini_Marafon.highSchool.model.Member;
import Mini_Marafon.highSchool.model.Professor;
import Mini_Marafon.highSchool.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighSchoolImplTest {

    HighSchool highSchool;

    Member[] members;

    @BeforeEach
    void setUp() {
        highSchool=new HighSchoolHashImpl();
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
    }

    @Test
    void removeMember() {
        Assertions.assertEquals(members[1] ,highSchool.removeMember(2));
        assertEquals(2, highSchool.quantity());
        assertNull(highSchool.removeMember(2));
        assertNull(highSchool.findMember(2));
    }

    @Test
    void findMember() {
        Assertions.assertEquals( members[1], highSchool.findMember(2));
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