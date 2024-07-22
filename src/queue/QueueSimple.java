package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSimple {
    public static Queue<Integer> queue = new LinkedList<>();

    public static void addElement(int num){
        queue.add(num);
    }

    public static int removeElement(){
        if(!(queue.isEmpty())){
            Integer removedElement = queue.remove();
            return removedElement;
        }
        return -1;
    }

    public static void main(String[] args) {
        addElement(2);
        addElement(2);
        addElement(1);
        int first = removeElement();
        int second = removeElement();
        int third = removeElement();
        System.out.println(first + " " + second + " " +third);
    }
}
