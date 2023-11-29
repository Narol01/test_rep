package Mini_Marafon.highSchool.dao;

import Mini_Marafon.highSchool.model.Member;

import java.util.LinkedList;
import java.util.List;

public class HighSchoolListImpl implements HighSchool {
    List<Member> members;

    public HighSchoolListImpl(){
        members=new LinkedList<>();
    }
    @Override
    public boolean addMember(Member member) {
        if(member==null || members.contains(member)){
            return false;}
        return members.add(member);
    }

    @Override
    public Member removeMember(int id) {
        Member removed=findMember(id);
        members.remove(removed);
        return removed;
    }

    @Override
    public Member findMember(int id) {
        for (Member m : members) {
            if(m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return members.size();
    }

    @Override
    public void printMembers() {
   for (Member m : members){
       System.out.println(m);
   }
    }
}
