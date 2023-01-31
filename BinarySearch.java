//ref: https://www.youtube.com/watch?v=tgVSkMA8joQ
public class BinarySearch {
    public static int bisect(int[] nums, int target){
        int low  = 0;
        int high = nums.length - 1;

        while(low < high){
            //compute the mid point
            int mid = (low + high)/2;
            // return mid point if target found
            if(nums[mid] == target ){
                return mid;
            }else if(nums[mid] < target){ //search right 
                low = mid + 1;
            }else{ //search left
                high = mid - 1;
            }
        }

        //do something if value not found
        return Integer.MAX_VALUE;
    }
}
