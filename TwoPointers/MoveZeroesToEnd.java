import java.util.Arrays;

class MoveZeroesToEnd {
   public void moveZeroes(int[] nums) {
        int j = 0; 
        for (int i = 0; i < nums.length; i++) { 
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroesToEnd solution = new MoveZeroesToEnd();
        
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original Array: " + Arrays.toString(nums));
        
        solution.moveZeroes(nums);
        System.out.println("After moving zeroes: " + Arrays.toString(nums));
    }
}