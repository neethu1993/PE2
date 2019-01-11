package com.stackroute.pe2;

public class MemberVariable {
    Member member;
    public MemberVariable(){
        member = new Member();
    }
    /*
    method to get and set the name, age and salary
     */
    public String memberName(String name) {
        member.setName(name);
        return member.getName();
    }
    public int memberAge(int age) {
        member.setAge(age);
        return member.getAge();
    }
    public long memberSalary(long salary) {
        member.setSalary(salary);
        return member.getSalary();
    }
}
