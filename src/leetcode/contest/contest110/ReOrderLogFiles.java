package leetcode.contest.contest110;

import java.util.Arrays;
import java.util.Comparator;

public class ReOrderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] arg1 = o1.split(" ");
                String[] arg2 = o2.split(" ");
                return compareEL(arg1, arg2);
            }
        });
        return logs;
    }

    int compareEL(String[] arg1, String[] arg2) {
        char element = arg1[1].charAt(0);
        char element2 = arg2[1].charAt(0);
        if (isDigit(element) && isDigit(element2)) {
            return 0;
        } else if (isDigit(element)) {
            return 1;
        } else if (isDigit(element2)) {
            return -1;
        }
        for (int i = 1; i < Math.max(arg1.length, arg2.length); i++) {
            if (arg1[i].compareTo(arg2[i]) != 0) {
                return arg1[i].compareTo(arg2[i]);
            }
        }
        return arg1[0].compareTo(arg2[0]);
    }

    boolean isDigit(char element) {
        return Character.isDigit(element);
    }
}
