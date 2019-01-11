package com.stackroute.pe2;
/*
    member variables;
*/
public class Member {
    private String Name;
    private int Age;
    private long Salary;
    /*
    getter and setter method
    */
    public String getName(){
        return Name;
    }
    public void setName( String newName){
        Name = newName;
    }

    public int getAge(){
        return Age;
    }
    public void setAge(int newAge){
        Age = newAge;
    }

    public long getSalary(){
        return Salary;
    }
    public void setSalary(long newSalary){
        Salary = newSalary;
    }

}
