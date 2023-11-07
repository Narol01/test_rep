package practice.highSchool.dao;

import homework.book1.model.Book;
import practice.highSchool.model.Member;

public class HighSchoolImpl implements HighSchool {
    Member[] members;
    int size;

    public HighSchoolImpl(int capacity){
        members=new Member[capacity];
    }

    @Override
    public boolean addMember(Member member) {
        if(member == null || size == members.length || findMember(member.getId()) != null){
            return false;
        }
        members[size]=member;
        size++;
        return true;
    }

    @Override
    public Member removeMember(int id) {
        for (int i = 0; i < size; i++) {
            if(members[i].getId()==id){
                Member victim=members[i];
                members[i]=members[size-1];// на место найденного поставили последнего кто естi in
                members[size-1]=null;// ОБНУЛИЛИ ПОСЛЕДНЕГО
                size --;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Member findMember(int id) {
        for (int i = 0; i < size; i++) {
            if(members[i].getId()==id){
                return members[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printMembers() {
        for (int i = 0; i < size; i++) {
            System.out.println(members[i]);
        }

    }
}
