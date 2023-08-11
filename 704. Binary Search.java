//https://leetcode.com/problems/binary-search/

// implement the a binary search function
// binary search -> find mid element -> if element large -> find array right part
class Solution {
    public int search(int[] nums, int target) {
        int left = 0 , right = nums.length;

        while(right > left){
            int mid = left + (right-left) / 2;
            if(nums[mid] <= target){
                left = mid+1;
            } else {
                right = mid;
            }
        }

        if(left > 0 && nums[left-1] == target){
            return left-1;
        } else {
            return -1;
        }
    }
}