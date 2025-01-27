package Task10;

//-----------------------------------
// Task 10. Create class employee, fields 
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public int getAge() {
        return this.age;
    }

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee(){
        System.out.println("----------------------");
        System.out.println("Name: " + this.fullName);
        System.out.println("Position: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Salary:" + this.salary);
        System.out.println("Age:" + this.age);

    }


    
}
