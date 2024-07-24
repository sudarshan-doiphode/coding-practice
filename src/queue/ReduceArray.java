package queue;

import java.util.*;

public class ReduceArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 11, 13, 7};
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer i : arr) {
            queue.add(i);
        }

        while(queue.size()>1){
            Integer max1 = queue.remove();
            Integer max2 = queue.remove();
            queue.add(Math.abs(max1-max2));
        }

        System.out.println(queue.remove());

    }
}
