package CollectionAPI;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {

        // Comparator<Integer> com = new Comparator<Integer>() {
        // public int compare(Integer i, Integer j) {
        // if (i % 10 > j % 10)
        // return 1;
        // else
        // return -1;
        // }
        // };

        // Using lambda Expressions
        Comparator<Integer> com = (i, j) -> (i % 10 > j % 10) ? 1 : -1;

        List<Integer> nums = new ArrayList<>();

        nums.add(41);
        nums.add(92);
        nums.add(10);
        nums.add(73);
        nums.add(84);

        // Collections.sort(nums); // normal sorting

        // Customized Sorting
        Collections.sort(nums, com);

        System.out.println(nums);
    }
}
