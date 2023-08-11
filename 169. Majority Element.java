// https://leetcode.com/problems/majority-element/

// find the most appear element
// using hashmap to achive the tie complexity to O(1)

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }

        int max = Collections.max(map.values());
        for(Map.Entry<Integer, Integer> value: map.entrySet()){
            if(value.getValue() == max){
                return value.getKey();
            }
        }
        return 0;
    }
}