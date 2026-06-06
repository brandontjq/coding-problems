package others;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String classId;

    public Student(String name, int age, String classId) {
        this.name = name;
        this.age = age;
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassId() {
        return classId;
    }

    @Override
    public int compareTo(Student o2) {
        int classCompare = this.getClassId().compareTo(o2.getClassId());
        if (classCompare != 0) {
            return classCompare;
        }

        int ageCompare = Integer.compare(this.getAge(), o2.getAge());
        if (ageCompare != 0) {
            return ageCompare;
        }
        return this.getName().compareTo(o2.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(classId, student.classId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, classId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classId='" + classId + '\'' +
                '}';
    }
}
