public class ShiftArrayElements {
    public static void shiftLeft(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return; // No need to shift if array is empty or has only one element
        }

        int firstElement = nums[0];

        // Shift elements to the left
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        // Place the first element at the end
        nums[nums.length - 1] = firstElement;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + java.util.Arrays.toString(nums));

        shiftLeft(nums);

        System.out.println("Array after left shift: " + java.util.Arrays.toString(nums));
    }
}
