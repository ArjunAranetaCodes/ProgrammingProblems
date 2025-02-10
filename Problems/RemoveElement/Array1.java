import java.util.*;

public class Array1 {
    //Simple remove element, copy to new
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int[] newNums = new int[nums.length - 1];
        int intToRemove = 3;
        int numsLength = nums.length;

        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < numsLength; i++){
            System.out.println(nums[i]);
            if(nums[i] == intToRemove){
                for(int j = i; j < numsLength - 1; j++){
                    newNums[j] = nums[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(newNums));
    }
}