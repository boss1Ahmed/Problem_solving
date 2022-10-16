package Problems;

import java.util.Arrays;

public class KSum {
    public long minimalKSum(int[] nums, int k){
        int[] a = new int[nums.length + k];
        int b = 0;
        for(int i =0;i<nums.length ;i++){
            if(nums[i]<a.length){
                a[nums[i]-1] = nums[i];
            }else{
                b++;
            }
        }
        long  sum = 0;
        int j = 0;
        for (int i = 0;i<a.length;i++){
            if(a[i] == 0 && j<k ){
                sum = sum + i+1;
                j++;
            }

        }
        System.out.println(".....");
        System.out.println("b: "+b);
        System.out.println( "a : " +a.length);
        System.out.println("...");
        System.out.println("nums : "+nums.length);
        System.out.println(Arrays.toString(a));
        return sum;

    }
    public long minimalKsum(int [] nums , int k){
        Arrays.sort(nums);
        int sum = 0;
        if (k<nums[0]){
            sum = k*(k-1)/2;
        }else{
            sum+= nums[0]*(nums[0]-1)/2;
        }

        k= k-nums[0]+1;
        System.out.println("sum : "+sum);


        if (k > 0) {
            for (int i = 1; i <nums.length ; i++) {
                if (nums[i] - nums[i-1] >=1){
                    for (int j = nums[i-1] +1; j <nums[i] ; j++) {
                        if (k>0){
                            sum+= j;
                            k--;
                        }else {
                            break;
                        }
                    }
                    //sum += (nums[i]*(nums[i]-1)/2) - (nums[i-1]*(nums[i-1]-1)/2);
                }
            }
        }
        for (int i = 1; i < k+1; i++) {
            sum+= nums[nums.length-1] + i;
        }


        return sum;
    }

    public int smallest(int[] nums){
        int interval = 0;
        Arrays.sort(nums);
        interval = nums[1]-nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if (Math.abs(nums[i]-nums[i+1]) < interval){
                interval = nums[i]-nums[i+1];
            }
        }
        return interval;
    }

    public int sum(int[] a , int n1, int n2){

        int sum =0;
        for (int i = n1; i <= n2 ; i++) {
            sum+=a[i];
        }
        return sum;
    }



}
