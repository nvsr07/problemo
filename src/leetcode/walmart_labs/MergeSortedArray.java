package leetcode.walmart_labs;

public class MergeSortedArray {

    /**
     * https://leetcode.com/problems/merge-sorted-array/*/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] result = new int[m+n];
        int i = 0;
        int j = 0;
        int counter = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                result[counter++] = nums1[i];
                i++;
            }else{
                result[counter++] = nums2[j];
                j++;
            }
        }
        while(i < m){
            result[counter++] = nums1[i];
            i++;
        }
        while( j < n){
            result[counter++] = nums2[j];
            j++;
        }
        for(int a = 0; a < nums1.length; a++){
            nums1[a] = result[a];
        }

    }
}
