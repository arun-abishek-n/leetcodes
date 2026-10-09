class Solution {
    public int maxFrequency(int[] nums, int k) {
      Arrays.sort(nums);
      int start=0;
      long sum=0;
      int freq=0;
      
    
    for(int end=0;end<nums.length;end++){
        sum+=nums[end];
        int len=end-start+1;
        while((long)nums[end]*(end-start+1)-sum>k){
            sum-=nums[start];
            start++;
        }
        freq=Math.max(freq,end-start+1);
    }
    return freq;
    }
}