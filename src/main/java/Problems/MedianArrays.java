package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MedianArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        ArrayList<Integer> arrays = new ArrayList<>();
        Arrays.stream(nums1).forEach(arrays::add);
        Arrays.stream(nums2).forEach(arrays::add);

        int c = arrays.size()/2;

        if (arrays.size()%2 ==0){
            return (arrays.stream().sorted().collect(Collectors.toList()).get(c).doubleValue()+ arrays.stream().sorted().collect(Collectors.toList()).get(c-1).doubleValue())/2;
        }else {
            return arrays.stream().sorted().collect(Collectors.toList()).get(c);
        }

    }
}
