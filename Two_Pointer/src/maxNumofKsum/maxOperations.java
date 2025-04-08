package maxNumofKsum;

import java.util.Arrays;

// link to problem -> https://leetcode.com/problems/max-number-of-k-sum-pairs/description/?envType=study-plan-v2&envId=leetcode-75
public class maxOperations {

    public int solution(int[] nums, int k) {
        Arrays.sort(nums);
        int counter=0;
        int left = 0;
        int right = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[left]+nums[right]==k && left!=right){
                nums[left]=Integer.MAX_VALUE;
                nums[right]=Integer.MAX_VALUE;
                counter++;
                left++;
                right--;
            }
            else if(nums[left]+nums[right]>k){right--;}
            else {left++;}
        }
        return counter;
    }
}
