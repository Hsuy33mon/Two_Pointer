package threeSum;

import java.util.*;

// link to problem -> https://leetcode.com/problems/3sum/description/?envType=study-plan-v2&envId=top-interview-150

public class threeSum {

    public List<List<Integer>> solution(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();
        int left = 1;
        int right = nums.length - 1;
        int k =0;
        while(k<nums.length-2){
            int sum = nums[left] + nums[right] + nums[k];
            if(sum==0 && left<right){
                result.add(Arrays.asList(nums[k], nums[left], nums[right]));
                left++;
                right--;
            }else if(sum<0 && left<right){
                left++;
            }else if(sum>0 && right<left){
                right--;
            }else{
                k++;
                left = k+1;
                right = nums.length-1;
            }
        }
//        if(nums.length==3 && nums[0]+nums[1]+nums[2]==0) return Arrays.asList(Arrays.asList(nums[0],nums[1],nums[2]));
//        Arrays.sort(nums);
//        HashSet<List<Integer>> result = new HashSet<>();
//        int left = 0;
//        int right = nums.length - 1;
//        int k =0;
//        while(k!=nums.length){
//            int sum = nums[left] + nums[right] + nums[k];
//            if(sum == 0 && left!=k && right!=k ){
//                result.add(Arrays.asList(nums[k], nums[left], nums[right]));
//                left = k;
//                right = nums.length - 1;
//                k++;
//            }else if(sum == 0 && left==k || right==k){
//                left++;
//            }
//            else if(sum<0){
//                left++;
//            }else if(sum>0){ right--;}
//            if(left==right){left=k;right=nums.length-1;k++;}
//        }

        List<List<Integer>> res = new ArrayList<>(result);
        return res;
    }
}
