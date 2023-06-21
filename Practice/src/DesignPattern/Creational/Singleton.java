package DesignPattern.Creational;

public class Singleton {
    public static void main(String[] args) {
        Student st1 = Student.getInstance();
        Student st2 = Student.getInstance();
        Student st3 = Student.getInstance();
        Student st4 = Student.getInstance();
    }

}

class Student {
    private static Student instance;

    private Student() {
        System.out.println("Student constructor");
    }

    public static Student getInstance() {
        if (instance == null) return instance = new Student();
        else return instance;
    }
}