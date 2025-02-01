package Task16;

public class Student {
    private String name;
    private int age;
    private double avgGrade;

    public Student (String name, int age, double avgGrade) {
        this.name = name;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public double getAvgGrade(){
        return this.avgGrade;
    }

    /**Для вывода студента в консоль имелось в виду, надо переопределить метод toString()
    И из класса, где есть метод run вызывать System.out.println(student);
    }*/
    public void printStudent() {
        System.out.println("Students name:" + name + ", age:" + age + ", AVG Grade:" + avgGrade);
    }

}
