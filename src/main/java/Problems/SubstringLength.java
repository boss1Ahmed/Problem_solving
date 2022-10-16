package Problems;

import java.util.ArrayList;

public class SubstringLength {
    public int lengthOfLongestSubstring(String s) {
        String[] c= s.split("");

        int size = 0;
        for (int i = 0; i <c.length ; i++) {
            ArrayList<String> l = new ArrayList<>();
            l.add(c[i]);
            boolean t = true;

            for (int j = i+1; j <c.length ; j++) {
                for (int k=0;k<l.size();k++ ) {
                    if (c[j].equals(l.get(k))){
                        t=false;
                    }
                }
                if (t){
                    l.add(c[j]);
                }
            }
            if (l.size()>size){
                size=l.size();
            }

        }
        return size;
    }

}
