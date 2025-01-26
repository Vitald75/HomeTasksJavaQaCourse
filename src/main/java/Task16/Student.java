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

    public void printStudent() {
        System.out.println("Students name:" + name + ", age:" + age + ", AVG Grade:" + avgGrade);
    }

}
