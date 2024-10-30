package PolyMorphism;

abstract class Car {

    // it makes a method declarable so inheriting class can define it
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("play Music..");
    }
}

abstract class WagonR extends Car {

    public void drive() {
        System.out.println("Driving..");
    }
}

class UpdateWagonR extends WagonR { // concrete class

    @Override
    public void fly() {
        System.out.println("Flying..");
        // throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

}

public class AbstractKeyword {
    public static void main(String[] args) {

        // we cannot create object of abstract class
        Car obj = new UpdateWagonR();

        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
