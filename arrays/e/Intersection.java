package arrays.e;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/intersection-of-two-arrays/description/
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] ep = new boolean[1000];
        List<Integer> finalAns = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            if(ep[nums1[i]] != true){
                ep[nums1[i]] = true;
            }
        }

        for(int i = 0; i < nums2.length; i++){
            if(ep[nums2[i]] == true ){
                finalAns.add(nums2[i]);
                ep[nums2[i]] = false;
            }
        }

        int[] arr = new int[finalAns.size()];
 
        for (int i = 0; i < finalAns.size(); i++){
            arr[i] = finalAns.get(i);
        }

        return arr;
}
}
