package others;

import java.util.*;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        int classCompare =
                s1.getClassId().compareTo(s2.getClassId());

        if (classCompare != 0) {
            return classCompare;
        }

        int ageCompare =
                Integer.compare(s1.getAge(), s2.getAge());

        if (ageCompare != 0) {
            return ageCompare;
        }

        return s1.getName().compareTo(s2.getName());
    }
}
