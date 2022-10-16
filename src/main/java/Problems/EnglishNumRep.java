package Problems;

import java.util.Arrays;
import java.util.HashMap;

public class EnglishNumRep {
    private StringBuilder result = new StringBuilder("");
    public String intToString(int a){
        String[] f = {"One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine "};
        String[] s = {"Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
        String[] t = {"Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};

        StringBuilder stringA = new StringBuilder(String.valueOf(a));
        while (stringA.length()<3){
            stringA.insert(0, "0");
        }
        for (int i = 0; i <stringA.length() ; i++) {
            char current = stringA.charAt(i);
            int intcu = Integer.parseInt(String.valueOf(current));
            if (!String.valueOf(current).equals("0") ){
                if (i==0 ){
                    System.out.print(f[intcu-1] + " "+ "Hundred ");
                    result.append(f[intcu - 1]).append(" ").append("Hundred ");
                }else
                    if (Integer.parseInt(stringA.substring(i))<20 && i==1){
                        int pos = Integer.parseInt(String.valueOf(stringA.charAt(stringA.length()-1)));
                        System.out.println(s[pos]);
                        result.append(s[pos]);
                        break;
                    }else
                    if (i==1){
                        System.out.print(t[intcu -2]);
                        result.append(t[intcu -2]);
                    }else if (i==2){
                        System.out.print(f[intcu-1]);
                        result.append(f[intcu-1]);
                    }
            }

        }
        return null;
    }
    public String f(Integer a){
        String[] e = {"Billion ","Million ","Thousand "};
        StringBuilder s = new StringBuilder(String.valueOf(a));
        while (s.length()<12){
            s.insert(0,"0");
        }
        String s1 = String.valueOf(s);

        String[] q = s1.split("(?<=\\G.{3})");
        int[] q1 =  Arrays.stream(q).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < 4; i++) {
            this.intToString(q1[i]);
            if (q1[i]!=0 && i<3){
                System.out.print(e[i]);
                result.append(e[i]);
            }
        }

        return result.toString();
    }
}
