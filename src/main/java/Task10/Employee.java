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

    /*все круто, но не printEmployee()
    к классе Employee переопредели метод toString()
    и тогда ты сможешь просто сделать System.out.println(employee) и он нормально тебе распечатает на консоль
    * */

    @Override
    public String toString(){
        return this.fullName + " - " + this.position + " - " + this.email + " - Age:" + this.age + " - Salary:" + this.salary;
    }

}
