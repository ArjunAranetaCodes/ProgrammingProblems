public class MoveZeroes {
    public static void move(int[] nums){
        int nonZeroIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;

                nonZeroIndex++;
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        move(nums);

        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}