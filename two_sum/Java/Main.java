package two_sum.Java;

public class Main {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                if (a + b == target) {
                    result[0] = i;
                    result[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] results = twoSum(nums, 9);
        for (var el : results) {
            System.out.printf("%d ", el);
        }
        System.out.println("");
    }
}
