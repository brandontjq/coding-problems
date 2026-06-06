package others;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void test() {
        Student s1 = new Student("Brandon", 34, "3A");
        Student s2 = new Student("Elvina", 32, "2B");
        Student s3 = new Student("Misty", 5, "1A");
        Student s4 = new Student("Peridot", 5, "1C");
        Student s5 = new Student("Dumpling", 9, "1A");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        //This is for Comparator implementation
        //students.sort(Comparator.comparing(Student::getClassId).reversed());
        students.sort(new StudentComparator());

        //This is for Comparable implementation
        //Collections.sort(students);

        System.out.println(students);

    }
}