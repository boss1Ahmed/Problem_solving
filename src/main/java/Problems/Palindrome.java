package Problems;

public class Palindrome {
    public boolean isPalindrome(int a){
        if (a<0){
            return false;
        }else {
            String r =new StringBuilder(String.valueOf(a)).reverse().toString();
            return r.equals(String.valueOf(a));
        }



    }
}
