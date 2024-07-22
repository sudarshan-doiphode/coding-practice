package array.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};
        //op: [2]
        Set<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            if (!map.isEmpty()) {
                if (!map.containsKey(i)) {
                    map.put(i, 0);
                } else {
                    map.put(i, map.getOrDefault(i, 0) + 1);
                }
            } else {
                map.put(i, 0);
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (map.containsKey(b[i])) {
                set.add(b[i]);
                Integer value = map.get(b[i]);
                if (value > 0) {
                    map.replace(b[i], --value);
                } else {
                    map.remove(b[i]);
                }
            }
        }

        set.stream().sorted().forEach(System.out::println);
    }
}
