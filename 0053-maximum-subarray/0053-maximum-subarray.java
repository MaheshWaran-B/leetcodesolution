class Solution { 
    public int maxSubArray(int[] nums) { 
        int sum = 0; 
        int max = nums[0]; 
        
        for (int n : nums) { 
            sum += n; 
            max = Math.max(max, sum); 
            sum = Math.max(sum, 0);   
        } 
        
        return max; 
    } 
}
