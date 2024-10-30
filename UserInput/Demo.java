package UserInput;

import java.io.IOException;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number : ");
        // try {
        // int num = System.in.read(); // only reads one character
        // System.out.println(num);
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close(); // good practice

        // ? Scanner Method

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);

        sc.close();
    }
}
