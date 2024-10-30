package Encapsulation;

class Human {

    // Every instance variable -> make it private
    // only accessible in class
    private int age;
    private String name;

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

public class Encapsulation {
    public static void main(String[] args) {

        Human obj = new Human();
        obj.setAge(21);
        // obj.age = 20;
        obj.setName("Harsh");
        // obj.name = "Harsh";

        // System.out.println(obj.name);

        System.out.println(obj.getName() + " : " + obj.getAge());

    }

}