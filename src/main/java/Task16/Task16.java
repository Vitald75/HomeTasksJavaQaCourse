package Task16;

import java.util.Arrays;
import java.util.Comparator;

public class Task16 {
    public static void main(String[] args) {

        Student student1 = new Student("John", 19, 8.5);
        Student student2 = new Student("Angel", 18, 9.0);
        Student student3 = new Student("William", 20, 9.8);
        Student student4 = new Student("Alex", 19, 7.5);
        Student student5 = new Student("Serge", 18, 7.9);
        Student student6 = new Student("Messi", 17, 8.8);
        Student student7 = new Student("Milena", 23, 9.2);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};

        System.out.println("--------Initial array---------------");
        for (Student student : students) {
            student.printStudent();
        };

        /**
         Cуть я понял и все как бы правильно =)
        Но
        1. Создай плиз отдельный класс-компаратор который имплементит Comparator<Student> и сортируй с помощью его
        2. Как вариант сортировки по имени можно сделать через Comparable
        3. И в качестве задания со звездочкой сделать (и понять как работает) из массива список и в нем вызвать
        .sort(Comparator.comparing(Student::getName));
        */

        Arrays.sort(students, new Comparator<Student>() {  //Sort by student's name
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName()); // o1.getAge() - o2.getNAge();
            }
        });

        System.out.println("--------Only students with avgGrade>8 ---------------");
        for (Student student : students) {
            if (student.getAvgGrade()>8) student.printStudent();
        };

        // in case if we need to sort by Age
        /*  Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    */

    }
}
