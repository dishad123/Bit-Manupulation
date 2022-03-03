class Solution {
    public int singleNumber(int[] nums) {
        int ones=0;
        int twos=0;
        for(int i=0;i<nums.length;i++){
            ones=(ones^nums[i]) & (~twos);
            twos=(twos^nums[i]) & (~ones);
        }
        return ones;
    }
}

Input: nums = [0,1,0,1,0,1,99]
Output: 99
  
  Input: nums = [2,2,3,2]
Output: 3
