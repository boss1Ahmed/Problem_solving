package Problems;

import java.util.Arrays;

public class AddDigits {
    public int addDigits(int a){
        int[] digits= Arrays.stream(String.valueOf(a).split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i :digits
             ) {
            sum+=i;
        }
        while (String.valueOf(sum).length()!=1){
            sum = addDigits(sum);
        }
        return sum;
    }
    public int w(int sum){
        while (String.valueOf(sum).length()>1){
            addDigits(sum);
        }
        return 0;
    }
}
