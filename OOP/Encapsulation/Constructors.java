package Encapsulation;

class Human1 {

    // Every instance variable -> make it private
    // only accessible in class
    private int age;
    private String name;

    // ! Constructor - every time we create a new object it calls the constructor
    // Default Constructor
    public Human1() {
        // System.out.println("In constructor");
        age = 12;
        name = "John Doe";
    }

    // Parametrized Constructor
    public Human1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // To access private data we can use methods like getter and setter

    // setter:
    public void setAge(int age) {
        this.age = age;
    }
    // "this" keyword which reference to the current object who is calling the
    // method

    // getter:
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Constructors {
    public static void main(String[] args) {

        Human1 obj = new Human1();
        Human1 obj1 = new Human1(18, "Rahul");
        // obj.setAge(21);
        // obj.age = 20;
        // obj.setName("Harsh");
        // obj.name = "Harsh";

        // System.out.println(obj.name);
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

    }

}