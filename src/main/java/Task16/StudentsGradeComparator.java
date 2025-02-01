package Task16;

import java.util.Comparator;

public class StudentsGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        return (int) (st1.getAvgGrade()*10 - st2.getAvgGrade()*10);
    }
}


