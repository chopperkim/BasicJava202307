package chapter08;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {
    private String name;
    private int studentNo;
    private int age;

    public Student(String name, int studentNo, int age) {
        this.name = name;
        this.studentNo = studentNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("이름: %s, 학번: %d, 나이: %d\n", name, studentNo, age);
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
