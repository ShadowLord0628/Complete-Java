package CollectionAPI;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    // public int compareTo(Student that) {
    // if (this.age > that.age)
    // return 1;
    // else
    // return -1;
    // }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;

    }

}

public class Comparables {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();

        studs.add(new Student(12, "Ram"));
        studs.add(new Student(22, "Rahul"));
        studs.add(new Student(10, "Samir"));
        studs.add(new Student(18, "Rakhi"));
        studs.add(new Student(24, "Sandip"));

        System.out.println("Before Sorting:");
        for (Student s : studs)
            System.out.println(s);

        Collections.sort(studs);

        System.out.println("After Sorting:");
        for (Student s : studs)
            System.out.println(s);
    }
}
