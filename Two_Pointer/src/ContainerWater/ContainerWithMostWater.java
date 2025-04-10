package ContainerWater;

// link to problem -> https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.Arrays;

public class ContainerWithMostWater {

    public int solution(int[] height) {
//      [8,7,2,1]
        int result = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int w = right-left;
            int tempArea = height[left]<height[right]?height[left]*w:height[right]*w;
            if(result<tempArea) {
                result = tempArea;
            }
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
//            if (right < left+1){
//                right= height.length-1;
//                left++;
//                if(height[left] != Arrays.stream(height).max().getAsInt()){left++;}
//                else {break;}
//            }
        }
        return result;
    }
}
