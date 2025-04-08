package isSubsequence;

// link to the problem -> https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75
public class IsSubSequence {

    public boolean solution(String s, String t) {
        boolean[] checkerArray = new boolean[s.length()];
        if(s.isEmpty()){return true;}
        if(s.length() > t.length()){return false;}
        int j = 0;
        for(int i = 0; i < t.length(); i++){
            if(j < s.length()){
                if(s.charAt(j) == t.charAt(i)){
                    checkerArray[j] = true;
                    j++;
                }else {
                    checkerArray[j] = false;
                }
            }

        }
        for(boolean b : checkerArray){
            if(!b){
                return false;
            }
        }
        return true;
    }

}
