class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> seen = new HashSet<>();
       int res = 0;
       int len = nums.length;
       for(int i = 0;i<len;i++){
        if(seen.contains(nums[i])){
            res=nums[i];}
            else{
                seen.add(nums[i]);

            }
        } return res;

       }

       }
