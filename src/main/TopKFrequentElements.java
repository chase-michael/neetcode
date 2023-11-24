package main;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    public int[] topKFrequentElements(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        var heap = new PriorityQueue<Integer>(new ElementsComparator());
        for (int key : map.keySet()) {
            heap.add(key);
        }

        int[] solution = new int[k];
        for (int i = 0; i < k; i++) {
            solution[i] = heap.poll();
        }

        return solution;
    }

    public class ElementsComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer n1, Integer n2) {
            return map.get(n2) - map.get(n1);
        }
    }
}
