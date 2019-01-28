package leetcode.google;

import java.util.Arrays;

public class SquaresOfSortedArray {

    /**
     * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Example 2:
     * <p>
     * Input: [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= A.length <= 10000
     * -10000 <= A[i] <= 10000
     * A is sorted in non-decreasing order.
     */

    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int squareValueAtIndex = A[i] * A[i];
            A[i] = squareValueAtIndex;
        }
        Arrays.sort(A);
        return A;
    }
}
