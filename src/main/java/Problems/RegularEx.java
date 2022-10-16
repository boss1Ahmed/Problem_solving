package Problems;

public class RegularEx {
    public boolean isMatch(String s, String p) {

        if (p.length() == 0 && s.length()!= 0){
            return false;
        }

        boolean t = false;
        for (int i = 0; i <s.length() ; i++) {
            char f = '0';
            if ( i >= (p.length()-1) && p.charAt(p.length()-1) == '*'){
                f = '*';
            }
            char cp = p.length()-1 >=i ? p.charAt(i) : f;
            if (s.charAt(i)==cp ||  cp == '.'){
                t=true;
            }else{
                if ((i>0 &&  cp == '*' && p.charAt(p.length()-2) == '.') || (i>0 &&  cp == '*' && p.charAt(p.length()-2) == s.charAt(i)  ) ){
                    t=true;
                }else
                {
                    t=false;
                }
            }

        }
        if (s.length()<p.length() &&  p.charAt(p.length()-1) == '.'){
            t=false;
        }
        return t;
    }
}
