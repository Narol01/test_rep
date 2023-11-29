package Mini_Marafon.highSchool.dao;

import Mini_Marafon.highSchool.model.Member;

public interface HighSchool {
    boolean addMember(Member member);
    Member removeMember(int id);
    Member findMember(int id);
    int quantity();
    void printMembers();
}
