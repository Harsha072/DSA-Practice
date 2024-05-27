public class Employee {
    static int totalEmployees;
    static String companyName;
    private int id;
    private String name;
    private double salary;
    static {
        totalEmployees = 67000;
        companyName = "HCL";
    }
    {
        int id;
        String name ;
        int Salary;

    }
    Employee(int id, double salary, String name){
         this.id = id;
         this.salary = salary;
         this. name = name;
    }

    public static void main(String[] args) {
        Employee e = new Employee(2, 34.77, "harsha");
        Employee e1 = new Employee(2, 34.77, "vikas");
        System.out.println("employee 1"+ e.name);
        System.out.println("employee 2"+ e1.name);
        System.out.println("company name"+ Employee.companyName);

    }
}
