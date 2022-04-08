class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 0)
            return null;                  
        for(int i = 0; i < nums.length; i++)   {
            if ((nums[i] + nums[i+1]) == target){                
                return new int[] {i, i+1};      
            } else {
                for (int j = nums.length-1; j > i; j--){
                    if ((nums[i] + nums[j]) == target){                        
                        return new int[] {i, j};
                    }
                }
            }
        }
        return null;  
    }
}