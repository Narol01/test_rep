package practice.highSchool.dao;

import practice.highSchool.model.Member;

public interface HighSchool {
    boolean addMember(Member member);
    Member removeMember(int id);
    Member findMember(int id);
    int quantity();
    void printMembers();
}
