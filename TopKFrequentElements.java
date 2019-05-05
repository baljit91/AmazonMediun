//build hashmap and use heap,
//other logic is make an array of counts. and iterate im reverse order

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        //build hashmap
        HashMap<Integer,Integer> map = new HashMap();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        //build heap
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1,n2) -> map.get(n1) - map.get(n2));
        
        for(int key : map.keySet()){
            heap.add(key);
            
            if(heap.size() > k){
                heap.poll();
            }
        }
        
        //setup ans
        List<Integer> res = new ArrayList<Integer>();
        
        while(!heap.isEmpty()){
            res.add(heap.poll());
        }
        
        Collections.reverse(res);
        
        return res;
    }
}
