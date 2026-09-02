import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
                Map.Entry.comparingByValue()
        );

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] res = new int[k];
        for(int i = 0; i<k; i++){
            res[i] = pq.poll().getKey();
        }
        return res;
    }
}