package Task16;

import java.util.*;

public class Task16 {
    public static <Student> List<Student> convertArrayToList(Student[] array)  {
        List<Student> list = new ArrayList<>();
        for (Student student : array) {
            list.add(student);
        }
        return list;
    }

    public static void main(String[] args) {

        Student student1 = new Student("John", 19, 8.5);
        Student student2 = new Student("Angel", 18, 9.0);
        Student student3 = new Student("William", 20, 9.0);
        Student student4 = new Student("Alex", 19, 7.5);
        Student student5 = new Student("Serge", 18, 7.9);
        Student student6 = new Student("Messi", 17, 8.8);
        Student student7 = new Student("Milena", 23, 9.0);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};

        System.out.println("--------Initial array---------------");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("--------array sorted by default toCompare from the Class---------------");
        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("--------array sorted by Comparator Grade---------------");
        Comparator<Student> comparatorByGrade = new StudentsGradeComparator();
        Arrays.sort(students, comparatorByGrade);
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("--------array sorted by Comparator Name---------------");
        Comparator<Student> comparatorByName = new StudentsNameComparator();
        Arrays.sort(students, comparatorByName);
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("--------array sorted by Complex Comparator Grade + Name---------------");
        Comparator<Student> complexComparatorGradeThenName = Comparator
                .comparingDouble(Student::getAvgGrade)
                .thenComparing(Student::getName);
        Arrays.sort(students, complexComparatorGradeThenName);
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("--------Only students with avgGrade > 8, using previous sorting ---------------");
        for (Student student : students) {
            if (student.getAvgGrade()>8) System.out.println(student);
        }


        System.out.println("--------List sorted by  Name---------------");
        List<Student> studentsList = convertArrayToList(students);
        Comparator<Student> comparatorListByName = Comparator
                .comparing(Student::getName);
        studentsList.sort(comparatorListByName);
        System.out.println(studentsList);

        /**
         Cуть я понял и все как бы правильно =)
        Но
        1. Создай плиз отдельный класс-компаратор который имплементит Comparator<Student> и сортируй с помощью его
        2. Как вариант сортировки по имени можно сделать через Comparable
        3. И в качестве задания со звездочкой сделать (и понять как работает) из массива список и в нем вызвать
        .sort(Comparator.comparing(Student::getName));
        */

        /*
        сделал все три,
        с использованием лямбды разберусь в процессе следующего задания, (это к понимаю Student::getName)
        */

    }
}
