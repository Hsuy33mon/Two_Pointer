package maxNumofKsum;

//  link to leet code problem -> https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/1600717776/?envType=study-plan-v2&envId=top-interview-150
public class twoSum2 {
    public int[] solution(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                result[0]=left+1;
                result[1]=right+1;
                left++;
                right--;
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return result;
    }
}
