package Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {
    public int[] twosum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j!=i && nums[i]+ nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }

       return null;
    }
}
