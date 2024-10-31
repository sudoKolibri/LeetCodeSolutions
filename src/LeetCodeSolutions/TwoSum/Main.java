package LeetCodeSolutions.TwoSum;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 15, 11, 7, 3, 6};
        int target = 9;

        try {
            int[] result = solution.twoSum(nums, target);

            if (result != null && result.length == 2) {
                System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("No solution found.");
        }
    }
}
