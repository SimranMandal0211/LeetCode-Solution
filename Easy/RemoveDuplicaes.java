class Solution {
    public int RemoveDuplicates(int[] nums) {
        
        int k = nums.length;
        for(int i = 0; i < k; i++){
            for(int j = i+1; j < k; j++){
                
                if(nums[i] == nums[j]){
                    for(int x = j; x < k -1; x++){
                        nums[x] = nums[x+1];
                    }
                    k--;
                    j--;
                }
                
            }
        }
        return k;
    }
}
