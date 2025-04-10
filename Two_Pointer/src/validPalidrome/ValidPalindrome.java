package validPalidrome;

public class ValidPalindrome {
    public boolean solution(String s){
        if(s.isEmpty()) return true;
        s = s.toLowerCase();
        s = s.replace(" ","");
        s = s.replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = s.length()-1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
