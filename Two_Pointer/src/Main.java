import ContainerWater.ContainerWithMostWater;
import isSubsequence.IsSubSequence;
import maxNumofKsum.maxOperations;
import maxNumofKsum.twoSum2;
import moveZeros.MoveZeros;
import threeSum.threeSum;
import validPalidrome.ValidPalindrome;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        MoveZeros moveZeros = new MoveZeros();
//        System.out.println("Move zeros test cases");
//        moveZeros.solution(new int[]{0, 1, 0, 3, 12});
//        moveZeros.solution(new int[]{1,0,1});

//        System.out.println("\nisSubsequence test cases");
//        IsSubSequence isSubsequence = new IsSubSequence();
//        System.out.println(isSubsequence.solution("abc", "ahbgdc"));
//        System.out.println(isSubsequence.solution("axc", "ahbgdc"));
//        System.out.println(isSubsequence.solution("b", "abc"));

        System.out.println("\nContain With Most Water test cases");
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        System.out.println(containerWithMostWater.solution(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(containerWithMostWater.solution(new int[]{8,7,2,1}));

//        System.out.println("\nMax Number of K-sum Pairs test cases");
//        maxOperations max = new maxOperations();
//        System.out.println(max.solution(new int[]{1,2,3,4},5));
//        System.out.println(max.solution(new int[]{3,1,3,4,3},6));
//        System.out.println(max.solution(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4},2));

//        System.out.println("\nTwo Sum 2 test cases");
//        twoSum2 twoSum = new twoSum2();
//        int[] result = twoSum.solution(new int[]{2,7,11,15},9);
//        for(int i: result){
//            System.out.print(i+" ");
//        }

//        System.out.println("\n Valid Palindrome test cases ");
//        ValidPalindrome validPalindrome = new ValidPalindrome();
//        System.out.println(validPalindrome.solution("A man, a plan, a canal: Panama"));
//        System.out.println(validPalindrome.solution("race a car"));
//        System.out.println(validPalindrome.solution("0P"));

//        System.out.println("\nThree Sum Test cases");
//        threeSum threeSum = new threeSum();
//        System.out.println(threeSum.solution(new int[]{-1, 0, 1, 2, -1, -4}));
//        System.out.println(threeSum.solution(new int[]{-1,0,1}));
//        System.out.println(threeSum.solution(new int[]{0,0,0}));
    }
}