package ArraysFolder.ArrayOfObjects;

class Student {
    int rollNo;
    String name;
    int marks;
}

public class ObjectsArray {
    public static void main(String[] args) {

        // ! Array of Object Student
        Student students[] = new Student[3];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        // Student 1
        students[0].rollNo = 1;
        students[0].name = "Harsh";
        students[0].marks = 55;

        // Student 2
        students[1].rollNo = 2;
        students[1].name = "Rahul";
        students[1].marks = 66;

        // Student 3
        students[2].rollNo = 3;
        students[2].name = "Rajesh";
        students[2].marks = 44;

        System.out.println("=============Students List===========");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Roll No: " + students[i].rollNo);
            System.out.println("Name: " + students[i].name);
            System.out.println("Marks: " + students[i].marks);
            System.out.println();
        }
    }
}
