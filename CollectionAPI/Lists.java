package CollectionAPI;

// import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        System.out.println(nums.get(2));

        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println(nums);
    }
}
