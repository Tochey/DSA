package arrays.e;

public class RemoveDuplicates {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
    // TODO : Optimize if possible
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        int lsn = nums[0];
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == lsn){
                lsn = nums[i];
                continue;
            }
           nums[index] = nums[i];
            lsn = nums[i];
            index++;
            k++;
        }

        return k;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
