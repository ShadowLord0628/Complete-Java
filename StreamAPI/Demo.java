package StreamAPI;

import java.util.List;
// import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // returns a new stream with
        // values that satisfy the condition
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // int result = s3.reduce(0, (c, e) -> c + e);

        // int result = nums.stream()
        // .filter(n -> n % 2 == 0)
        // .map(n -> n * 2)
        // .reduce(0, (c, e) -> c + e);
        // s3.forEach(n -> System.out.println(n));

        Stream<Integer> sortedValues = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 5 / 2)
                .sorted();

        sortedValues.forEach(n -> System.out.println(n));

        // Consumer<Integer> con = n -> System.out.println(n);

        // nums.forEach(con);

        // int sum = 0;
        // for (int n : nums) {
        // if (n % 2 == 0) {
        // n *= 2;
        // sum += n;
        // }
        // }

        // System.out.println(sum);

        // nums.forEach(n -> System.out.println(n));
        // forEach method like in js
    }
}
