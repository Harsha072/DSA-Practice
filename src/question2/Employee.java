package question2;

public class Employee {

    private String name;
    private int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

}
class Manager extends Employee{

    private String department;

    Manager(String name, int age, String department){
        super(name,age);
        this.department=department;
    }
}
