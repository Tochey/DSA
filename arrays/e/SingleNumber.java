package arrays.e;

import java.util.Arrays;

class Pair {
     int index1;
     int index2;

     public Pair(int index1, int index2) {
         this.index1 = index1;
         this.index2 = index2;
     }
 }
 
class SingleNumber {
 
     public static int singleNumber(int[] nums) {
         if (nums.length == 1) {
             return nums[0];
         }
         Arrays.sort(nums);
         int lb = 0;
 
         for (int i = 0; i < nums.length/2; i++) {
             if(i == nums.length - 1){
                 return nums[nums.length-1];
             }
             Pair p = new Pair(nums[lb], nums[lb + 1]);
             if (p.index1 != p.index2) {
                 return p.index1;
             }
 
             lb = lb + 2;
         }
         return nums[nums.length - 1];
 }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] { 1, 2, 2 }));
    }
}



