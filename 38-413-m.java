class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if(nums.length < 3) return 0;
        
        int prev = 0;
        int slices= 0;

        for(int i = 0; i < nums.length - 2; i++){
            if( nums[i+1] - nums[i] == nums[i+2] - nums[i+1])
            {
                prev = prev+1;
                slices = slices + prev;
            }else{
                prev = 0;
            }
        }
        
        return slices;
    }
}