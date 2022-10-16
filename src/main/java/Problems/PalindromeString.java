package Problems;

public class PalindromeString {
    public String longestPalindrome(String s){

        String o ="";
        o= String.valueOf(s.charAt(0));


        for (int i = 0; i < s.length(); i++) {
            StringBuilder q =new StringBuilder();

            q.append(s.charAt(i));
            for (int j = i+1; j <s.length() ; j++) {
                q.append(s.charAt(j));

                if (new StringBuilder(q).reverse().toString().equals(q.toString()) && o.length()<q.length()){
                    o=String.valueOf(q);

                }
            }
        }
        return o;
    }
}
