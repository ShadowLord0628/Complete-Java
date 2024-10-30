package ArraysFolder;

public class forEachLoop {
    public static void main(String[] args) {
        int nums[] = new int[4];

        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 6;
        nums[3] = 7;

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
