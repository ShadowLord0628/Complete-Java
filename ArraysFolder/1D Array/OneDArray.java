public class OneDArray {
    public static void main(String[] args) {
        int nums[] = { 3, 7, 2, 4 };

        System.out.println("Individual numbers");
        System.out.println(nums[0]); // output: 3
        System.out.println(nums[1]); // output: 7

        System.out.println("\nUsing for loop:");

        for (int num : nums) {
            System.out.println(num);
        }

        int nums2[] = new int[4]; // all values will be set to 0

        nums2[0] = 2;
        nums2[1] = 7;
        nums2[2] = 5;
        nums2[3] = 9;
        System.out.println("\nDynamic array");
        for (int num : nums2) {
            System.out.println(num);
        }
    }
}