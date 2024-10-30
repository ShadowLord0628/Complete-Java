package ExceptionHandling;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TryWithRes {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = null;
        // try {
        // InputStreamReader in = new InputStreamReader(System.in);
        // br = new BufferedReader(in);
        // int j = Integer.parseInt(br.readLine());
        // System.out.println(j);
        // System.out.println("Bye in try");
        // } catch (Exception e) {
        // System.out.println("Something went wrong..");
        // } finally {
        // // close the resources
        // br.close();
        // System.out.println("Bye in finally");
        // }

        // New version
        // ! Try with Resources

        System.out.print("Enter a number : ");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
