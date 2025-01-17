public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        // Edge case: If the array has only one element or is empty
        if (nums.length == 0) return 0;

        // Initialize the slow pointer
        int slow = 0;

        // Traverse the array with the fast pointer
        for (int fast = 1; fast < nums.length; fast++) {
            // Check if the current number is different from the last unique number
            if (nums[fast] != nums[slow]) {
                slow++; // Move the slow pointer
                nums[slow] = nums[fast]; // Update the value at the slow pointer
            }
        }

        // The number of unique elements is slow + 1
        return slow + 1;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.println("k = " + k1 + ", nums = " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums1, k1)));

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.println("k = " + k2 + ", nums = " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums2, k2)));
    }
}
