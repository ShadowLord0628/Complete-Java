package CollectionAPI;

import java.util.Iterator;
import java.util.Set;
// import java.util.HashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<Integer>();
        // For sorted values:
        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(6);
        nums.add(5);
        nums.add(2);
        nums.add(6);
        nums.add(3);

        Iterator<Integer> it = nums.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // for (Object n : nums) {
        // int num = (Integer) n;
        // System.out.println(num);
        // }

        System.out.println();
        System.out.println(nums);

    }
}
