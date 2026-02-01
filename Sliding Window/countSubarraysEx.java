class CountSubarraysEx {
    public long countSubarrays(int[] nums, long k) {
        int l = 0;
        long result = 0, count = 0;
        for(int r = 0; r < nums.length; r++){
            count += nums[r];
            while(count * (r - l + 1) >= k){
                count -= nums[l];
                l++;
            }
            result += (r - l +1);
        }
        return result;
    }
} 
