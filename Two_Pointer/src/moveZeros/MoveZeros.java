package moveZeros;

// Link to leetcode Problem -> https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75
public class MoveZeros {

    public void solution(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[j] == 0 && nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            else if(nums[j] != 0) {
                j++;
            }

        }
        System.out.println("\n");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }

    }
}
