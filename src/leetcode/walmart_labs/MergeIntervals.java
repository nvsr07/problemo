package leetcode.walmart_labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    /**
     * https://leetcode.com/problems/merge-intervals/
     */

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval l1, Interval l2) {
                if (l1.start == l2.start) {
                    return Integer.compare(l1.end, l2.end);
                }
                return Integer.compare(l1.start, l2.start);
            }
        });

        List<Interval> result = new ArrayList<>();
        if (intervals.size() > 0) {
            result.add(intervals.get(0));
        }
        for (int i = 1; i < intervals.size(); i++) {
            Interval last = result.get(result.size() - 1);
            Interval current = intervals.get(i);

            if (last.end >= current.start) {
                if (last.end >= current.end) {
                    continue;
                }
                last.end = current.end;
                result.set(result.size() - 1, last);
            } else {
                result.add(current);
            }
        }


        return result;
    }
}
