package leetcode.doordash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    /**
     * Given a collection of intervals, merge all overlapping intervals.
     *
     * Example 1:
     *
     * Input: [[1,3],[2,6],[8,10],[15,18]]
     * Output: [[1,6],[8,10],[15,18]]
     * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
     * Example 2:
     *
     * Input: [[1,4],[4,5]]
     * Output: [[1,5]]
     * Explanation: Intervals [1,4] and [4,5] are considerred overlapping.*/

     public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }


        public List<Interval> merge(List<Interval> intervals) {
            Collections.sort(intervals, new Comparator<Interval>(){
                public int compare(Interval l1, Interval l2){
                    if(l1.start == l2.start){
                        return Integer.compare(l1.end, l2.end);
                    }
                    return Integer.compare(l1.start, l2.start);
                }
            });

            List<Interval> result = new ArrayList<>();
            if(intervals.size() > 0){
                result.add(intervals.get(0));
            }
            for(int i = 1; i < intervals.size(); i++){
                Interval last = result.get(result.size() - 1);
                Interval current = intervals.get(i);

                if(last.end >= current.start){
                    if(last.end >= current.end){
                        continue;
                    }
                    last.end = current.end;
                    result.set(result.size()-1,last);
                }
                else{
                    result.add(current);
                }
            }


            return result;
        }
}
