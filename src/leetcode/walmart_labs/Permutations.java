package leetcode.walmart_labs;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    /**
     *
     * https://leetcode.com/problems/permutations/*/

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> partial = toList(nums);
        result.add(partial);
        for(int i = 0; i < nums.length - 1; i++){
            List<List<Integer>> r = new ArrayList<>();
            for(int j = i + 1; j < nums.length; j++){
                for(List<Integer> list : result){
                    List<Integer> element = new ArrayList<>();
                    element.addAll(list);
                    swap(element,i, j);
                    r.add(element);
                }
            }
            result.addAll(r);
        }
        return result;
    }
    private void swap(List<Integer> list, int i, int j){
        int temp = list.get(i);
        int jey = list.get(j);
        list.set(i, jey);
        list.set(j, temp);
    }

    private List<Integer> toList(int [] nums){
        List<Integer> result = new ArrayList<>();
        for(int num : nums){
            result.add(num);
        }
        return result;
    }
}
