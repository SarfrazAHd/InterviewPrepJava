package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparator {
    public static void main(String[] args) {
        List<Student>  studentList = Arrays.asList(
                new Student("Elephant",23,"Seventeen","CSE"),
                new Student("Zebra",12,"Fifth","ECE"),
                new Student("Cat",7,"Second","CIVIL"),
                new Student("Apple",30,"Twenty","Mechanical")
                );
//        Collections.sort(studentList);
//        System.out.println(studentList);

        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return  s1.getName().compareTo(s2.getName());
            }
        };

        Comparator<Student> ageComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Comparator<Student> standardComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStandard().compareTo(o2.getStandard());
            }
        };

        Comparator<Student> courseComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse().compareTo(o2.getCourse());
            }
        };

        Collections.sort(studentList,courseComparator);
        System.out.println(studentList);
    }
}

class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student student) {
        return this.getCourse().compareTo(student.getCourse());

    }

    public Student(String name, int age, String standard, String course) {
        this.name = name;
        this.age = age;
        this.standard = standard;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", standard='" + standard + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    private String name;
    private int age;
    private String standard;
    private String course;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStandard() {
        return standard;
    }

    public String getCourse() {
        return course;
    }
}