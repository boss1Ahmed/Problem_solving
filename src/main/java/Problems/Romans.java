package Problems;

import java.util.Arrays;
import java.util.HashMap;

public class Romans {
    HashMap<String,Integer> romans = new HashMap<>();
    String[] numerals = {"I","X","C","M"};
    String[] numerals2 = {"V","L","D"};
    public Romans(){
        romans.put("I",1);
        romans.put("V",5);
        romans.put("X",10);
        romans.put("L",50);
        romans.put("C",100);
        romans.put("D",500);
        romans.put("M",1000);
    }

    public int romansToInteger(String s) throws Exception{
        String[] a = s.split("");

        int sum = 0;
        boolean exception = false;
        for (int i = 0; i <a.length ; i++) {
            int next = 0;
            int current = romans.get(a[i]);
            if (!(i==a.length-1)){
                next = romans.get(a[i+1]);
            }
            if (current>=next){
                sum+= current;
                exception=false;
                if (current==next){
                    exception=true;
                }
            }else {
                if (exception){
                    throw new Exception("ach hada!!");
                }
                sum+= next-current;
                i++;
            }
        }
        return sum;
    }
    public String integerToRomans(int r) throws Exception{
       String[] stringR = String.valueOf(r).split("");
       int l = stringR.length;
       StringBuilder result = new StringBuilder("");
       int[] splittedR = new int[l];
       int current ;
        for (int i = 0; i < l; i++) {
            current = Integer.parseInt(stringR[i]);
            if (current==4){
                if (l>4){
                    result.append("MMMM");
                }else {
                    result.append(numerals[l-i-1]);
                    result.append(numerals2[l-i-1]);
                }
            }else
            if(current == 5 ) {
                result.append(numerals2[l-i-1]);
            }
            else
            if (current == 9){
                if (l>4){
                    result.append("9M");
                } else {
                    result.append(numerals[l-i-1]);
                    result.append(numerals[l-i]);
                }
            }else
            if (current<5 && current!=0){
                for (int j = 0; j < current; j++) {
                    result.append(numerals[l-i-1]);
                }
            }else
            if (current>5){
                result.append(numerals2[l-i-1]);
                for (int j = 0; j < current-5; j++) {
                    result.append(numerals[l-i-1]);
                }
            }

        }
       return result.toString();
    }
}
