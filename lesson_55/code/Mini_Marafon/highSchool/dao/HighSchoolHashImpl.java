package Mini_Marafon.highSchool.dao;

import Mini_Marafon.highSchool.model.Member;

import java.util.HashSet;
import java.util.List;

public class HighSchoolHashImpl implements HighSchool{
    HashSet<Member> members;

    public HighSchoolHashImpl(){
        members= new HashSet<>();
    }
    public HighSchoolHashImpl(List<Member> memberList){
        this();
        for(Member m:memberList){
            addMember(m);
        }
    }
    @Override
    public boolean addMember(Member member) {
        return member!= null && members.add(member);
    }

    @Override
    public Member removeMember(int id) {
        Member deleted =findMember(id);
        if(deleted!=null){
            members.remove(deleted);
            return deleted;
        }
        return null;
    }

    @Override
    public Member findMember(int id) {
        for (Member m:members){
            if(m.getId()==id){
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
