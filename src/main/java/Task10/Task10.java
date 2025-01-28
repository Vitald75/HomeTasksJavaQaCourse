package Task10;

public class Task10 {       // Task 10. Array of employees
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Smith", "CEO", "smth@mail.com", "825221521", 1000, 38);
        Employee employee2 = new Employee("Simba", "deputy chief", "simba@mail.com", "825221521", 800, 33);
        Employee employee3 = new Employee("Kiara", "accountant", "simba@mail.com", "825221521", 800, 48);
        Employee employee4 = new Employee("Shram", "manager", "simba@mail.com", "825221521", 800, 45);
        Employee employee5 = new Employee("Kala", "waiter", "simba@mail.com", "825221521", 500, 21);
        Employee[] array = {employee1, employee2, employee3, employee4, employee5};
        for (Employee employee : array) {
            if (employee.getAge()>40) {
                System.out.println(employee);
            }
        }
    }
}
