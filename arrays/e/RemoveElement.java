package arrays.e;

public class RemoveElement {
    // https://leetcode.com/problems/remove-element/description/
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
                k++;
            }

        }
        return k;
    }
}
