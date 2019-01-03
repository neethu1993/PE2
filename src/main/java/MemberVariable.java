
public class MemberVariable {
    Member object;
    public MemberVariable(){
        object = new Member();
    }
    public String MemberName(String name){
        object.name = name;
        return object.name;

    }
    public int MemberAge(int age){
        object.age = age;
        return object.age;

    }
    public String MemberSalary(String salary){
        object.salary = salary;
        return object.salary;

    }
}
