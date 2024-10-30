class Computer {

    // defining the method
    // ? <access> <return> <method_name>
    public void playMusic() {
        System.out.println("Music Playing..");
    }

    public String getMePen(int cost) {
        if (cost >= 10) {
            System.out.println("Cost: " + cost);
            return "Pen";
        }

        return "Nothing";
    }

}

public class Methods {
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.playMusic();
        System.out.println();
        String str = obj.getMePen(10);
        System.out.println(str);

    }
}
