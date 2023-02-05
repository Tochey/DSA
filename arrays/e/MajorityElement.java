package arrays.e;
import java.util.Arrays;

// https://leetcode.com/problems/majority-element/description/
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int n = nums.length/2;
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == t){
                n--;
                if(n < 0){
                    return t;
                }
                t = nums[i];
                continue;
            }
            n = nums.length/2;
            n--;
            t = nums[i];
        }
        return 0;
    }

    // Boyer-Moore's algorithm
    // public int majorityElement(int[] nums) {
    //     int count = 0;
    //     Integer candidate = null;

    //     for (int num : nums) {
    //         if (count == 0) {
    //             candidate = num;
    //         }
    //         count += (num == candidate) ? 1 : -1;
    //     }

    //     return candidate;
    // }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 7, 14, 14, 14, 14, 15}));;
    }
}
